/*def myClosure = {
    println   " In my Closure"
    println new Date()
    }

for (i in 1..3) {
    myClosure()
    sleep(1000)
}
*/

/*
(1..4).each( i ->
    println "in a closure " + "$i"
)
*/
//To print the even values
(1..10).findAll{i ->  i%2==0}.each(i -> println "$i" +" is even")

