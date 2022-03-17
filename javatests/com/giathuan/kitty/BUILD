load("@io_bazel_rules_kotlin//kotlin:jvm.bzl", "kt_jvm_test")

kt_jvm_test(
    name = "kitty_test",
    srcs = ["KittyTest.kt"],
    test_class = "com.giathuan.kitty.KittyTest",
    deps = [
        "@maven//:org_jetbrains_kotlin_kotlin_test_junit",
    ],
)
