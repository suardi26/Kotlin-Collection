/**
    - Pada Kotlin juga terdapat operations yang khusus digunakan untuk Set.
    - Set Specific Operator
       -> union(collection)         => Mengembalikan semua element dari kedua set menjadi 1 data Set, namun perlu
                                       diperhatikan bahwa Set tidak dapat menampung value yang duplikat oleh karena itu
                                       ketika ada data yang duplikat maka dijadikan satu.
       -> intersect(collection)     => Mengembalikan semua element yang terdapat di kedua set.
       -> substract(collection)     => Mengembalikan semua element yang tidak dimiliki oleh set.
 */

fun main() {
    val set1: Set<Int> = setOf(1, 2, 3, 4, 5, 6, 7)
    val set2: Set<Int> = setOf(6, 7, 8, 9, 10)
    println(set1)
    println(set2)

    // contoh function union(collection)
    val set3: Set<Int> = set1.union(set2)
    println("Menggabungkan data set1 dan set2 : $set3")

    // contoh function intersect(collection)
    val set4: Set<Int> = set1.intersect(set2)
    println("Mengambil data-data yang ada pada set1 dan set2 : $set4")

    // contoh function substract(collection)
    val set5: Set<Int> = set1.subtract(set2)
    println("Mengambil data-data pada set1 yang tidak ada pada set2 : $set5")
    val set6: Set<Int> = set2.subtract(set1)
    println("Mengambil data-data pada set2 yang tidak ada pada set1 : $set6")
}