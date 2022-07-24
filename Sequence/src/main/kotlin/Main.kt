/**
    - Selain List, Set dan Map, pada Kotlin juga terdapat collection yang bernama Sequence.
    - Sequence sekilas sama dengan collection lain, namun berbeda cara kerjanya ketika kita menambahkan banyak operasi
      ke sequence.
    - Collection lain, ketika kita menambahkan beberapa operasi, semua akan dieksekusi secara eager, setiap proses akan
      mengembalikan collection baru.
    - Berbeda dengan sequence, sequence mengeksekusi semua operasi secara lazy artinya hanya akan dieksekusi ketika
      dibutuhkan.

    - Menggunakan Sequence Ketika                             Jangan menggunakan sequence Ketika
      => Data collection besar                             => Data collection tidak terlalu besar, karena ada
                                                              overhead lazy object pada Sequence. Di sequence akan
                                                              ditumpuk-tumpuk operasi-nya pada Sequence, sehingga
                                                              semua operasinya ada overheadnya. sehingga ketika
                                                              operasinya besar dan datanya kecil lebih baik menggunakan
                                                              collection.
      => Operasi collection kompleks & banyak              => Operasi yang dilakukan sederhana.

 */

fun main() {
    // contoh collection (List) "eager".
        val words: List <String> = "The quick brown fox jumps over the lazy dog".split(" ")
        val result: List<String> = words
             // mengambil value yang panjang character-nya 3
            .filter{ value -> value
                println("filter $value")
                value.length > 3
            }
            // mengubah data dari String lowwercase ke String uppercase.
            .map {
                println("map  $it")
                it.uppercase()
            }
            .take(4)

        println(result)
        println("= = = = = = = = = = =")

    // contoh Sequence "lazy"
    val words1: List <String> = "The quick brown fox jumps over the lazy dog".split(" ")
        // Mengubah data list menjadi data Sequence (lazy)
        // val createSequence: Sequence<String> = sequenceOf("Coba", "Lagi")
        val wordSequence: Sequence<String> = words1.asSequence()
        val resultSequence: Sequence<String> = wordSequence
            // mengambil value yang panjang character-nya 3
            .filter{ value -> value
                println("filter $value")
                value.length > 3
            }
            // mengubah data dari String lowwercase ke String uppercase.
            .map {
                println("map  $it")
                it.uppercase()
            }
            .take(4)

        // Mengkonversi dari sequence ke List.
        println(resultSequence.toList())
}