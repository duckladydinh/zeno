#!/bin/bash

source gbash.sh || (echo "Please add common/shell/gbash.sh to your PATH." && exit)

main=$(rlocation "zeno/examples/cpp/main")
input=$(rlocation "zeno/examples/cpp/input.txt")
$main <"$input"
