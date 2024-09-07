fun createArchive(): Archive {
    val name = getValidInput("Введите название архива:")
    return Archive(name)
}