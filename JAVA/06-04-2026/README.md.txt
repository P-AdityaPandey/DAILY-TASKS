# Java JVM Concepts Proof

This project demonstrates core Java memory and behavior concepts.

### 1. Pass-by-Value
- **Proof:** In `SwapDemo.java`, swapping two integers inside a method does not affect the original variables in the `main` method.
- **Logic:** Java always passes a copy of the primitive value, not the actual variable.

### 2. String Constant Pool (SCP)
- **Proof:** In `StringPoolDemo.java`, `s1 == s2` is true for literals, but `s1 == s3` is false for `new String()`.
- **Logic:** Literals are stored in the SCP to save memory, while `new` creates a unique object in the Heap.

### 3. Integer Cache Boundary
- **Proof:** In `IntegerCacheDemo.java`, `127 == 127` is true, but `128 == 128` is false.
- **Logic:** Java caches Integer objects from -128 to 127 for performance optimization.

### How to Run with GC Logs
To see how the JVM manages memory while running these:
`java -verbose:gc ClassName`
