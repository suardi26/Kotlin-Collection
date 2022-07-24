/**
    - Set adalah collection yang data-nya harus unik dan tidak pasti berurut.
    - Pada saat kita memasukan data duplicate ke Set, maka data hanya akan disimpan satu, data duplicate-nya tidak
      akan ditambahkan ke dalam Set.
    - Set sangat cocok untuk menyimpan data yang unik, tidak boleh sama.
    - Set menggunakan function hashCode() dan equals(), untuk membandingkan apakah sebuah object sama atau tidak,
      jika perbandingannya sama, maka dianggap data tersebut duplicate, dan tidak akan diterima oleh Set.
    - Pada Set, tidak dapat menggunakan function get(index) untuk mengambil data-nya karena posisi-nya teracak.
    - Pada Set tidak ada index.
    - Interface Set Secara default adalah immutable Set.
    - Terdapat juga interface MutableSet untuk menampung data-data dan dapat dimanipulasi
    - Interface MutableSet adalah turunan dari interface Set, sehingga function-function yang terdapat pada Set
      dapat juga digunakan untuk MutableSet
 */

class Product(val name: String){
    override fun hashCode(): Int {
        return this.name.hashCode()
    }

    override fun equals(other: Any?): Boolean = when (other) {
        is Product -> this.name == other.name
        else -> false
    }

    override fun toString(): String {
        return this.name
    }
}

fun main() {

    // Contoh pembuatan Set dari class Product.
        val set: Set<Product> = setOf(
            Product("Lux"),
            Product("Dove"),
            Product("Biore"),
            Product("Lux")
        )
        // jumlah data di Set adalah 3 karena ada satu value/element yang duplikat.
        println(set.size)
        println(set.contains(Product("Lux")))
        println("= = = = = = = = = =")

        // Memanggil semua value/element dari Set dengan menggunakan perulangan 'for'.
        for (value in set){
            println(value)
        }
        println("= = = = = = = = = =")
    // Contoh pembuatan MutableSet
        // Pada saat pembuatan object-nya element/value dari MutableSet dapat dikosongkan terlebih dahulu dan
        // dapat ditambahkan nanti karena isi-nya dapat berubah-ubah.
        val mutableSet: MutableSet<Product> = mutableSetOf()

        // Memanggil function add() dari interface MutableSet yang digunakan untuk manambahkan value/element.
        mutableSet.add(Product("Taro"))
        mutableSet.add(Product("Beng-Beng"))
        mutableSet.add(Product("Oreo"))
        mutableSet.add(Product("Taro"))

        // jumlah data di MutableSet adalah 3 karena ada satu value/element yang duplikat.
        println(mutableSet.size)
        println(mutableSet.contains(Product("Taro")))
        println("= = = = = = = = = =")

        // Memanggil semua value/element dari MutableSet dengan menggunakan perulangan 'for'.
        for (value in mutableSet){
            println(value)
        }
        println("= = = = = = = = = =")

    // Contoh pembuatan MutableSet dari class String.
        val names: MutableSet<String> = mutableSetOf("Gabriel", "Tomy", "Edward")
        for (value in names){
            println(value)
        }


}