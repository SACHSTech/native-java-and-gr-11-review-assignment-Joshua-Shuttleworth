#!/bin/bash
read -p 'File Name: ' name
tests=Test
javac -d bin src/gr11review/part1/$name.java; javac -d bin -sourcepath src -classpath lib/junit-platform-console-standalone-1.7.0-M1.jar src/gr11review/test1/$name$tests.java
java -jar lib/junit-platform-console-standalone-1.7.0-M1.jar --class-path bin -c gr11review.test1.$name$tests