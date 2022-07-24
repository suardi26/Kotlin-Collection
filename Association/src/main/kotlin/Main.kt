import kotlin.time.measureTimedValue

/**
    - Association adalah operasi transformasi dari collection menjadi map.
    - Dalam beberapa operasi association, element hasil dapat menjadi key atau value.

    Transformations: Association Operation
    - Association Operation                 keterangan
        - associate((T) -> Pair<K,V>)   =>  Merubah collection T menjadi Map <K,V>
        - associateWith( T -> V)        =>  Merubah collection T menjadi Map <T,V>, artinya data collection-nya menjadi
                                            Key pada data Map dan data collection juga menjadi bagian dari value pada Map.
        - associateBy(T -> K)           =>  Merubah collection T menjadi Map <K,T>, artinya data collection-Nya menjadi
                                            value pada data Map dan data collection juga menjadi bagian dari key pada Map.
 */

fun main() {
    val list1 = listOf("A", "B", "C", "D")
    var counter = 0

    // contoh dari function associate((T) -> Pair<K,V>)
    val map1: Map<Int, String> = list1.associate {value -> Pair(++counter, value) }
    println(map1)
    println("= = = = = = = =")

    // contoh dari function associateWith(T -> V), data collection menjadi Key pada Map dan data collection juga
    // menjadi bagian dari value pada Map.
    val map2: Map<String, String> = list1.associateWith { key -> "value$key" }
    println(map2)
    println("= = = = = = = = ")

    // contoh dari function associateBy(T -> K), data collection menjadi Value pada Map dan data collection juga
    // menjadi bagian dari key pada Map.
    val map3: Map<String, String> = list1.associateBy { value -> "key$value" }
    println(map3)
    println("= = = = = = = = ")
}