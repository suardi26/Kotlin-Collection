/**
    - Interface Iterable adalah superclass dari Collection interface.
    - Iterable adalah general operation (template/prototype) untuk melakukan iterasi seluruh data pada collection,
      atau menghapus data pada collection.
    - Pada Iterable terdapat function iterator() yang mengembalikan object dari interface Iterator<T>.
    - Dimana Iterator merupakan sebuah interface yang terdapat 2 function yaitu =
                next(): T -> digunakan ke data selanjutnya.
                hasNext(): Boolean. -> digunakan untuk mengecek data selanjutnya apakah masih ada atau tidak.
    - Itarable digunakan untuk melakukan iterate data.

    MutableIterable
    - MutableIterable adalah interface turunan dari Iterable.
    - Pada MutableIterable, function iterator() di-override dimana function ini akan mengembalikan object dari
      interface MutableIterator<T>.
    - Dimana MutableIterator merupakan sebuah interface yang terdapat 1 function yaitu =
                remove(): Unit -> digunakan untuk menghapus data Collection.
    - Interface MutableIterator<T> merupakan turunan dari Iterator Sehingga MutableIterator memiliki function-function
      yang ada pada Iterator seperti : next(): T, hasNext(): Boolean.
 */

// Membuat generic function yang parameter-nya dari interface Iterable.
fun <T> displayIterable(iterable: Iterable<T>){

    // Secara otomatis
        //for (value in iterable) println(value)

    // Secara manual
        // memanggil function iterator dari interface Iterable<T>, untuk melakukan iterate data pada Collection dan
        // turunan-nya.
        val iterator = iterable.iterator()
        while (iterator.hasNext()) {
            val data = iterator.next()
            println(data)
        }
        println("= = = = = = = = = = =")
}

// Membuat generic function yang parameter-nya dari interface MutableIterable.
fun <T> displayMutableIterable(iterable: MutableIterable<T>){

    // Menggunakan function remove() dari interface MutableIterator untuk menghapus data dengan value "Java"
        val iterator = iterable.iterator()
        while (iterator.hasNext()){
            if (iterator.next() == "Java"){
                iterator.remove()
            }
        }
    // memanggil function hasNext() dan juga next() dari interface MutableIterator untuk melakukan iterasi data
    // pada Collection dan turunan-nya.
        val iterator1 = iterable.iterator()
        while (iterator1.hasNext()) println(iterator1.next())
        println("= = = = = = = = = = =")
}

fun main() {
    // melakukan iterasi data dengan memanggil generic function displayIterable
    displayIterable(listOf("Google", "Yahooo", "Facebook"))
    displayIterable(setOf("Samsung", "Apple", "Asus"))

    // melakukan iterasi data dengan memanggil generic function displayMutableIterable
    displayMutableIterable(mutableListOf(1, 2, 3))
    displayMutableIterable(mutableSetOf("Golang", "Java", "Kotlin"))
}