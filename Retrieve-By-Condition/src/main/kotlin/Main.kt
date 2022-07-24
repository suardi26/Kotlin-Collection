import javax.print.attribute.SetOfIntegerSyntax

/**
    - Selain Mengambil Satu element di collection berdasarkan posisi, kita juga dapat mengambil single element
      berdasarkan kondisi.

    Retrieve Single Element Operator
        => first((T) -> Boolean)        -> Mengambil element pertama yang sesuai kondisi.
        => last((T) -> Boolean)         -> Mengambil element terakhir yang sesuai kondisi.
        => firstOrNull((T) -> Boolean / find()   -> Mengambil element pertama yang sesuai kondisi, dan ketika value-nya
                                                    tidak ada maka return value-nya adalah null.
        => lastOrNull((T) -> Boolean) / findLast() -> Mengambil element terakhir yang sesuai kondisi, dan ketika
                                                       value-nya tidak ada maka return value-nya adalah null.
 */

fun main() {
    val set = (1..10).toSet()

    // function ((T) -> Boolean)
        val number1: Int = set.first { value -> value > 4 } // 5 adalah angka pertama yang lebih dari angka 4.
        println(number1)

    // function last((T) -> Boolean)
        val number2 = set.last{it < 10} // 9 adalah angka pertama yang kurang dari angka 10.
        println(number2)

    // function firstOrNull((T) -> Boolean / find()
        val number3 = set.firstOrNull { it > 1 } // 2 adalah angka pertama yang lebih dari angka 1.
        println(number3)
        val number4 = set.find { it > 20 } // null karena data Set cuma 1-10, dan yang dicari data yang value-nya 20.
        println(number4)

    // function lastOrNull((T) -> Boolean / findLast()
        val number5 = set.lastOrNull { value -> value < 6 } // 5 adalah angka pertama yang kurang dari angka 6.
        println(number5)
        val number6 = set.findLast{ it > 15 } // null karena data Set cuma 1-10, dan yang dicari data yang value-nya 15.
        println(number6)
}