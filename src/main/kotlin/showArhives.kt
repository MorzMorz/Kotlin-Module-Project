fun showArchives(archives: List<Archive>) {
    if (archives.isEmpty()) {
        println("Список архивов пуст")
    } else {
        println("Список архивов:")
        archives.forEachIndexed { index, archive ->
            println("${index + 1}. ${archive.name}")
        }
    }
    InputToReturn("Введите '0' чтобы вернуться в главное меню...") { input ->
        if (input == "0") {
            return@InputToReturn
        }
        val archiveIndex = input.toIntOrNull()?.minus(1)
        if (archiveIndex != null && archiveIndex in archives.indices) {
            listNotes(archives[archiveIndex])
        } else {
            println("Некорректный ввод. Попробуйте снова")
        }
    }
}