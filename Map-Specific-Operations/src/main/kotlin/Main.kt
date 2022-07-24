/**
    - Pada Kotlin juga terdapat banyak operasi yang khusus untuk Map.
    - Map Specific Operator
        => getOrElse(key, (key) -> V)       -> Mengambil value sesuai key, jika tidak ada mengembalikan eksekusi lambda.
        => getValue(key)                    -> Mengambil value sesuai key, jika tidak ada throw exception.
        => filter((Entry)<K,V>) -> Boolean  -> Melakukan filter sesuai kondisi.
        => filterKeys((K) -> Boolean)       -> Melakukan filter dengan kondisi key.
        => filterValues((V) -> Boolean)     -> Melakukan filter dengan kondisi value.
 */

fun main() {
    val map: Map<String, String> = mapOf(
        "a" to "Anto",
        "b" to "Budi",
        "c" to "Cahya",
        "d" to "Dody"
    )
    println(map)
    println("= = = = = = =")
    // contoh function getOrElse(key, (key) -> V)
        val map1: String = map.getOrElse("e"){ "Maaf data tidak ada "}
        println("Data e : $map1")

    // contoh function getValue(key)
        try{
            val map2: String = map.getValue("f")
            println("Data f : $map2")
        }catch (eror: NoSuchElementException){
            println("Data f : tidak Ada")
        }

        val map3: String = map.getValue("a")
        println("Data a : $map3")


    // contoh function filter((Entry)<K,V>) -> Boolean
        val map4: Map<String, String> = map.filter { (key, value) -> value.length == 4}
        println("Value yang jumlah character-nya 4 : $map4")

        val map7: Map<String, String> = map.filter { entries -> entries.value.length == 5}
        println("Value yang jumlah character-nya 5 : $map7")

    // contoh function filterKeys((K) -> Boolean)
        val map5 : Map<String, String> = map.filterKeys { key -> key > "b" }
        println("Key yang huruf pertamanya diatas huruf b : $map5")

    // contoh function filterValues((V) -> Boolean)
        val map6: Map<String, String> = map.filterValues { value -> value.length == 5}
        println("Value yang jumlah character-nya 5 : $map6")

}