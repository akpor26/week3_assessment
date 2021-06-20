fun rev(sentence: String): String{
    if(sentence.isEmpty())
        return sentence
    return  rev(sentence.substring(1)) + sentence[0]
}

fun main(){
    var sentence = "Good Food"
    var rev2 = rev(sentence)
    println("Original Statement is : $sentence")
    println("Reversed Statement is: $rev2")
}