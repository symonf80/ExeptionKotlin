fun main() {
    val post = Post()
    val wall = WallService()
    val comment = Comment()
    wall.add(post)
    try {
        wall.createComment(1, comment)
        println("Коментарий добавлен ")
    } catch (e: PostNotFoundException) {
        println(e.message)
    }
}


