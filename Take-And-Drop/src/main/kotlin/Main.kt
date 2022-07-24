/**
    - Untuk mengambil sebagian element pada collection, selain slice, kita dapat juga menggunakan operator take dan
      drop.

    Take Operators
        - take(n)                   => Untuk mengambil collection dari awal sejumlah n.
        - takeLast(n)               => Untuk mengambil collection dari akhir sejumlah n.
        - takeWhile((T) -> Boolean) => Untuk mengambil element dari awal selama kondisi bernilai true, namun jika false
                                       maka berhenti.
        - takeWhileLast((T) -> Boolean) => Untuk mengambil element dari akhir selama kondisi bernilai true, namun jika
                                           false maka berhenti.
    Drop Operators
        - drop(n)                   => Untuk menghapus collection dari awal sejumlah n.
        - dropLast(n)               => Untuk menghapus collection dari akhir sejumlah n.
        - dropWhile((T) -> Boolean) => Untuk menghapus element dari awal selama kondisi bernilai true, namun jika false
                                       maka berhenti.
        - dropWhileLast((T) -> Boolean) => Untuk menghapus element dari akhir selama kondisi bernilai true, namun jika
                                           false maka berhenti.
 */

fun main() {
    val chars: List<Char> = ('a'.. 'z').toList()

    // Contoh function take(n)
        val list1 = chars.take(3) // mengambil 3 huruf dari depan a,b,c
        println(list1)
        println("= = = = = = =")

    // Contoh function takeLast(n)
        val list2 = chars.takeLast(3) // mengambil 3 huruf dari belakang x, y, z
        println(list2)
        println("= = = = = = =")

    // Contoh function takeWhile((T) -> Boolean)
        val list3 = chars.takeWhile { value -> value < 'e' } // Mengambil huruf dari depan sampai sebelum 'e' jadi  a,b,c,d
        println(list3)
        println("= = = = = = =")

    // Contoh function takeWhile((T) -> Boolean)
        val list4 = chars.takeLastWhile { it > 'v' } // Mengambil huruf dari belakang sampai sebelum 'v' jadi w,x,y,z
        println(list4)
        println("= = = = = = =")

    // Contoh function drop(n)
        val list5 = chars.drop(24) // Membuang 24 huruf dari awal menyisakan y,z.
        println(list5)
        println("= = = = = = =")

    // Contoh function dropLast(n)
        val list6 = chars.dropLast(24) // Membuang 24 huruf dari belakang menyisakan a,b.
        println(list6)
        println("= = = = = = =")

    // Contoh function dropWhile((T) -> Boolean)
        val list7 = chars.dropWhile { value -> value < 'x' } // Membuang huruf dari depan sampai sebelum 'x' jadi x,y,z
        println(list7)
        println("= = = = = = =")

    // Contoh function dropWhileLast((T) -> Boolean
        val list8 = chars.dropLastWhile{ it > 'b'} // Membuang huruf dari belakang sampai sebelum 'b' jadi a,b.
        println(list8)
        println("= = = = = = =")
}