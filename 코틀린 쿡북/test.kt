data class Tmp(
    val name : String,
    val ss : Int
)

fun main() {
    for (n in 1..10) {
        val x = when (n % 3) {
            0 -> "$n % 3 == 0"
            1 -> "$n % 3 == 1"
            2 -> "$n % 3 == 2"
            else -> throw Exception("나올 수가 없는디")
        }
    }
    val tmp = throw Exception("1")
}
fun ss(): Nothing = throw Exception("1")

fun sss() {
    throw Exception("@")
}