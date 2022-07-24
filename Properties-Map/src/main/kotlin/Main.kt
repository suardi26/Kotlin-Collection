/**
    Properties pada Map
    - Salah satu hal yang dilakukan dalam mebuat program adalah, menyimpan value properties pada Map.
    - Kadang ini dilakukan ketika parsing data JSON atau hal-hal dinamis lainnya.
    - Dalam keadaan seperti ini, kita dapat melakukan delegate properties pada Map.
    - Ketika melakukan delegate properties tidak boleh memasukan data yang tidak ada sehingga tidak error.
    - jadi kita dapat parsing data Json ke dalam Map dan setelah itu dikonversi lagi pada object class.
 */

class Application(map: Map<String, Any>) {
    // Melakukan delegate value properties pada object Map yang diisi pada constructor.
    // dimana key-nya 'name' dan 'version'
    val name: String by map
    val version: Int by map
    // val makan: String by map // error :  Key makan is missing in the map
}

fun main(){
    val application: Application = Application(mapOf(
        // memasukan key sesuai dengan nama properties.
        "name" to "Kotlin Android",
        //"ver" to 34 // error : Key version is missing in the map
        "version" to 1
    ))

    println(application.name)
    println(application.version)
    // println(application.makan) // error :  Key makan is missing in the map
}