load("@io_bazel_rules_kotlin//kotlin:jvm.bzl", "kt_jvm_library")

package(default_visibility = ["//visibility:public"])

java_library(
    name = "gen_java_lib",
    srcs = glob([
        "gen/**/*.java",
        "gen/*.java",
    ]),
    exports = [
        "@maven//:io_grpc_grpc_api",
        "@maven//:io_grpc_grpc_core",
        "@maven//:io_grpc_grpc_services",
    ],
    deps = [
        "@maven//:com_google_api_grpc_proto_google_common_protos",
        "@maven//:com_google_guava_guava",
        "@maven//:com_google_protobuf_protobuf_java",
        "@maven//:io_grpc_grpc_api",
        "@maven//:io_grpc_grpc_netty_shaded",
        "@maven//:io_grpc_grpc_protobuf",
        "@maven//:io_grpc_grpc_services",
        "@maven//:io_grpc_grpc_stub",
        "@maven//:org_apache_tomcat_annotations_api",
    ],
)

kt_jvm_library(
    name = "gen_kotlin_lib",
    srcs = glob([
        "gen/**/*.kt",
        "gen/*.kt",
    ]),
    deps = [
        ":gen_java_lib",
        "@maven//:io_grpc_grpc_kotlin_stub",
    ],
)
