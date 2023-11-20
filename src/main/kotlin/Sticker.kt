data class Sticker(
    val productId: Int = 1,
    val stickerId: Int = 1,
    val images: Array<Images> = emptyArray(),
    val imagesWithBackground: Array<ImagesWithBackground> = emptyArray(),
) {
    data class Images(
        val url: String = "url",
        val width: Int = 100,
        val height: Int = 50
    )
    data class ImagesWithBackground(
        val url: String = "url",
        val width: Int = 100,
        val height: Int = 50
    )
}