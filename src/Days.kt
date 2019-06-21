import java.util.*

fun dayOfweek() {
    val dayOfweek: Int = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println("What day is it today?")

    val dayOfweekName: String = when (dayOfweek) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        else -> "Saturday"
    }
    println(dayOfweekName)
}
