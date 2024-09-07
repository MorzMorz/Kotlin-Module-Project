import java.util.Scanner

fun displayMenu(menuItems: List<String>) {
    println("Список меню:")
    menuItems.forEachIndexed { index, item ->
        println("${index + 1}. $item")
    }
}

fun getInput(): String {
    val scanner = Scanner(System.`in`)
    return scanner.nextLine()
}

fun getValidInput(prompt: String): String {
    var input: String
    do {
        println(prompt)
        input = getInput()
        if (input.isBlank()) {
            println("Ошибка: ввод не может быть пустым!")
        }
    } while (input.isBlank())
    return input
}

fun InputToReturn(prompt: String, onInput: (String) -> Unit) {
    println(prompt)
    val input = getInput()
    onInput(input)
}