fun createNote(archive: Archive) {
    val name = getValidInput("Введите название заметки:")
    val text = getValidInput("Введите текст заметки:")
    val note = Note(name, text)
    archive.notes.add(note)
    println("Заметка '$name' успешно создана")
}