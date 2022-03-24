# A starter Bazel project.

## Why Zeno?

In Dragon Ball Super, Grand Zeno is the Absolute God of everything. Similarly, Bazel is a monorepo for every language
and project. Therefore, I nickname it as Zeno.

## Why a starter project?

Despite being an awesome tool, Bazel - or any Google OSS project - is extremely difficult to onboard. That's why a
starter project is needed.

## How to use?

This project should be read as an example. Well, I am honestly not sure this is the best way to onboard Bazel easily
yet, but I'll try to make every commit as small as relevant as possible.

## Libraries

### `third_party/ac-library`

This C++ library is provided by AtCoder for implementing popular algorithms in competitive programming. To add it as a
submodule, run:

```shell
$ git submodule add https://github.com/atcoder/ac-library third_party/ac-library
$ git submodule update --remote
```
