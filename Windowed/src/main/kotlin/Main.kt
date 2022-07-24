/**
    - Windowed adalah operasi untuk mendapatkan semua kemungkinan collection sesuai dengan range yang telah ditentukan.

    Windowed Operator
      => windowed(size, step, partialWindow)        => Untuk mengambil semua kemungkinan collection sebesar size,
                                                       dilanjutkan dengan step, dan diakhiri dengan partialWindow.
      => windowed(size, step, partialWindow, transform)     => Untuk mengambil semua kemungkinan collection sebesar size,
                                                               dilanjutkan dengan step, dan diakhiri dengan partialWindow,
                                                               namun hasil collection pada transform.
      ket : size => adalah jumlah data dalam satu collection.
            step => adalah jumlah data melompat pada setiap collection misal 2 maka [1,2,3] [3,4,5] [5,6,7]
            transform => merubah data-nya ke bentuk data lain misal dari List<Int> ke Int, dll.
            partialWindow => adalah nilai Boolean, dimana ketika true maka akan mengambil data dari sisa collection
                             yang dibelakang dan tidak mencukupi size dari collection dan false maka akan membuang data
                             dari sisa collection yang tidak mencukupi size dari collection yang ditentukan.
                             misal : datanya ada 5 dan akan diambil size-nya 3 dan step-nya 1 serta partialWindow-nya
                             true maka datanya [1,2,3], [2,3,4], [3,4,5], [4,5], [5], namun ketika
                             false maka datanya [1,2,3], [2,3,4], [3,4,5].


 */

fun main() {
    val list: List<Int> = (1..5).toList()

    // Menggunakan function windowed(size, step, partialWindow = true)
        // datanya [[1, 2, 3], [2, 3, 4], [3, 4, 5], [4, 5], [5]]
        val list1: List<List<Int>> = list.windowed(3, 1, true)
        println(list1)
        println("= = = = = = =")

    // Menggunakan function windowed(size, step, partialWindow = true, transform)
        // Menghitung jumlah setiap data collection yang terbagi datanya sehingga berubah dari List<List<Int>>
        // menjadi List<Int>
        // [3, 3, 3, 2, 1]
        val list2: List<Int> = list.windowed(3, 1, true){value: List<Int> -> value.size }
        println(list2)
        println("= = = = = = =")

    // Menggunakan function windowed(size, step, partialWindow = false)
        // datanya [[1, 2, 3], [2, 3, 4], [3, 4, 5]] dan yang dibuang adalah  [4, 5], [5] karena jumlah datanya sudah
        // tidak sesuai dengan size yaitu 3.
        val list3: List<List<Int>> = list.windowed(3, 1, false)
        println(list3)
        println("= = = = = = =")

    // Menggunakan function windowed(size, step, partialWindow = false, transform)
        // Menghitung jumlah setiap data collection yang terbagi datanya sehingga berubah dari List<List<Int>> menjadi
        // List<Int> [3, 3, 3]
        val list4: List<Int> = list.windowed(3, 1, false){value: List<Int> -> value.size }
        println(list4)
        println("= = = = = = =")

    // Menggunakan function windowed(size, step, partialWindow = true)
        // datanya [[1, 2, 3], [3, 4, 5], [5]]
        val list5: List<List<Int>> = list.windowed(3, 2, true)
        println(list5)
        println("= = = = = = =")

    // Menggunakan function windowed(size, step, partialWindow = false)
        // datanya [[1, 2, 3], [3, 4, 5]] dan yang dibuang adalah [5] karena jumlah datanya sudah
        // tidak sesuai dengan size yaitu 3.
        val list6: List<List<Int>> = list.windowed(3, 2, false)
        println(list6)
        println("= = = = = = =")

}