load("@io_bazel_rules_kotlin//kotlin:jvm.bzl", "kt_jvm_library")
load("//common:build_defs.bzl", "java_elf")

kt_jvm_library(
    name = "kitty_lib",
    srcs = glob([
        "*.kt",
        "**/*.kt",
    ]),
    deps = [
        "@maven//:com_github_ajalt_clikt_clikt_jvm",
    ],
)

java_binary(
    name = "kitty_bin",
    main_class = "com.giathuan.examples.kitty.KittyKt",
    runtime_deps = [":kitty_lib"],
)

java_elf(
    name = "kitty",
    java_binary = ":kitty_bin",
)
