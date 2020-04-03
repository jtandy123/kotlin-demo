# Kotlin


- Kotlin简洁、轻巧，特别适合于Android上APP的构建
- Kotlin本质上就是jar包，引入就可以使用
- Kotlin是运行于JVM之上的语言，对Java的补充和改进
- Kotlin与Java可以进行完全的互操作：Kotlin可以调用Java，Java也可以访问Kotlin  

---

### Kotlin Compiler
Kotlin中所编写的不在类当中的函数，最终转换成字节码之后都会位于类当中，这样才符合JVM对字节码的规范和要求。
类由kotlinc编译器在编译的过程中自动生成，类名就是在原有类名的基础上加上"Kt"作为后缀，例如：hell.kt，编译后生成HelloKt.class

`> kotlinc hello.kt`   
生成HelloKt.class和META-INF目录（不包含MANIFEST.MF文件）
  
`> kotlinc hello.kt -d hello.jar`  
hello.jar中包括HelloKt.class和META-INF目录
   
`> kotlinc hello.kt -include-runtime -d hello.jar`
hello.jar中包括HelloKt.class、kotlin目录和META-INF目录  

注：META-INF目录中包括main.kotlin_module和MANIFEST.MF文件；kotlin目录包括运行时库  

---


