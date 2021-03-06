workspace(name = "zeno")

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

# Bazel rules: proto (without grpc)
## See: https://github.com/bazelbuild/rules_proto/releases/tag/4.0.0-3.19.2.
http_archive(
    name = "rules_proto",
    sha256 = "c22cfcb3f22a0ae2e684801ea8dfed070ba5bed25e73f73580564f250475e72d",
    strip_prefix = "rules_proto-4.0.0-3.19.2",
    urls = [
        "https://github.com/bazelbuild/rules_proto/archive/refs/tags/4.0.0-3.19.2.tar.gz",
    ],
)

load("@rules_proto//proto:repositories.bzl", "rules_proto_dependencies", "rules_proto_toolchains")

rules_proto_dependencies()

rules_proto_toolchains()

# Bazel Rule: kotlin
rules_kotlin_version = "v1.5.0"

rules_kotlin_sha = "12d22a3d9cbcf00f2e2d8f0683ba87d3823cb8c7f6837568dd7e48846e023307"

http_archive(
    name = "io_bazel_rules_kotlin",
    sha256 = rules_kotlin_sha,
    urls = ["https://github.com/bazelbuild/rules_kotlin/releases/download/%s/rules_kotlin_release.tgz" % rules_kotlin_version],
)

load("@io_bazel_rules_kotlin//kotlin:repositories.bzl", "kotlin_repositories")

kotlin_repositories()

load("@io_bazel_rules_kotlin//kotlin:core.bzl", "kt_register_toolchains")

kt_register_toolchains()

# Bazel Rule: maven
load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

RULES_JVM_EXTERNAL_TAG = "4.2"

RULES_JVM_EXTERNAL_SHA = "cd1a77b7b02e8e008439ca76fd34f5b07aecb8c752961f9640dea15e9e5ba1ca"

http_archive(
    name = "rules_jvm_external",
    sha256 = RULES_JVM_EXTERNAL_SHA,
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % RULES_JVM_EXTERNAL_TAG,
)

load("@rules_jvm_external//:repositories.bzl", "rules_jvm_external_deps")

rules_jvm_external_deps()

load("@rules_jvm_external//:setup.bzl", "rules_jvm_external_setup")

rules_jvm_external_setup()

load("@rules_jvm_external//:defs.bzl", "maven_install")

maven_install(
    artifacts = [
        "junit:junit:4.12",
        "org.jetbrains.kotlin:kotlin-test-junit:1.6.10",

        # CLI
        "com.github.ajalt.clikt:clikt-jvm:3.4.0",

        # flogger
        "com.google.flogger:flogger:0.7.1",
        "com.google.flogger:flogger-system-backend:0.7.1",

        # grpc-java
        "com.google.protobuf:protobuf-java:3.19.1",
        "com.google.api.grpc:proto-google-common-protos:2.6.0",
        "com.google.guava:guava:30.1-jre",
        "org.apache.tomcat:annotations-api:6.0.53",
        "io.grpc:grpc-netty-shaded:1.42.0",
        "io.grpc:grpc-protobuf:1.42.0",
        "io.grpc:grpc-stub:1.42.0",
        "io.grpc:grpc-services:1.42.0",
        "io.grpc:grpc-core:1.42.0",
        "io.grpc:grpc-api:1.42.0",

        # grpc-kotlin
        "io.grpc:grpc-kotlin-stub:1.2.0",
    ],
    repositories = [
        # Private repositories are supported through HTTP Basic auth
        "https://maven.google.com",
        "https://repo1.maven.org/maven2",
    ],
)
