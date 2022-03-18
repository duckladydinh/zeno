package com.giathuan.examples.fibonacci.v1

import io.grpc.Status.Code
import io.grpc.StatusRuntimeException
import io.grpc.inprocess.InProcessChannelBuilder
import io.grpc.inprocess.InProcessServerBuilder
import io.grpc.protobuf.services.ProtoReflectionService
import org.junit.BeforeClass
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith


class FibonacciServiceTest {

    companion object {
        @JvmStatic
        private lateinit var stub: FibonacciServiceGrpc.FibonacciServiceBlockingStub

        @BeforeClass
        @JvmStatic
        fun setup() {
            val srvName = InProcessServerBuilder.generateName()
            val server = InProcessServerBuilder.forName(srvName)
                .directExecutor()
                .addService(ProtoReflectionService.newInstance())
                .addService(FibonacciService())
                .build()
            server.start()

            stub =
                FibonacciServiceGrpc.newBlockingStub(
                    InProcessChannelBuilder.forName(srvName).directExecutor().build()
                )
        }
    }

    @Test
    fun testGetFibonacciForTenShouldReturnFiftyFive() {
        val resp = stub.getFibonacci(GetFibonacciRequest.newBuilder().setIndex(10).build())
        assertEquals(55, resp.value)
    }

    @Test
    fun testGetFibonacciForInvalidIndexShouldThrowInvalidArgument() {
        val error = assertFailsWith<StatusRuntimeException> {
            stub.getFibonacci(GetFibonacciRequest.newBuilder().setIndex(-1).build())
        }
        assertEquals(Code.INVALID_ARGUMENT, error.status.code)
    }
}