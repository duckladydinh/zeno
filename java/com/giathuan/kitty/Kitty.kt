package com.giathuan.kitty

import com.github.ajalt.clikt.completion.completionOption
import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.options.default
import com.github.ajalt.clikt.parameters.options.option

class Kitty : CliktCommand() {
    val name by option(help = "Name of the kitty").default("Kitty")

    override fun run() {
        println("Hello, $name")
    }
}

fun main(vararg args: String) = Kitty().completionOption().main(args)
