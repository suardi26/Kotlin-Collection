/**
    - Pada Kotlin kita dapat mengambil satu element pada collection menggunakan  posisi.
    - Mungkin pada Data List dapat menggunakan index, namun pada data Set tidak memiliki function untuk mengambil data
      melalui posisi data tersebut.
    - Namun Dengan Retrive Single Element kita dapat mengambil satu element pada collection dan turunan-nya.
    - Ada beberapa extension function yang dapat digunakan untuk Retrive Single Element.
    - Namun perlu diperhatikan bahwa function untuk Retrive Single Element harus digunakan secara bijak, karena prosees-nya
      dilakukan dengan perulangan dari data awal sampai data yang kita ambil, dan kalau misal kita mengambil data yang ke
      2000 maka prosesnya akan sangat lambat.
    Retrieve Single Element Operator
     => elementAt(index)                => Untuk mengambil element pada posisi Index.
     => first()                         => Untuk mengambil element pertama.
     => last()                          => Untuk mengambil element terakhir.
     => elementAtOrNull(index)          => Untuk mengambil element pada posisi index. Jika tidak ada index maka
                                           return value-nya adalah null .
     => elementAtOrElse(index, defaultValue) => Untuk mengambil element pada posisi index. Jika tidak ada index maka
                                                return value-nya adalah defaultValue.
 */

fun main() {
    val set: Set<String> = setOf("Andi", "Berta", "Citra", "Dodo")
    println(set)

    // Function elementAt(index)
        val name1: String = set.elementAt(2)
        println("Data Yang Ketiga : $name1")

    // Function first(index)
        val name2: String = set.first()
        println("Data Yang Pertama : $name2")

    // Function last(index)
        val name3: String = set.last()
        println("Data Yang Terakhir : $name3")

    // Function elementAtOrNull(index)
        val name4: String? = set.elementAtOrNull(4)
        println("Jumlah data adalah 4, maka Nilai dari index ke-5 : $name4 ")

    // Function elementAtOrElse(index)
        val name5: String = set.elementAtOrElse(4){value -> "Mohon Maaf ${value+1} tidak ada !!! "}
        println("Jumlah data adalah 4, Maka Nilai dari index ke-5 diisi oleh Default Value : $name5")
}