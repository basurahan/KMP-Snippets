package link.limecode.sharedhttprequest

import io.ktor.client.HttpClient

interface KtorClient {
    val http: HttpClient
}

expect fun getKtorClient(): KtorClient