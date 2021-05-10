import java.lang.instrument.ClassFileTransformer

fun main() {
    fun hello(name:String, transformer: (String) -> String): String{
        val nameTransformer = transformer(name)
        return "Hello $nameTransformer"

    }
    val upper = fun(value: String):String{
        if(value == ""){
            return "ups"
        }else{
            return  value.toUpperCase()
        }
    }
    println(hello("zaki", upper))
}