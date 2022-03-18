package com.giathuan.examples.fibonacci.v1

import com.google.common.flogger.FluentLogger
import io.grpc.ServerBuilder
import io.grpc.protobuf.services.ProtoReflectionService

class FibonacciServer {
    companion object {
        @JvmStatic
        private val LOGGER = FluentLogger.forEnclosingClass()

        @JvmStatic
        fun main(vararg args: String) {
            val port = 9999
            LOGGER.atInfo().log("#FibonacciServer: port = %d\n", port)

            val server = ServerBuilder.forPort(port).addService(ProtoReflectionService.newInstance())
                .addService(FibonacciService())
                .build()

            server.start().awaitTermination()
        }
    }
}