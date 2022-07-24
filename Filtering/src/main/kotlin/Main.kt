/**
    Filtering by Predicate
    - Filtering adalah salah satu operasi collection yang sangat populer.
    - Pada Kotlin, Filtering dapat menggunakan predicate berupa lambda yang berisi kondisi filter-nya.
    - Jika return dari predicate tersebut true, maka data di terima, jika false maka data dibuang.

    Filtering by Predicate Operation
    - Filtering Opereation                   Keterangan
      = filter((T) -> Boolean)               => Digunakan untuk melakukan filtering terhadap collection, kalau data true
                                                maka akan dimasukan sedangkan kalau data-nya false maka tidak akan
                                                dimasukkan.
      = filterIndexed((index,T) -> Boolean   => Digunakan untuk melakukan filtering terhadap collection, dengan tambahan
                                                informasi index.
      = filterNot((T) -> Boolean             => Kebalikan dari filter((T) -> Boolean) dimana digunakan untuk melakukan
                                                filtering tapi ketika datanya true tidak dimasukan, namun ketika datanya
                                                false akan dimasukan.
      = filterIsInstance<T>()                => Digunakan untuk Mengambil hanya data instance dari T dan turunan-nya.
      = filterNotNull()                      => Digunakan untuk Mengambil hanya data yang tidak null dan membuang data
                                                yang null.
 */

fun main() {
    val map: Map<String, Int> = mapOf(
        "0.Daia"  to 9_000,
        "1.Rinso" to 20_000,
        "2.Molto" to 5_000,
        "3.Dove"  to 5_000
    )
    val (listProduct: List<String>, listPrice: List<Int>) = map.toList().unzip()

    // contoh function 'filter((T) -> Boolean)' mengambil data yang true dan membuang data yang false.
        val priceFilter1: List<Int> = listPrice.filter{ price -> price < 10_000}
        println("Harga dibawah 10.000 : $priceFilter1")
        println("= = = = = = = = = =")

    // contoh function filterIndexed((index,T) -> Boolean.
        val productFilter2: List<String>  = listProduct.filterIndexed{index, product -> index % 2 == 1}
        val priceFilter2: List<Int> = listPrice.filterIndexed{index, price -> index % 2 == 1}
        val mapFiltering2: Map<String, Int> = productFilter2.zip(priceFilter2).toMap()
        println("Product yang indexnya ganjil akan di ambil : $mapFiltering2")
        println("= = = = = = = = = =")

    // contoh function 'filterNot((T) -> Boolean'  mengambil data yang false dan membuang data yang true.
        val priceFilter3: List<Int> = listPrice.filterNot { price -> price < 10_000 }
        println("Harga diatas 10.000 : $priceFilter3")
        println("= = = = = = = = = =")

    // contoh function 'filterIsInstance<T>()' value dari data String dan turunannya yang akan diambil
        val listData: List<Any?> = listOf(null, 1, "Suardi", "Daud", 2, 3)
        val listFilter: List<String> = listData.filterIsInstance<String>()
        println("Data yang diambil adalah yang bertipe String : $listFilter")
        println("= = = = = = = = = =")

    // contoh function 'filterNotNull()' yang akan diambil adalah data yang bukan null.
        val listFilter1: List<Any> = listData.filterNotNull()
        println("Data yang diambil adalah data yang bukan null : $listFilter1")
        println("= = = = = = = = = =")

}