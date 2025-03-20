import java.math.BigInteger

fun main() {

}

tailrec fun fact(n: Long, acc: BigInteger = BigInteger.ONE) : BigInteger =
    when(n) {
        0L -> acc
        1L -> acc
        else -> fact(n-1, acc * BigInteger.valueOf(n))
    }


tailrec fun fact(n : Long) : BigInteger =
    when(n) {
        0L -> BigInteger.ONE
        1L -> BigInteger.ONE
        else -> BigInteger.valueOf(n) * fact(n-1)
    }