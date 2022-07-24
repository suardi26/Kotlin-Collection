/**
     - List adalah collection yang datanya seperti Array dan Untuk mengakses ataupun mengubah data-nya dapat menggunakan
       Index.
     - Data pada List boleh duplicate, artinya kita boleh memasukan data yang sama berkali-kali ke dalam sebuah List
       yang sama.
     - List seperti Array namun yang membedakan yaitu List jumlah nilainya dinamis dapat berubah-ubah sesuai
       dengan kebutuhan sedangkan array jumlah nilainya tetap sesuai pada saat pembuatan object atau pada saat pemberian
       nilai pertama (Assignment).
     - Interface List secara default adalah immutable List.
     - Terdapat juga interface MutableList untuk menampung data-data dan dapat dimanipulasi.
     - Interface MutableList adalah turunan dari interface List, sehingga function-function yang terdapat pada List
       dapat juga digunakan untuk MutableList.

 */
fun main() {

    // Contoh pembuatan List
        val list: List<String> = listOf("Suardi", "Daud", "Manda")

        // mengambil nilai List dengan menggunakan index.
        println(list[0])
        println(list.get(1))
        println(list[2])

        // Memanggil function isEmpty() dari interface List yang digunakan untuk mengecek data list apakah kosong.
        println("apakah data list kosong ? = ${list.isEmpty()}")

        // Memanggil extension function isNotEmpty() dari interface Collection yang digunakan untuk mengecek data list apakah
        // tidak kosong.
        println("apakah data list tidak kosong ? = ${list.isNotEmpty()}")

        // Memanggil function indexOf() dari interface List yang digunakan untuk mengecek value/element, terdapat pada
        // index keberapa ?, ketika mengecek element/value yang tidak ada maka retrun value-nya adalah -1.
        var name : String = "Daud"
        println("value/element '$name' terdapat pada index ke${list.indexOf(name)}'")
        println("value/element 'Google' terdapat pada index ke${list.indexOf("Google")}'")

        // Memanggil function contains() dari interface List yang digunakan untuk mengecek value/element, apakah terdapat
        // dalam sebuah data List.
        println("Apakah value/element '$name' terdapat pada data list ? = ${list.contains(name)}")

        // Memanggil function containsAll() dari interface List yang digunakan untuk mengecek beberapa value/element, apakah
        // terdapat dalam sebuah data List.
        var name1: String = "Manda"
        println("Apakah value/element '$name' dan '$name1' terdapat pada data list ? = " +
                "${list.containsAll(listOf(name,name1))}")
        println("= = = = = = = =")


    // Contoh pembuatan MutableList
        // Pada saat pembuatan object-nya element/value dari MutableList dapat dikosongkan terlebih dahulu dan
        // dapat ditambahkan nanti karena isi-nya dapat berubah-ubah.
        val mutableList: MutableList<String> = mutableListOf()

        // Memanggil function add() dari interface MutableList yang digunakan untuk manambahkan value/element.
        mutableList.add("Beng-Beng")
        mutableList.add("Oreo")
        mutableList.add("Lays")

        // mengambil nilai MutableList dengan menggunakan index.
        println(mutableList[0])
        println(mutableList[1])
        println(mutableList[2])
        println("= = = = = = = =")

        // Memanggil function isEmpty() dari interface MutableList yang digunakan untuk mengecek data MutableList
        // apakah kosong.
        println(mutableList.isEmpty())
        println("= = = = = = = =")

        // Memanggil function set() dari interface MutableList yang digunakan untuk mengubah value/element.
        mutableList.set(0, "Taro")

        // Mengubah value/element MutableList dengan cara langsung memasukan value baru ke index data-nya.
        mutableList[1] = "Monde"

        // mengambil nilai MutableList dengan menggunakan index.
        println(mutableList[0])
        println(mutableList[1])
        println(mutableList[2])
        println("= = = = = = = =")

        // Memanggil function remove() dari interface MutableList yang digunakan untuk menghapus value/element.
        mutableList.remove("Monde")

        // Memanggil semua value/element dari MutableList dengan menggunakan perulangan 'for'.
        for (value in mutableList){
            println(value)
        }
}