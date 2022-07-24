/**
    - salah satu function yaitu groupingBy menghasilkan return value object dari interface Grouping.

    Grouping interface operator.
    - eachCount()                     => Menghitung jumlah data di tiap group.
    - reduce() dan fold()             => Operasi reduce() dan fold() di tiap group.
    - aggregate(key: K, accumulator: R?, element: T, first: Boolean)  => Operasi aggregate data di tiap group, dimana
                                                                         jika parameter first bernilai true, maka
                                                                         accumulator/ data pertama bernilai null,
                                                                         ketika false maka accumulator tidak bernilai
                                                                         null.

 */
fun main() {
    val list = listOf<String>("a", "a", "b", "b", "c", "c")
    println(list)

    // Membuat 3 group yaitu group a,b,c
    val grouping: Grouping<String, String> = list.groupingBy { value -> value }

    // Contoh function eachCount()
        val eachCountV: Map<String, Int> = grouping.eachCount()
        println(eachCountV)

    // Contoh function fold()
        val merge: Map<String, String> = grouping.fold(""){accumulator, element -> "" +
                if (accumulator.isBlank()) "$element"
                else "$accumulator, $element"
        }
        println(merge)

    // Contoh function reduce()
        val merge1: Map<String, String> = grouping.reduce(){key, accumulator, element ->
           accumulator+element
        }
        println(merge1)

    // contoh function aggregate()
        val merge2: Map<String, String> = grouping.aggregate(){key, accumulator: String?, element, first ->
            if (first)element // data pertama/accumulator kosong
            else accumulator + element// data pertama/accumulator tidak kosong
        }
        println(merge2)
}