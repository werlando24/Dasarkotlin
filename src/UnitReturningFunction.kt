//fun printHello(){
//    println("hello")
//}
//
//fun main() {
//    printHello()
//}

fun printHello(name: String?): Unit{
    if (name == null){
        println("Hello Bro")
    }else {
        println("Hello $name")
    }
}
fun main() {
    printHello(name = "Zaki")
}