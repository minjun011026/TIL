import java.util.*
import kotlin.math.ceil
import kotlin.math.sqrt

fun main() {
    fun numberSequence() = sequence {
        var num = 1
        while(true){
            yield(num)
            num += 1
        }
    }
    val nums = numberSequence().take(10).toList()
    println(nums)
}
