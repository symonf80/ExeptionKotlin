data class Page(

    val id: Int = 1,
    val groupId: Int = 1,
    val creatorId: Int = 1,
    val title: String = "title",
    val currentUserCanEdit: Boolean = true,
    val currentUserCanEditAccess: Boolean = true,
    val whoCanView: Int = 1,
    val whoCanEdit: Int = 1,
    val edited: Int = 1,
    val created: Int = 1,
    val editorId: Int = 1,
    val views: Int = 1,
    val parent: String = "parent",
    val parent2: String = "parent2",
    val source: String = "source",
    val html: String = "html",
    val viewUrl: String = "viewUrl"
)