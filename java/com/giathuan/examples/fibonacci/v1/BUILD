load("@io_bazel_rules_kotlin//kotlin:jvm.bzl", "kt_jvm_library")

package(default_visibility = ["//visibility:public"])

kt_jvm_library(
    name = "fibonacci_lib",
    srcs = glob([
        "*.kt",
        "**/*.kt",
    ]),
    runtime_deps = [
        "@maven//:com_google_flogger_flogger_system_backend",
    ],
    deps = [
        "//:gen_java_lib",
        "//:gen_kotlin_lib",
        "@maven//:com_google_flogger_flogger",
    ],
)

java_binary(
    name = "fibonacci_bin",
    main_class = "com.giathuan.examples.fibonacci.v1.FibonacciServer",
    runtime_deps = [
        ":fibonacci_lib",
    ],
)
