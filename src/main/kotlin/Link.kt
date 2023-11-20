data class Link(

    val url: String = "url",
    val title: String = "title",
    val caption: String = "caption",
    val description: String = "description",
    val photo: Photo = Photo(),
    val product: Product = Product(),
    val button: Button = Button(),
    val previewPage: String = "previewPage",
    val previewUrl: String = "previewUrl"
) {

    data class Product(
        val price: String = "price"
    )

    class Button()
}