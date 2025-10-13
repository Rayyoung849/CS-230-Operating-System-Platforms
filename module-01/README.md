# Module 1 — UML Class Diagram

## Overview
This folder has my UML class diagram based on four Java files: Vehicle, TwoWheeled, Bicycle, and Driver. The goal was to read the code and show the classes and their relationships in a diagram.

## Files
- uml-class-diagram.png
- src/Vehicle.java
- src/TwoWheeled.java
- src/Bicycle.java
- src/Driver.java

## How I made it
1. Opened the Java files in Eclipse.
2. Noted classes, fields, methods, and which class extends which.
3. Drew the diagram in Lucidchart and exported it as a PNG.

## OOP ideas in this code
- Inheritance: TwoWheeled extends Vehicle, Bicycle extends TwoWheeled.
- Encapsulation: fields are set and read through methods instead of direct access.
- Polymorphism: code can use a Vehicle reference and call behavior on subclasses.

## Note
Inheritance arrow should be the UML generalization arrow (hollow triangle). I kept the original diagram here and added this note.
