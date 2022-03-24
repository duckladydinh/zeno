#!/bin/bash

source gbash.sh || (echo "Please add common/shell/gbash.sh to your PATH." && exit)

binary=$(rlocation "zeno/examples/atcoder/twosat_example")
input=$(rlocation "zeno/examples/atcoder/twosat_example.txt")
$binary <"$input"
