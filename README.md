# NullPointerException in Generic Scala Method

This example demonstrates a common `NullPointerException` in Scala when working with generic types.  The `myMethod` within `MyClass` isn't designed to handle `null` inputs, leading to the exception when a `null` value is passed.

The solution involves adding a null check to handle such scenarios gracefully.

## How to reproduce:

1.  Save the code in `bug.scala`.
2.  Compile and run using the Scala compiler (e.g., `scalac bug.scala` and `scala Main`).

You'll observe a `NullPointerException` being thrown.

## Solution:

The `bugSolution.scala` file provides a corrected version.

This repository highlights the importance of robust null handling, especially when working with generics.