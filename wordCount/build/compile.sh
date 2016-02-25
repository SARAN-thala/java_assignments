#!/usr/bin/env bash
rm -rf out/*.class && javac -cp "lib/*:src:out:test" -d out test/WordCountTest.java;