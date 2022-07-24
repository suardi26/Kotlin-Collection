/**
    - Map (dictionary) adalah collection yang berbentuk key-value, dimana key berperan sebagai index.
    - Key harus unik, jika kita menggunakan Key yang sama, maka data sebelumnya akan di replace oleh data yang baru.
    - Type data key dapat menggunakan tipe data apapun sesuai yang kita inginkan.
    - Pada saat membuat data Map maka kita akan memasukan data dalam bentuk Pair namun nanti ketika jadi di dalam Map
      maka data-nya akan menjadi entry.
    - Entry adalah interface yang isi-nya Key dan value.
    - Untuk Mengambil semua key/value dari Map dapat memanggil variable entries yang ada pada interface Map.
           contoh :  println(map.entries)
    - Data key dari Map return value-nya adalah Set artinya unik tidak boleh sama.
    - Data value dari Map return value-nya adalah Collection yang artinya boleh duplikat/sama.
    - Kita dapat memanggil semua key/value dari interface entry yang ada pada Map dengan menggunakan perulangan 'for'.
    - Data entry key/value dapat ditampung melalui Destructuring declaration.
        contoh :                    for (data in map){
                                        println("key : ${data.key}, value : ${data.value}")
                                    }
        Destructuring declaration : for((key, value) in map){
                                        println("key : $key, value : $value")
                                    }
    MutableMap
    - Interface Map secara default adalah immutable Map.
    - Terdapat juga interface MutableMap untuk menampungg data-data dan dapat dimanipulasi.
    - Interface MutableMap adalah turunan dari interface Map, sehingga function-function yang terdapat pada Map
      dapat juga digunakan pada MutableMap.
    - Data key dari Map return value-nya adalah MutableSet artinya unik tidak boleh sama tapi bisa diubah-ubah.
    - Data value dari Map return value-nya adalah MutableCollection yang artinya boleh duplikat/sama.
    - Untuk Mengambil semua key/value dari MutableMap dapat memanggil variable entries yang ada pada interface MutableMap.
        contoh :  println(mutableMap.entries)
    - Kita dapat memanggil semua key/value dari interface MutableEntry yang ada pada Mutable Map dengan menggunakan
      perulangan 'for'.
    - Data MutableEntry key/value dapat ditampung melalui Destructuring declaration.
 */

fun main() {

    // Membuat data Map dengan data class Pair dan memasukan data key dan value.
        val map: Map<String, String> = mapOf(
            "a1" to "Monkey",
            Pair("b1","Dog"),
            "c1" to "Cat"
        )

        // memanggil function size dari interface Map untuk melihat jumlah data dari struktur data Map.
        println(map.size)

        // Mengambil value/element Map berdasarkan key.
        println(map["a1"])
        println(map.get("a2"))
        println(map["a3"])
        println("= = = = = = = = = = = =")

        // Mengambil key dari Map yang return value-nya adalah Set artinya unik tidak boleh sama.
        println(map.keys)

        // Mengambil value dari Map yang return value-nya adalah Collection yang artinya boleh duplikat/sama.
        println(map.values)
        println("= = = = = = = = = = = =")

        // Mengambil semua key/value dari Map dapat memanggil variable entries yang ada pada interface Map.
        println(map.entries)
        println("= = = = = = = = = = = =")

        // Memanggil semua key/value dari interface entry yang ada pada Map dengan menggunakan perulangan 'for'.
        // data adalah data entry key/value.
        for (data in map){
            println("key : ${data.key}, value : ${data.value}")
        }
        println("= = = = = = = = = = = =")

        // Memanggil semua key/value dari interface entry yang ada pada Map dengan menggunakan perulangan 'for'.
        // (key, value) adalah data entry key/value yang ditampung melalui Destructuring declaration.
        for((key, value) in map){
            println("key : $key, value : $value")
        }

    // Membuat data MutableMap dengan data class Pair dan memasukan data key dan value.
        // Pada saat pembuatan object-nya element/value dari MutableMap dapat dikosongkan terlebih dahulu dan
        // dapat ditambahkan nanti karena isi-nya dapat berubah-ubah.
        val mutableMap: MutableMap<String, String> = mutableMapOf()

        // Memanggil function put() dari interface MutableMap yang digunakan untuk manambahkan value/element.
        // atau dapat menambahkan key/value dengan langsung mengisi key dan juga value dari data map-nya.
        println("= = = MutableMap = = = ")
        mutableMap.put(key = "a1", value = "Downy")
        mutableMap["a2"] = "Rinso"
        mutableMap["a3"] = "Molto"

        // Mengambil value/element Map berdasarkan key.
        println(mutableMap["a1"])
        println(mutableMap.get("a2"))
        println(mutableMap["a3"])
        println(mutableMap["a4"]) // hasilnya null.

        // Mengambil value dari MutableMap berdasarkan key namun ketika value dari key-nya tidak ada maka akan mengembalikan
        // default value dengan menggunakan function getOrDefault() dari interface MutableMap.
        println(mutableMap.getOrDefault("a5", "Maaf value tidak ada !!!!!"))
        println("= = = = = = = = = = = =")

        // Mengambil key dari MutableMap yang return value-nya adalah MutableSet artinya unik tidak boleh sama.
        println(mutableMap.keys)

        // Mengambil value dari MutableMap yang return value-nya adalah MutableCollection yang artinya boleh duplikat/sama.
        println(mutableMap.values)
        println("= = = = = = = = = = = =")

        // Mengambil semua key/value dari MutableMap dapat memanggil variable entries yang ada pada interface MutableMap.
        println(mutableMap.entries)

        // Menghapus data dengan key 'a3' dengan menggunakan function remove pada interface MutableMap.
        println("Menghapus data dengan key 'a3' !!!! ")
        mutableMap.remove("a3")

        // Memanggil semua key/value dari interface MutableEntry yang ada pada MutableMap dengan menggunakan
        // perulangan 'for'.
        for (data in mutableMap){
            println("key : ${data.key}, value : ${data.value}")
        }
        println("= = = = = = = = = = = =")

        // Mencoba menambahkan data 'Dove' dengan value yang sudah ada yaitu key a2, maka value dari key a2
        // akan diganti dari 'Rinso' ke 'Dove'
        mutableMap["a2"] = "Dove"

        // Merubah data menggunakan function replace dari interface MutableMap.
        mutableMap.replace("a1",  "Downy",  "Biore" )

        // Memanggil semua key/value dari interface MutableEntry yang ada pada MutableMap dengan menggunakan perulangan 'for'.
        // (key, value) adalah data MutableEntry key/value yang ditampung melalui Destructuring declaration.
        for ((key,value) in mutableMap){
            println("key : $key, value : $value")
        }


}