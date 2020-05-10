@Grapes([
	@Grab(
		group='org.codehaus.groovy.modules.http-builder',
		module='http-builder',
		version='0.6' )
	])
import groovyx.net.http.RESTClient

def file = new File('../data/fells_loop.gpx')
println file.exists()

def slurper = new XmlSlurper()
def gpx = slurper.parse(file)
// println gpx.name
// println ""
// println gpx.desc
// println ""
// println gpx.@version
// println ""
// println gpx.@creator
// println ""
// println gpx.rte.rtept.@lat
// println ""


gpx.with{
    println name
    println ''
    println desc
    println  ''
    println attributes()['version']
    println ''
    println attributes()['creator']
}

def client = new RESTClient('https://postman-echo.com/')
def credentialsFile = new File('credentials.groovy')
def configSlurper = new ConfigSlurper()
def credentials = configSlurper.parse(credentialsFile.toURL())

println credentials.apiKey

// for (element in gpx.rte.rtept) {
//     println  element.@lat
//     println element.@lon
//     println element.time
// }
gpx.rte.rtept.each{
    it ->
    println it.@lat
    println it.@lon
    
    def parser = new DateParser()
	println parser.parse(it.time.toString())

	def queryString = "get"
	def response = client.get(path: queryString, headers: ["x-rapidapi-host": "weather2020-weather-v1.p.rapidapi.com",
		"x-rapidapi-key": "b29f03eb48msha0b7b3b5c250ea7p1e9bf3jsn9827e2ac3b14"])

	println "${response.data.headers.host}"
    println "${response.json?.headers?.host}"
	//println "${response.data.currently.temperature} degrees"
    
}