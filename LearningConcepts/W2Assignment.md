
 🔎 The Class in Java

 Class is a built-in class in the package java.lang.
It represents the runtime metadata of a Java type (class, interface, enum, etc.).
 Whenever you load a .class file, the JVM creates an instance of java.lang.Class that holds information about that type.
👉 This is part of Java Reflection.

📌 The method forName()
 forName(String className) is a static method inside the Class class.
 Its job: dynamically load a class into memory at runtime using its fully qualified name.
If successful, it returns a Class<?> object (the runtime representation of that class).


 try {
    Class<?> cls = Class.forName("java.util.ArrayList");
    System.out.println("Class loaded: " + cls.getName());
} catch (ClassNotFoundException e) {
    System.out.println("Class not found: " + e);
 }
 Output:


 Class loaded: java.util.ArrayList
















