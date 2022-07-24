/**
    Transformations: Flattening
    - Flattening adalah operasi transformasi untuk menjadikan nested collection menjadi flat.
    - Extension function flatten hanya dapat digunakan pada nested collection dan tidak bisa pada collection biasa.
    - Flattering Operation
        - flatten                     => Digunakan untuk mengubah nested collection menjadi flat collection.
        - flatMap((T) -> Iterable<R>) => Digunakan untuk mengubah collection T menjadi flat collection R.
    - Jadi Extension function flatten() digunakan untuk menyambungkan value dari beberapa List di dalam List menjadi
      satu misal terdapat sebuah data List yang didalamnya terdapat data List lagi berjumlah dua data List dimana
      masing-masing data-nya yaitu 3 dan ketika digunakan function flatten, maka dapat menyambungkan data dari data List
      awal hingga data List akhir menjadi 1 data List yang value-nya 6.
        contoh :        val list1: List<List<String>> = listOf(
                        listOf("Suardi", "Daud", "Manda"),
                        listOf("first", "mid", "last")
                        val list2: List<String> = list1.flatten()

        hasil :         [Suardi, Daud, Manda, first, mid, last]

        )
    - Jadi Extension function flatMap((T) -> Iterable<R>) digunakan untuk menggabungkan data List dari object yang berbeda
      namun dari class yang sama yang dibuat menggunakan List<class>.
    - Jadi dibanding menggabungkan dahulu data List menjadi Pair<T,U>  menggunakan function map() setelah itu menggabungkan
      data Pair menjadi List<T> menggunakan function flatten, lebih baik langsung menggunakan function flatMap() yang
      berfungsi untuk menggabungkan data List menjadi data Pair<T,U> setelah itu langsung menggabungkan data Pair<T,U>
      menjadi List<T>.
    - function flatten() ataupun flatMap() return value-nya adalah data List<T>.

 */

class Person(val name: String, val hobbies: List<String>)

fun main() {
    // membuat nested List
    val list1: List<List<String>> = listOf(
        listOf("Suardi", "Daud", "Manda"),
        listOf("first", "mid", "last"),
        listOf("Google", "Yahoo", "FacebooK")
    )
    println(list1)

    // Menggunakan function flatten()
    val list2: List<String> = list1.flatten()
    println(list2)
    println("= = = = = = = = =")

    // Menggunakan function flatMap
    val person: List<Person> = listOf(
        Person("Suardi", listOf("Coding", "Playing Football")),
        Person("Daud", listOf("Traveling", "Photography", "Animation"))
    )
    val hobbies: List<String> = person.flatMap { person -> person.hobbies }
    println(hobbies)
    println("= = = = = = = = =")
}
