#!/bin/bash
ROOT_DIR=$(pwd)

echo "=== Building project with Maven ==="
mvn clean package

echo "=== Executing compiled JAR file ==="
java -jar target/cicd-demo-1.0-SNAPSHOT.jar