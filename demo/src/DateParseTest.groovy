@Grab(group='joda-time', module='joda-time', version='2.10.5')
import org.joda.time.DateTime
import org.joda.time.format.DateTimeFormat

class DateParseTest extends GroovyTestCase{
    private DateParser dateParser

    def void setUp(){
       dateParser = new DateParser()
    }

    def void testParse(){
        
        def dateTime = new DateTime(2020,05,01,17,10)

        def printableTime = dateParser.parse(dateTime.toString())
        assert '05/01/2020 - 05:10 PM' == printableTime
    }

    def void testShouldThrowAnErrorWhenNullIsProvided(){
       
        shouldFail(IllegalArgumentException) {
            dateParser.parse(null)
        }
    }

}