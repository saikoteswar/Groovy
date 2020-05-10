def file = new File("../data/fells_loop.gpx")
def slurper = new XmlSlurper()
def gpx = slurper.parse(file)


def markerBuilder = new groovy.xml.StreamingMarkupBuilder()
def xml = markerBuilder.bind{
    mkp.comment(gpx.name)
    route{
        gpx.rte.rtept.each{
            i ->
            
            routepoint(timestamp: i.time.toString()){
                
                latitude(i.@lat)
                longitude(i.@lon)
            }
        }
    }
}

def outFile = new File("../data/fells_loop_truncate.xml")
outFile.write(xml.toString())


