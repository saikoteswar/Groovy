def numbers = 0..9
for (element in numbers) {
    
    if(isEven(element)){
        println element 
    }
}

def isEven(num){
    num%2 == 0
}