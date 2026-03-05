import java.util.Stack

fun main() {
    val n = readln().toInt()
    val arr = readln().split(" ").map { it.toInt() }
    val ngf = Array(n) { -1 }
    val f = mutableMapOf<Int,Int>()
    val s1 = Stack<Int>()
    for(i in arr) f[i] = f.getOrDefault(i, 0) + 1
    s1.push(0)
    for(i in 1..<n) {
        if(ngf[s1.peek()] == -1 && f[arr[s1.peek()]]!! < f[arr[i]]!!) {
            while(true) {
                if(s1.isEmpty() || ngf[s1.peek()] != -1) break
                if(ngf[s1.peek()] == -1 && f[arr[s1.peek()]]!! >= f[arr[i]]!!) break
                val tmp = s1.pop()
                ngf[tmp] = arr[i]
            }
        }
        s1.push(i)
    }
    println(ngf.joinToString(" "))
}
