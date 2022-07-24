/**
    - Kotlin juga mendukung operasi untuk mengecek apakah dalam collection terdapat data yang kita cari.

    Checking Existence Operator
      => contains(element): Boolean        => Mengecek apakah terdapat element pada collection.
      => containsAll(Collection<T>): Boolean => Mengecek apakah terdapat element collection T pada collection, function
                                                ini biasanya digunakan untuk mengecek beberapa data terhadap data collection.
      => isEmpty(): Boolean                  => Mengecek apakah collection kosong.
      => isNotEmpty(): Boolean               => Mengecek apakah collection tidak kosong.

    - function contains(), containsAll() dan isEmpty() adalah function dari interface Collection sehingga dapat digunakan
      pada class/interface turunan-nya.
    - sedangkan function isNotEmpty() adalah extension function untuk interface Collection.
 */

fun main() {
    val list = (1..10).toList()
    println(list)
    // Memanggil function contains(element): Boolean
        val check1: Boolean = list.contains(10)
        println("apakah 10 terdapat pada data List : $check1")

    // Memanggil function containsAll(Collection<T>): Boolean, parameternya dari interface Collection dan turunan-nya.
        // dan datanya harus terdapat semua pada collection baru menghasilkan true, dan ketika terdapat 1 saja value
        // yang tidak terdapat pada data collection maka hasilnya false
        val check2: Boolean = list.containsAll(listOf(1,2,3,9))
        println("apakah data collection listOf(1,2,3,9) terdapat pada data List : $check2")
        println("apakah data collection listOf(1,2,3,11) terdapat pada data List : ${list.containsAll(listOf(1,2,3,11))}")

    // Memanggil function isEmpty(): Boolean
        val check3: Boolean = list.isEmpty()
        println("Apakah data List Kosong : $check3")

    // Memanggil function isNotEmpty(): Boolean
        val check4: Boolean = list.isNotEmpty()
        println("Apakah data List tidak Kosong : $check4")
}