/**
    - Map menyimpan datanya dalam Entry<K,V> , dimana Entry memiliki function component1() untuk mendapatkan Key, dan
      component2() untuk mendapatkan Value.
    - Hal ini jadi memungkinkan kita melakukan destructuring di Entry Map.
 */

fun main() {
    val map = mapOf(
        "a" to "Anto",
        "b" to "Budi",
        "c" to "Ceko"
    )
    // menggunakan entry
    println("key\t\tvalue")
    for (entry in map){
        println("${entry.key}\t\t${entry.value}")
    }
    println("= = = = = = =")

    // menggantikan entry dengan destructuring declaration
    println("key\t\tvalue")
    for ((key, value) in map){
        println("$key\t\t$value")
    }
    println("= = = = = = =")

    // Memanggil function forEach yang parameternya entry
    println("key-value")
    map.forEach(){entry -> println("${entry.component1()}-${entry.component2()}")}
    println("= = = = = = =")
    println("key-value")
    map.forEach(){entry -> println("${entry.key}-${entry.value}")}
    println("= = = = = = =")

    // Memanggil function forEach yang parameternya entry namun diganti dengan destructuring declaration.
    println("key-value")
    map.forEach(){(key, value) -> println("$key-$value")}
    println("= = = = = = =") 
}