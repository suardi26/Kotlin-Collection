/**
    - Transformasi mapping digunakan untuk mengubah data ke data lain.
        misalnya : ingin mengubah data listOf yang menampung data String, ke data listOf yang Int.
    - Mapping akan membutuhkan lambda function sebagai parameter, dan akan mengembalikan collection hasil result
      lambda-nya.
    - Urutan collection baru hasil dari mapping adalah sama dengan urutan collection aslinya.
    - Extension function yang digunakan untuk Mapping Operations :
        - map(transform: (T) -> R)              => Mengubah collection menjadi collection baru sesuai lambda transform.
        - mapIndexed(transform: (index, T) -> R) => Mengubah collection menjadi collection baru, dengan tambahan
                                                    parameter index.
        - mapNotNull(transform: (T) -> R)       => Sama seperti map(), namun menghiraukan hasil null.
        - mapIndexedNotNull(transform: (index, T) -> R) => Sama seperti mapIndexed(), namun menghiraukan nilai null.
    - Karena semua function diatas extension function dari interface Iterable sehingga semua turunan-nya dapat menggunakan
      function untuk operasi Mapping.

    Mapping Operations untuk Map.
    - mapKeys(transform: (Entry<K,V>) -> R)   => Mengubah map menjadi map baru dengan nilai key baru sesuai dengan lambda
                                                 transform.
    - mapKeys(transform: (Entry<K,V>) -> R)   => Mengubah map menjadi map baru dengan nilai value baru sesuai dengan lambda
                                                 transform.
 */

fun main() {
    val list1: List<String> = listOf("Downy", "Molto", "Rinso","")

    // Menggunakan function map() untuk mengubah data collection dan disimpan pada collection yang baru.
    val list2: List<String> = list1.map { data -> data.uppercase() }
    list2.forEach { value -> println(value) }
    println("Jumlah Datanya = "+list2.size)
    println("= = = = = = = = =")

    // Menggunakan function mapIndexed() untuk mengubah data collection menjadi collection baru, dengan tambahan
    // parameter index.
    val list3: List<String> = list1.mapIndexed { index, value ->
        "Data ke-${index+1} : $value"
    }
    list3.forEach { value -> println(value) }
    println("Jumlah Datanya = "+list3.size)
    println("= = = = = = = = =")

    // Menggunakan function mapNotNull() untuk mengubah data collection dan disimpan pada collection yang baru namun
    // menghiraukan hasil null.
    val list4: List<String> = list1.mapNotNull { data ->
        if (data.isBlank()) null
        else data.uppercase()

    }
    list4.forEach{ value -> println(value)}
    println("Jumlah Datanya = "+list4.size) // datanya cuma 3 karena data ke-4 adalah null.
    println("= = = = = = = = =")

    // Menggunakan function mapIndexedNotNull() untuk mengubah data collection menjadi collection baru, dengan
    // tambahan parameter index namun menghiraukan nilai null.
    val list5: List<String> = list1.mapIndexedNotNull { index, value ->
        if (value.isBlank()) null
        else "Data ke-${index+1} : $value"

    }
    list5.forEach{ value -> println(value)}
    println("Jumlah Datanya = "+list5.size) // datanya cuma 3 karena data ke-4 adalah null.
    println("= = = = = = = = =")

    // Mapping operations for Map
    val map1: Map<Int, String> = mapOf(
        1 to "Suardi",
        2 to "Daud",
        3 to "Manda"
    )
    map1.forEach{entry -> println("${entry.key} : ${entry.value}") }
    println("= = = = = = = = =")

    // Menggunakan function mapKeys untuk Mengubah map menjadi map baru dengan nilai key baru sesuai dengan lambda transform.
    val map2: Map<Int, String> = map1.mapKeys { entry ->  entry.key * 2 }
    map2.forEach{entry -> println("${entry.key} : ${entry.value}") }
    println("= = = = = = = = =")

    // Menggunakan function mapValues untuk Mengubah map menjadi map baru dengan nilai value baru sesuai dengan lambda transform.
    val map3: Map<Int, String> = map2.mapValues { it.value.uppercase() }
    map3.forEach{entry -> println("${entry.key} : ${entry.value}") }
    println("= = = = = = = = =")
}