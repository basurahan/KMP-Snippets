package link.limecode.sharedhttprequest

import io.ktor.client.HttpClient
import io.ktor.client.engine.okhttp.OkHttp

class KtorAndroid : KtorClient {

    override val http: HttpClient
        get() = HttpClient(OkHttp.create())
}

actual fun getKtorClient(): KtorClient = KtorAndroid()