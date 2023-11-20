data class Photo(

    val id: Int = 1,
    val albumId: Int = 1,
    val ownerId: Int = 1,
    val userId: Int = 1,
    val text: String = "text",
    val date: Int = 1,
    val sizes: Array<Sizes> = emptyArray(),
    val width: Int = 1,
    val height: Int = 1

) {
    data class Sizes(

        val type: String = "type",
        val url: String = "url",
        val width: Int = 100,
        val height: Int = 100
    )
}