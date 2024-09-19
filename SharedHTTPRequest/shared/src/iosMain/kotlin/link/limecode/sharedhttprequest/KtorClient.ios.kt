package link.limecode.sharedhttprequest

import io.ktor.client.HttpClient
import io.ktor.client.engine.darwin.Darwin

class KtorIOS: KtorClient {

    override val http: HttpClient
        get() = HttpClient(Darwin.create())
}

actual fun getKtorClient(): KtorClient = KtorIOS()