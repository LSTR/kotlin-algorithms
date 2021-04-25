#!/usr/bin/env sh

#Use command > sh compiler.sh filename input

kotlin_file=$1
jar_file="main.jar"
input=$2

kotlinc "${kotlin_file}" -include-runtime -d "${jar_file}"
java -jar "${jar_file}" "${input}"