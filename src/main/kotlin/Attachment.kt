interface Attachment {
    val type: String
}

class AttachmentAudio(val audio: Audio) : Attachment {

    override val type: String = "audio"
    override fun toString(): String {
        return "\n $audio"
    }

}

class AttachmentPhoto(val photo: Photo) : Attachment {

    override val type: String = "photo"
    override fun toString(): String {
        return "\n $photo"
    }
}

class AttachmentVideo(val video: Video) : Attachment {

    override val type: String = "video"
    override fun toString(): String {
        return "\n $video"
    }
}

class AttachmentDoc(val doc: Document) : Attachment {

    override val type: String = "doc"
    override fun toString(): String {
        return "\n $doc"
    }
}

class AttachmentLink(val link: Link) : Attachment {

    override val type: String = "link"
    override fun toString(): String {
        return "\n $link"
    }
}

class AttachmentNote(val note: Note) : Attachment {

    override val type: String = "note"
    override fun toString(): String {
        return "\n $note"
    }
}

class AttachmentPoll(val poll: Poll) : Attachment {

    override val type: String = "poll"
    override fun toString(): String {
        return "\n $poll"
    }
}

class AttachmentPage(val page: Page) : Attachment {

    override val type: String = "page"
    override fun toString(): String {
        return "\n $page"
    }
}

class AttachmentSticker(val sticker: Sticker) : Attachment {

    override val type: String = "sticker"
    override fun toString(): String {
        return "\n $sticker"
    }
}
