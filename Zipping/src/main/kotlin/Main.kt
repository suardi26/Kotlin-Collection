/**
    Transformations : Zipping
    - Zipping adalah transformasi yang digunakan untuk menggabungkan dua buah collection.
    - Zipping digunakan untuk melakukan penggabungan kedua buah data collection dengan cara penggabungan satu per
      satu data dari kedua data collection, dan bukan berarti data-nya disambung seperti data A berjumlah 2
      dan data B berjumlah 2 maka digabungkan menjadi Data C berjumlah 4, tidak seperti itu.

            contoh : val list1: List<String> = listOf<String>("Suardi", "Daud", "Manda")
                     val list2 = listOf("First", "Mid", "Last")
                     val list3: List<String> = list1.zip(list2) { value1, value2 -> value1 + value2 }

            hasil  : '[SuardiFirst, DaudMid, MandaLast]'

    - Dan ketika terdapat 2 buah data collection yang tidak sama jumlahnya misalnya List A berjumlah 2 dan List B
      berjumlah 4 maka yang akan di-zip adalah jumlah minimal data dari kedua buah collection yaitu 2.

           contoh :  val list1: List<String> = listOf<String>("Suardi", "Daud", "Manda")
                     val list2 = listOf("First", "Mid", "Last", "Ket", "Info")
                     val list3: List<String> = list1.zip(list2) { value1, value2 -> value1 + value2 }

            hasil  : '[SuardiFirst, DaudMid, MandaLast]'

    - Selain Zipping Operations terdapat juga Unzip Operations dimana digunakan untuk Membagi setiap data collection
      Pair<T1, T2> menjadi 2 collection, collection T1 dan collection T2.
    - Function unzip() adalah extension function dari interface 'Iterable<Pair<T,R>>' dan mengembalikan data Pair
      sehingga untuk menggunakan function ini harus membagi data dari data class Pair.
    - Karena Pair adalah data Class maka dapat dilakukan destructuring declaration.
    Zipping Operations
         = zip (collection)             => Menggabungkan dua collection, sehingga menghasilkan Pair<T1, T2>
         = zip (collection, transform : (T1, T2) -> R) => Menggabungkan 2 buah collection dengan lambda transform
                                                          sehingga menghasilkan collection baru dari result lambda
                                                          transform.

    Unzip Operations
        = unzip()                       => Mengubah collection Pair<T1, T2> menjadi 2 collection, collection T1
                                           dan collection T2
 */

fun main() {
    // Zipping Operations
        val list1: List<String> = listOf<String>("Suardi", "Daud", "Manda")
        val list2 = listOf("First", "Mid", "Last")

        // menggabungkan 2 data collection, dan menghasilkan Data Pair<T1,T2> menggunakan function zip(collection).
        val list3: List<Pair<String, String>> = list1.zip(list2)
        println(list3)
        println("= = = = = = =")

        // Menggabungkan 2 data collection, dan menghasilkan collection baru, menggunakan
        // function zip(collection, transform: (T1, T2) -> R).
        val list4: List<String> = list1.zip(list2) { value1, value2 -> value1 + value2 }
        println(list4)
        println("= = = = = = =")

    // Unzip Operations
        val list: List<Pair<String, String>> = listOf(
            "Suardi" to "First",
            "Daud"   to "Mid",
            "Manda"  to "Last"
        )
        println(list)
        println("= = = = = = =")

        // Mengubah collection Pair<T1, T2> menjadi 2 collection, collection T1 dan collection T2
        val pair: Pair<List<String>, List<String>> = list.unzip()
        println(pair.first)
        println(pair.second)
        println(pair)
        println("= = = = = = =")

        // destructuring declaration dari data class Pair.
        val (listA, listB) = list.unzip()
        println(listA)
        println(listB)
        println("= = = = = = =")
}