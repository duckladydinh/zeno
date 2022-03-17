load("@io_bazel_rules_kotlin//kotlin:jvm.bzl", "kt_jvm_library")

kt_jvm_library(
    name = "kitty",
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
    main_class = "com.giathuan.kitty.KittyKt",
    runtime_deps = [":kitty"],
)

genrule(
    name = "kitty_bin_gen",
    srcs = [":kitty_bin_deploy.jar"],
    outs = ["kitty_cli"],
    cmd = """
    echo '#!/usr/bin/java -jar' | cat - $< > $@
    """,
)
