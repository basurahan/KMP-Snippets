package link.limecode.sharedhttprequest

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform