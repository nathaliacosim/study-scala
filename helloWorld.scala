object HelloWorld {
    def info(msg: String): Unit = println(s"Info: $msg")
}

val teste = HelloWorld.info("Hello World!")