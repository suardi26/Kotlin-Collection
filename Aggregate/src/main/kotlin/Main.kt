/**
    Aggregate
    - Kotlin memiliki berbagai operasi untuk melakukan aggregate.

    Aggregate Operator
     => max() dan min()     => Untuk mengambil nilai maksimal dan minimum (Deprecated)
                               diganti maxOrNull() atau minOrNull().
     => average()           => Untuk mengambil nilai rata-rata.
     => sum()               => Untuk mengambil nilai jumlah seluruh element.
     => count()             => Untuk mengambil berapa banyak element.

     => maxBy(selector) dan minBy(selector) => Untuk mengambil nilai maksimal dan minimum sesuai lambda selector (Deprecated)
                                               diganti maxByOrNull(selector) atau minByOrNull(selector).
     => maxWith(Comparator)                 => Untuk mengambil nilai maksimal sesuai comparator.
     => minWith(Comparator)                 => Untuk mengambil nilai minimum sesuai comparator.
     => sumBy(selector)                     => Untuk mengambil nilai jumlah seluruh element sesuai lambda selector.
                                               (Deprecated) digantikan dengan function sumOf().
     => sumByDouble(selector)               => Untuk mengambil nilai jumlah seluruh element sesuai lambda selector,
                                               akan tetapi menghasilkan Double.
 */

fun main() {
    val list = (1..5).toList()
    println(list)

    // menggunakan function max() dan min()
        println("Data Max-nya : ${list.maxOrNull()}")
        println("Data Min-nya : ${list.minOrNull()}")

    // menggunakan function average()
        println("Nilai rata-rata : ${list.average()}")

    // menggunakan function sum()
        println("Nilai jumlah seluruh element : ${list.sum()}")

    // menggunakan function count()
        println("Banyaknya data : ${list.count()}")

    // menggunakan function maxByOrNull(selector) atau minByOrNull(selector)
        println("Data Max bilangan Genap : ${list.maxByOrNull { value -> 
            if(value % 2 == 0){
                value
            }else{
                0
            }
        }}")

        println("Data Min bilangan Genap : ${list.minByOrNull { value ->
            if(value % 2 == 0){
                value
            }else{
                0
            }
        }}")

    // menggunakan function sumBy(selector)
        println("Nilai jumlah seluruh element Ganjil : ${list.sumOf{ value -> 
            if(value % 2 == 0){
                0
            }else{
                value
            }
                
        }}")
}