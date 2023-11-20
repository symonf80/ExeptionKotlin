data class Document(

    val id: Int = 1,
    val ownerId: Int = 1,
    val title: String = "title",
    val size: Int = 1,
    val ext: String = "ext",
    val url: String = "url",
    val date: Int = 1,
    val type: Int = 1,
    val preview: Preview = Preview()
) {

    data class Preview(
        val photo: Array<Photo> = emptyArray(),
        val graffiti: Graffiti = Graffiti(),
        val audioMessage: AudioMessage = AudioMessage(),
    ) {

        data class Photo(
            val sizes: Int = 1
        )


        data class Graffiti(
            val src: String = "src",
            val width: Int = 10,
            val height: Int = 5
        )

        data class AudioMessage(
            val duration: Int = 100,
            val waveform: Array<Int> = emptyArray<Int>(),
            val linkOgg: String = "linkOgg",
            val linkMp3: String = "mp3"
        )
    }
}
