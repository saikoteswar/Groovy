def beatles = ["Sai","Ko","Collections"]
def greeting = "Hello"

for (int i =0 ;i < beatles.size(); i++) {

    println( "$greeting "+"${beatles[i]}")
    println("${i*10}")
}

for (beatle in beatles) {
    
    println("$beatle")
}