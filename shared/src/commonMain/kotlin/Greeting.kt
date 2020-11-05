expect fun getPlatform(): String

class Greeting {
    fun greet() = "Hello from ${getPlatform()}"
}
