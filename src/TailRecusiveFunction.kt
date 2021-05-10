//fun main() {
//    tailrec fun display(value: Int){
//        println("Recusive $value")
//        if(value > 0){
//            display(value-1)
//        }
//    }
//    display(10000) // stackoverflow
////
//    tailrec fun factorialrecursive(value: Int, total: Long=1): Long{
//        return when (value){
//            1 -> total
//            else -> factorialrecursive(value-1, total*value)
//        }
//    }
//    println(factorialrecursive(60))
//}
