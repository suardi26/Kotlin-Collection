/**
    Transformations: String Representation
    - String Representations adalah operasi transformasi untuk mengubah collection menjadi String.

    - String Representation Operation               Ket
       = joinToString(Separator, prefix, suffix) => Untuk Mengubah collection menjadi String dengan separator,
                                                    prefix dan suffix. return value dari function ini adalah String.
       = joinToString(separator, prefix, suffix, transform) => Untuk mengubah collection menjadi String dengan separator,
                                                               prefix dan suffix, namun data collection akan diubah
                                                               dalam transform terlebih dahulu. return value dari
                                                               function ini adalah String.
       = joinTo(Appendable, separator, prefix, suffix, transform) => Untuk mengubah collection menjadi String dengan
                                                                     separator, prefix dan suffix, namun data collection
                                                                     akan diubah dalam transform terlebih dahulu dan
                                                                     String ditambahkan ke Appendable. function ini tanpa
                                                                     return value namun hasil-nya akan dimasukan pada
                                                                     Appendable.
        ket : - separator adalah pemisah dari data-data collection yang diambil.
              - prefix adalah awalan yang dapat ditambahkan pada return value-nya.
              - suffix adalah akhiran yang dapat ditambahkan pada return value-nya.
              - transform adalah function yang dapat mengubah data collection satu per satu.
              - Appendable adalah interface yang digunakan untuk membuat object String sehingga nilainya dapat
                dimodifikasi. ada beberapa class di java yang mengimplementasikan interface Appendable
                seperti : StringBuilder, StringBuffer, dll.
    - function joinToString dapat juga digunakan pada data collection dengan tipe data lainnya bukan cuma String karena
      function joinToString adalah extension function dari interface Iterable<T>  artinya dapat diisi oleh tipe data
      lain-nya.

 */
fun main() {

    // menggunakan function joinToString(Separator, prefix, suffix)
        val student: List<String> = listOf("Aryo", "Budi", "Citra")
        val dataString1: String = student.joinToString(" ","Awal-", "-Akhir")
        println(dataString1)

    // menggunakan function joinToString(Separator, prefix, suffix) namun dengan data collection List yang Int.
        val numbers: List<Int> = listOf(1, 2, 3, 4, 5)
        println(numbers.joinToString()) // argument untuk parameter joinToString-nya default
        println("= = = = = = = = =")

    // menggunakan function joinToString(separator, prefix, suffix, transform)
        val dataString2: String = student.joinToString("|", "Awal-", "-Akhir") { value ->
            "value : $value"
        }
        println(dataString2)
        println("= = = = = = = = =")

    // menggunakan function joinTo(Appendable, separator, prefix, suffix, transform)
        val appendable: Appendable = StringBuilder()
        student.joinTo(appendable, " ", "Awal-", "-Akhir") {value -> value.uppercase()}
        appendable.appendLine()
        student.joinTo(appendable, "|", "(", ")") {value -> value.uppercase()}
        val dataString3: String = appendable.toString()
        println(dataString3)
}