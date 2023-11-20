data class Comment(
    val id: Int = 5,
    val fromId: Int = 2,
    val date: Int = 3,
    val text: String = "text",
    val donut: Donut? = Donut(),
    val replyToUser: Int = 4,
    val replyToComment: Int = 5,
    val attachments: Array<Attachment>? = emptyArray(),
    val parentsStack: Array<Int>? = emptyArray(),
    val thread: Thread? = Thread()
)

data class Donut(
    val isDon: Boolean = true,
    val placeholder: String = "placeholder"
)

data class Thread(
    val count: Int = 6,
    val items: Array<Int>? = emptyArray(),
    val canPost: Boolean = true,
    val showReplyButton: Boolean = true,
    val groupsCanPost: Boolean = true
)