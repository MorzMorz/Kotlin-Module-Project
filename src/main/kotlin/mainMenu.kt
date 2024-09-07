fun mainMenu(archives: MutableList<Archive>) {
    val menuItems = listOf("Создать архив", "Мои Архивы", "Выход")

    while (true) {
        displayMenu(menuItems)
        when (val selection = getInput()) {
            "1" -> {
                archives.add(createArchive())
                println("Архив успешно создан")
            }
            "2" -> showArchives(archives)
            "3" -> {
                println("Завершение программы")
                return
            }
            else -> println("Некорректный ввод. Попробуйте снова")
        }
    }
}