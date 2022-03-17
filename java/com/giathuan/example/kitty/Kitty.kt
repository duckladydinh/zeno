package com.giathuan.example.kitty

import com.github.ajalt.clikt.completion.completionOption
import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.core.subcommands
import com.github.ajalt.clikt.parameters.options.default
import com.github.ajalt.clikt.parameters.options.option

/**
 * Build the CLI:
 *
 * ```
 * alias kitty=$(bazel info workspace)/bazel-bin/java/com/giathuan/example/kitty/kitty && bazel build -c opt java/com/giathuan/example/kitty:kitty && source <(kitty --generate-completion=bash)
 * ```
 */
private class Kitty : CliktCommand(name = "kitty") {
    init {
        completionOption()
        subcommands(German(), English())
    }

    override fun run() {}


    class German : CliktCommand(name = "german") {
        private val name by option(help = "Name of the kitty").default("Kitty")

        override fun run() {
            println("Hallo, $name!")
        }
    }

    class English : CliktCommand(name = "english") {
        private val name by option(help = "Name of the kitty").default("Kitty")

        override fun run() {
            println("Hello, $name!")
        }
    }
}

fun main(vararg args: String) = Kitty().main(args)
