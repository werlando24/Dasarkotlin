fun main() {
    var counter: Int = 0
    var name:String ="zaki"
    val lambdaIncrement:() -> Unit ={
        println("Lambda Increment")
        counter++
    }
    val anonymousIncrement:() -> Unit ={
        println("Anonymous Increment")
        counter++

    }
    fun functionIncrement(){
        println("Function Increment")
        counter++
    }

    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()

    println(counter)
}