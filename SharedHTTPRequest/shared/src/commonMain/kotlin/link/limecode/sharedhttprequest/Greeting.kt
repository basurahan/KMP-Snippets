package link.limecode.sharedhttprequest

import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText

class Greeting {
    private val platform: Platform = getPlatform()
    private val ktorClient: KtorClient = getKtorClient()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }

    suspend fun loadData(): String {
        val response = ktorClient.http.get("https://ktor.io/docs/")
        return response.bodyAsText()
    }
}