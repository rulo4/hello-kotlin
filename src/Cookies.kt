fun getFortuneCookie(birthday: Int) : String {
    val messages = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )

    val selectedMessage = when (birthday) {
        in 1 .. 7   -> birthday - 1
        else        -> birthday.rem(messages.size)
    }

    return messages[selectedMessage]
}

fun askBirthday(): Int {
    print("When is your birth day? ")
    return readLine()?.toIntOrNull()?: 1
}

fun askFortuneCookie() {
    println(getFortuneCookie(askBirthday()))
}

fun askFortuneCookieTenTimesOrTakeItEasy() {
    for (intent in 1 .. 10) {
        val birthday = askBirthday()
        val message = getFortuneCookie(birthday)
        println(message)
        if (message == "Take it easy and enjoy life!") {
            break
        }
    }
}
