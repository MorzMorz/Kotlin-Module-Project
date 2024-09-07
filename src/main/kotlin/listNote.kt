fun listNotes(archive: Archive) {
    val menuItems = listOf("Создать заметку", "Мои заметки", "Назад")

    while (true) {
        displayMenu(menuItems)
        when (val selection = getInput()) {
            "1" -> createNote(archive)
            "2" -> showNotes(archive)
            "3" -> {
                println("Возвращаюсь назад...")
                return
            }
            else -> println("Некорректный ввод. Попробуйте снова")
        }
    }
}