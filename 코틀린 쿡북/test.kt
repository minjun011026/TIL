fun sum(vararg num : Int) = num.reduce{ acc,n -> acc+ 3 * n}


fun main() {
    sum(1,2,3)
}