package oop

fun main(args: Array<String>) {
    println(StatusPost.Published.getHtmlButton())
    println(StatusPost.Draft.getHtmlButton())
}

enum class StatusPost(private val status: String) {
    Published("published"),
    Draft("Draft"),
    Archived("archived"),
    Deleted("deleted");

    fun getCssClass(): String {
        return when (status) {
            Published.status -> "is-success"
            Draft.status -> "is-black"
            Archived.status -> "is-link"
            Deleted.status -> "is-danger"
            else -> ""
        }
    }

    fun getTitle(): String {
        return when (status) {
            Published.status -> "Опубликован"
            Draft.status -> "Черновик"
            Archived.status -> "В архиве"
            Deleted.status -> "Удален"
            else -> ""
        }
    }

    fun getHtmlButton() = "<span class='tag {${getCssClass()}}'>{${getTitle()}}</span>"
}