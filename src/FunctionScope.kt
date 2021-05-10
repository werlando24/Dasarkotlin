////fun hiWorld(){
//
//}
//fun satu (){
//    hiWorld()
//}
//fun dua (){
//    hiWorld()
//}
//
//fun main() {
//    fun hiWorld(){
//
//    }
//}
//fun String.hello(): String {
//    return "Hello $this"
//
//}
//fun main() {
//    val name: String = "Zaki"
//    val hello: String = name.hello()
//}
//
//infix fun String.to(type: String): String {
//    if (type == "Up")
//        return.this.toUpperCase()
//    } else {
//    return.this.toLowerCase()
//    }
//
//fun main() {
//    val result: String = "Zakiri" to "Up"
//
//
//}
//
//data class Mahasiswa(
//    val nama : String,
//    val jurusan : String,
//
//    )
//
//fun main() {
//
//    val mahasiswa = Mahasiswa(nama = "adit" ,jurusan = "teknik Informatika")
//
//    /**
//     * Penggunaan let
//     */
//    mahasiswa.let { it ->
//        val text = "Nama saya ${it.nama}, Jurusan saya ${it.jurusan}"
//        println(text)
//    }
//
///*
//   output : Nama saya adit, Jurusan saya teknik Informatika
//*/
//
//}

    data class Mahasiswa(
        var nim : Int?,
        var nama : String?,
        var jurusan : String?,
        var alamat : String?
    )

    fun main() {

        val mahasiswa : Mahasiswa? = null


         //Contoh penggunaan apply

        mahasiswa?.apply {
            nim = 1811500584
            nama = "Aditiya Prayogo"
            jurusan = "teknik Informatika"
            alamat = "Jln komp ddn nomor 50"
        }

    }