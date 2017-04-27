# Using Abstraction in Java (Week 8 Lecture 2)

## Table of Contents
<!-- TOC -->

- [Using Abstraction in Java (Week 8 Lecture 2)](#using-abstraction-in-java-week-8-lecture-2)
    - [Table of Contents](#table-of-contents)
    - [Using Abstraction at Code Level](#using-abstraction-at-code-level)
    - [Features of Java](#features-of-java)
        - [Class](#class)
            - [Visibiltiy Modifiers](#visibiltiy-modifiers)
            - [The Abstract Class](#the-abstract-class)
            - [Hinge Points](#hinge-points)
        - [Packages](#packages)
            - [Nesting Packages](#nesting-packages)
        - [Abtraction Layers](#abtraction-layers)

<!-- /TOC -->

## Using Abstraction at Code Level
- Abtraction is a **design principle** rather than a _programming technique_
- You do not have to write generic classes in this unit

## Features of Java
### Class
- is the most important mechnaism in most OO Languages (incl. Java)
    - represent single concept
    - expose a public interface that allows response in order to furfill its responsiblity
    - hide any implementation details that don't directly fullfil that responsiblity
    - ensures that its attribution are in a valid condition rather than relying  on client code to maintain its state

#### Visibiltiy Modifiers
- These include `public`, `private` and `protected`
- in general when in doubt make it `private`
- only provide `getters` and `setters` if you're sure that external classes need to directly manipulate
- if you leave the visibility modifier, your class/attribute/method will be visible within the package which is declared.

#### The Abstract Class
- The `abstract` class cant be instantiated
    - may lack important components
    - such as method bodies
    - inherits the methods and attributes, this means that it can implement the public methods and the attributes specified by the  **base** class.

#### Hinge Points
- Applying dependency inversion to a single relationship.
- We take a class, seperately define it's interface as an abstract entity, seperate the code. We can let the client code interact with the abstract interface. They only interact with each other through the interface.
![https://upload.wikimedia.org/wikipedia/commons/8/8d/DIPLayersPattern.png](https://upload.wikimedia.org/wikipedia/commons/8/8d/DIPLayersPattern.png)

### Packages
We want to split things up into packages.
- We group a bunch of `classes` and bundle it into a subsystem.
- The boundary around a package is also an encapsulation boundary.

#### Nesting Packages
- You can't put a package inside another package in Java
- `java.util.jar` is not a package within `java.util`
- If you want to use the package, you have explicitly import (e.g. `import java.util`)

### Abtraction Layers
- An **abstraction layer** is the publicly accessible interface to a class, package or subsystem.
- You can create an abstraction layer by restricting visiblity as much as possible.
- One problem is to making too much public.