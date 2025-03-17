data class tmp(
    val d : Int,
    var s : Int
)

fun main() {
    val a = tmp(1,2)
    val b = a.component2()
}