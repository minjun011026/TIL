import java.time.LocalDate

class LocalDateProgression(
    override val start: LocalDate,
    override val endInclusive: LocalDate,
    val step: Long = 1
) : Iterable<LocalDate>, ClosedRange<LocalDate> {
    override fun iterator(): Iterator<LocalDate> =
        LocalDateProgressionIterator(start, endInclusive, step)

    infix fun step(days: Long) = LocalDateProgression(start, endInclusive, days)
}

internal class LocalDateProgressionIterator(
    first: LocalDate,
    val last: LocalDate,
    val step: Long
) : Iterator<LocalDate> {

    private var current = first

    override fun hasNext(): Boolean = current <= last

    override fun next(): LocalDate {
        val next = current
        current = current.plusDays(step)
        return next
    }
}


operator fun LocalDate.rangeTo(other: LocalDate) =
    LocalDateProgression(this, other)

fun main() {
    val startDate = LocalDate.now()
    val midDate = startDate.plusDays(3)
    val endDate = startDate.plusDays(5)

    val dateRange = startDate..endDate

    for (day in dateRange) println(day)

}

