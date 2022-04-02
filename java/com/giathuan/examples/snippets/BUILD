load("@rules_java//java:defs.bzl", "java_proto_library")
load("@rules_proto//proto:defs.bzl", "proto_library")

java_binary(
    name = "JSnippet",
    srcs = ["JSnippets.java"],
    main_class = "com.giathuan.examples.snippets.JSnippets",
    deps = [
        ":jsnippets_java_proto",
        "@maven//:com_google_guava_guava",
    ],
)

proto_library(
    name = "jsnippets_proto",
    srcs = ["jsnippets.proto"],
    deps = [],
)

java_proto_library(
    name = "jsnippets_java_proto",
    deps = [":jsnippets_proto"],
)
