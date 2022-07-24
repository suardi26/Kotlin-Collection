/**
    - Semua data collection (List, Set) adalah turunan dari interface Collection.
    - Collection digunakan sebagai general operation (template/prototype) terhadap struktur data collection, seperti
      membaca dan menulis data pada collection.
    - Function-Function/Properties pada Collection (immutable) yang diwarisi pada data collection turunan-nya yaitu
      properties size, function isEmpty(), contains(E), iterator(): Iterator<E>, containsAll(Collection<E>): Boolean.

    MutableCollection
    - Semua data MutableCollection (MutableList, MutableSet) adalah turunan dari interface MutableCollection.
    - MutableCollection digunakan sebagai general operation (template/prototype) terhadap Struktur data MutableCollection,
      seperti membaca dan menulis data pada MutableCollection.
    - Ketika membuat function dengan parameter Collection, maka data MutableCollection dan turunannya dapat mengisi
      parameter tersebut.
    - Properties/Function yang ada pada interface Collection otomatis terdapat juga pada interface MutableCollection
      dikarenakan interface MutableCollection turunan dari interface Collection namun ada beberapa function tambahan
      seperti   - iterator():MutableIterator<E>,
                - Add(E): Boolean,
                - remove(E): Boolean,
                - addAll(Collection<E>): Boolean
                - removeAll(Collection<E>): Boolean
                - retainAll(Collection<E>): Boolean
                - clear(): Unit
    - Ketika membuat function dengan parameter Collection, maka data MutableCollection dan turunannya dapat mengisi
      parameter tersebut.
 */

// Membuat generic function, dimana parameternya Collection<T>
fun <T>displayCollection(collection: Collection<T>){
    for (data in collection) println(data)
    println("= = = = = = = = = =")
}

// Membuat generic function, dimana parameternya MutableCollection<T>
fun <T>displayMutableCollection(collection: MutableCollection<T>){
    for (data in collection) println(data)
    println("= = = = = = = = = =")
}

fun main() {
    // Collection
        // Memanggil generic function displayCollection, dan parameternya diisi oleh interface turunan dari Collection
        // yaitu List
        displayCollection<String>(listOf("Nuvo", "Biore", "Dettol"))

        // Memanggil generic function displayCollection, dan parameternya diisi oleh interface turunan dari Collection
        // yaitu Set
        displayCollection<String>(setOf("Beng-Beng", "Oreo", "Taro"))

        // Memanggil generic function displayCollection, dan parameternya diisi oleh interface turunan dari Collection
        // yaitu Set, yang berupa data entries dari Map yang return value-nya adalah Set.
        displayCollection(mapOf("a1" to "Daia").entries)

        // Memanggil generic function displayCollection, dan parameternya diisi oleh interface yang bukan turunan dari
        // Collection yaitu Map
        // displayCollection(mapOf("a2" to"Enzim")) // error bukan turunan collection.

    // MutableCollection
        // Memanggil generic function displayMutableCollection, dan parameternya diisi oleh interface turunan dari
        // MutableCollection yaitu MutableList.
        displayMutableCollection<String>(mutableListOf<String>("Andi", "Rahmat", "Bimo"))

        // Memanggil generic function displayMutableCollection, dan parameternya diisi oleh interface turunan dari
        // MutableCollection yaitu MutableSet.
        displayMutableCollection(mutableSetOf<Int>(10, 20, 30, 40, 50))

        // Memanggil generic function displayMutableCollection, dan parameternya diisi oleh interface turunan dari
        // MutableCollection yaitu MutableSet, yang berupa data entries dari MutableMap yang return value-nya adalah MutableSet.
        displayCollection(mutableMapOf<String, String>("a1" to "Budi").entries)

}