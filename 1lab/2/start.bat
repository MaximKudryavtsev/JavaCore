javac -d build src/main/java/CaesarCipher.java
cd build
java CaesarCipher %~1 %~2 %~3
cd ../
