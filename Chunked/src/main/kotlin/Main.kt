/**
    Chunked Operator
    - Chunked adalah operasi untuk memotong collection menjadi beberapa collection.
    - Berbeda dengan partition yang membagi data collection menjadi dua bagian, Pada Chunked Operator dapat membagi data
      collection menjadi beberapa bagian bisa lebih dari 2 bagian.
    - Dan misal terdapat 9 data pada collection dan ketika di chunked dimana setiap collection-nya memiliki nilai 2 maka
      data collection-nya tetap dibagi 5 namun data ke-1 sampai data ke-4 memiliki data sebanyak 2 dan data collection
      ke-5 cuma 1.

    Chunked Operator
        => chunked(n): List<List<T>>                => Untuk memotong collection menjadi beberapa collection dengan
                                                       jumlah data n.
        => chunked(n, (List<T>) -> R): List<R>      => Untuk memotong collection menjadi beberapa collection dengan
                                                       jumlah data n, lalu melakukan transformasi List<T> menjadi R,
                                                       sehingga menghasilkan List<R>.
 */

fun main() {
    val list = (1..50).toList()

    // Menggunakan function chunked(n): List<List<T>>
    // Membagi collection dimana setiap data collection-nya hanya memiliki data 10.
        val list1 = list.chunked(10)
        list1.forEach { value: List<Int> -> println(value) }
        println("= = = = = = = = = =")

    // Menggunakan function chunked(n, (List<T>) -> R): List<R>
    // Membagi collection dimana setiap data collection-nya hanya memiliki data 10 dan data tersebut dijumlahkan
    // semuanya sehingga mengubah data List<Int> menjadi satu data Int sehingga datanya berubah dari  List<List<Int>>
    // menjadi List<Int>
        val list2 = list.chunked(10){ list: List<Int> ->
            var total = 0
            for (number in list){
                total += number
            }
            total
        }
        println(list2)
}