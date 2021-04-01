fun main() {
    modulus()
    name()
    words()
    sentence()
    place()
    you()
    Array()




}
//modulus as operators
fun modulus(){
    var num1=80
    var num2=40
    var modulus =(80%60)
    println(modulus)
}
//strings
fun name(){
    val x="My name is"
    val name="Name"
    println(x +" " + name)
}
//String indexing
fun words(){
    val text="way"
    print(text[0])
    print(text[1])
    println(text[2])
}
//String interpolation
fun sentence(){
    val name="jey"
    val year="2000"
    val sentence="$name was born in $year"
    println(sentence)
}
//Array
fun place(){
    var country=arrayOf("Uganda",400,0.35,false)
    println(country[2])
}
//get element to a certain index
fun you(){
    var nameArray=arrayOf("Judith","Cate","Ann","Purity","Nyc")
    var name=nameArray.get(2)
    println(name)
}
//sorting Array
fun Array() {
    var numArray = arrayOf(10, 14, 32, 2, 75, 8)
    var numElements = numArray.count()
    println(numElements)
    //8
    var sumElements=numArray.sum()
  println(sumElements)
    //190
    var minValue=numArray.min()
    println(minValue)
//2
    var maxValue=numArray.max()
    println(maxValue)
    //75

}



