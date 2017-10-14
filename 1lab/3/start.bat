javac -d build src/main/java/PasswordGenerator.java
cd build
java PasswordGenerator %~1 %~2
pause
cd ../
