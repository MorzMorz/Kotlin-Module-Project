fun showNotes(archive: Archive) {
    if (archive.notes.isEmpty()) {
        println("Список заметок пуст")
    } else {
        println("Список заметок:")
        archive.notes.forEachIndexed { index, note ->
            println("${index + 1}. ${note.name}")
        }
    }
    InputToReturn("Введите '0' чтобы вернуться в предыдущее меню...") { input ->
        if (input == "0") {
            return@InputToReturn
        }
        val noteIndex = input.toIntOrNull()?.minus(1)
        if (noteIndex != null && noteIndex in archive.notes.indices) {
            viewNote(archive.notes[noteIndex])
        } else {
            println("Некорректный ввод. Попробуйте снова")
        }
    }
}