data class Post(
    val id: Int = 1,
    val ownerId: Int = 1,
    val fromId: Int = 1,
    val createdBy: Int = 1,
    val date: Int = 1,
    val text: String? = "text",
    val replyOwnerId: Int = 1,
    val replyPostId: Int = 1,
    val friendsOnly: Boolean = true,
    val comments: Comments? = Comments(),
    val copyright: String = "copyright",
    val likes: Likes? = Likes(),
    val reposts: Reposts? = Reposts(),
    val views: Views = Views(),
    val postType: String = "postType",
    val postSource: PostSource = PostSource(),
    val attachments: Array<Attachment> = emptyArray(),
    val geo: Geo = Geo(),
    val signerId: Int = 1,
    val copyHistory: Array<CopyHistory> = emptyArray(),
    val canPin: Boolean = true,
    val canDelete: Boolean = true,
    val canEdit: Boolean = true,
    val isPinned: Boolean = true,
    val markedAsAds: Boolean = true,
    val isFavorite: Boolean = true,
    val postponedId: Int = 1

) {
    data class Comments(

        val count: Int = 10,
        val canPost: Boolean = true,
        val groupsCanPost: Boolean = true,
        val canClose: Boolean = true,
        val canOpen: Boolean = true
    )

    data class Likes(

        val count: Int = 1,
        val userLikes: Boolean = true,
        val canLike: Boolean = true,
        val canPublish: Boolean = true
    )

    data class Reposts(

        val count: Int = 2,
        val userReposted: Boolean = true
    )

    data class Views(
        val count: Int = 1
    )


    data class Geo(

        val type: String = "type",
        val coordinates: String = "coordinates",
        val place: Place = Place()
    )

    data class Place(
        val someData: Int = 1
    )

    data class CopyHistory(

        val someData: Int = 1
    )
}