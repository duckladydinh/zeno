load("@io_bazel_rules_kotlin//kotlin:jvm.bzl", "kt_jvm_test")

kt_jvm_test(
    name = "fibonacci_test",
    srcs = ["FibonacciServiceTest.kt"],
    test_class = "com.giathuan.examples.fibonacci.v1.FibonacciServiceTest",
    deps = [
        "//:gen_java_lib",
        "//:gen_kotlin_lib",
        "//java/com/giathuan/examples/fibonacci/v1:fibonacci_lib",
        "@maven//:org_jetbrains_kotlin_kotlin_test_junit",
    ],
)
