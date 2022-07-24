/**
    - Iterator juga memiliki child interface, yaitu ListIterator dan MutableListIterator.
    - ListIterator digunakan oleh List, dan MutableListIterator digunakan oleh MutableList.
    - Set tetap menggunakan Iterator dan Map tidak mendukung Iterator.
    - Semua function yang ada pada Iterator dimiliki juga pada ListIterator, namun terdapat function-function tambahan
      seperti hasPrevious(): Boolean, previous(): T, nextIndex(): Int, previousIndex(): Int.
    - Jadi perbedaan-nya pada iterator kita hanya dapat iterasi datanya secara maju dengan function hasNext(): Boolean,
      namun pada ListIterator kita dapat melakukan iterasi data secara maju dengan function hasNext() dan mundur
      menggunakan function hasPrevious().

    MutableListIterator
    - MutableListIterator adalah interface turunan dari ListIterator<T> dan juga MutableIterator<T> sehingga semua
      function yang ada pada kedua interface tersebut dapat juga digunakan pada interface MutableListIterator.
    - Namun ada juga function tambahan yaitu set(T): Unit, add(T): Unit.
 */

fun <T> displayListIterator(listIterator: ListIterator<T>){
    // Melakukan iterasi data secara maju dengan menggunakan function hasNext()
    while (listIterator.hasNext()) println(listIterator.next())

    println("= = = = = = = = = = =")

    // Melakukan iterasi data secara mundur dengan menggunakan function hasPrevious()
    // karena ListIterator sudah di ujung akhir karena perulangan diatas dengan menggunakan function hasNext().
    // maka dapat membalikan-nya ke awal menggunakan function pervious().
    while (listIterator.hasPrevious()) println(listIterator.previous())
    println("= = = = = = = = = = =")
}

fun <P> displayMutableListIterator(mutableListIterator: MutableListIterator<P>){
    // Melakukan iterasi data secara maju dengan menggunakan function hasNext()
    while (mutableListIterator.hasNext()) println(mutableListIterator.next())
    println("= = = = = = = = = = =")
}

fun removeOddNumber(mutableListIterator: MutableListIterator<Int>){
    // Menghapus bilangan ganjil dengan function remove() dari interface MutableListIterator.
    while (mutableListIterator.hasNext()){
        val item = mutableListIterator.next()
        if(item % 2 == 1) mutableListIterator.remove()
    }
}

fun main() {
    displayListIterator(listOf(1 ,2, 3 ,4 ,5).listIterator())

    val mutableList = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8)
    removeOddNumber(mutableList.listIterator())
    displayMutableListIterator(mutableList.listIterator())
}