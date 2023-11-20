import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {

        val data = WallService().add(Post()).id
        assertNotEquals(0, data)
    }

    @Test
    fun updateTrue() {

        val service = WallService()
        service.add(Post(id = 1))
        service.add(Post(id = 2))
        service.add(Post(id = 3))
        val update = Post(id = 3)
        val result = service.update(update)
        assertTrue(result)
    }

    @Test
    fun updateFalse() {

        val service = WallService()
        service.add(Post(id = 1))
        service.add(Post(id = 2))
        service.add(Post(id = 3))
        val update = Post(id = 5)
        val result = service.update(update)
        assertFalse(result)

    }

    @Test
    fun commentAdded() {
        val postId = 1
        val service = WallService()
        val post = Post(id = 1)
        val comment = Comment()
        service.add(post)
        service.createComment(postId, comment)
        assertNotEquals(0, service.comments.size)
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        val service = WallService()
        val post = Post()
        val comment = Comment()
        service.add(post)
        service.createComment(2, comment)
    }
}