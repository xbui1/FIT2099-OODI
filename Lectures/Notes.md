FIT2099 Notes
-----

# 1. Table of Contents
<!-- TOC -->

- [1. Table of Contents](#1-table-of-contents)
- [2. Good Design in Software](#2-good-design-in-software)
    - [2.1. Dependencies](#21-dependencies)
        - [2.1.1. Dependency Control](#211-dependency-control)
        - [2.1.2. Why Dependencies](#212-why-dependencies)
    - [2.2. Connascence](#22-connascence)
        - [2.2.1. Importance of Connascence](#221-importance-of-connascence)
        - [2.2.2. Type of Connascence](#222-type-of-connascence)
            - [2.2.2.1. Connascence of Name](#2221-connascence-of-name)
            - [2.2.2.2. Connascence of Type](#2222-connascence-of-type)
            - [2.2.2.3. Connascence of Position](#2223-connascence-of-position)
            - [2.2.2.4. Connascence of Meaning/Convention (CoM/CoC)](#2224-connascence-of-meaningconvention-comcoc)
            - [2.2.2.5. Connascence of Algorithm](#2225-connascence-of-algorithm)
            - [2.2.2.6. Connascence of Execution (CoE)](#2226-connascence-of-execution-coe)
            - [2.2.2.7. Connascence of Timing (CoT)](#2227-connascence-of-timing-cot)
            - [2.2.2.8. ## Apollo 11 Example](#2228--apollo-11-example)
            - [2.2.2.9. Connascnce of Values (CoV)](#2229-connascnce-of-values-cov)
            - [2.2.2.10. Connascnce of Identity (CoI)](#22210-connascnce-of-identity-coi)
    - [2.3. Contrascence](#23-contrascence)
    - [2.4. Minimising Connascence](#24-minimising-connascence)
- [3. Encpsulation](#3-encpsulation)
    - [3.1. What is Encapsulation?](#31-what-is-encapsulation)
    - [3.2. Mechanisms](#32-mechanisms)
    - [3.3. Using Encapsulation in Java](#33-using-encapsulation-in-java)
    - [3.4. Defensively Copy](#34-defensively-copy)
- [4. Designing Software](#4-designing-software)
    - [4.1. Starting](#41-starting)
    - [4.2. Scenario based design](#42-scenario-based-design)
- [5. Using Abstraction in Java (Week 8 Lecture 2)](#5-using-abstraction-in-java-week-8-lecture-2)
    - [5.1. Using Abstraction at Code Level](#51-using-abstraction-at-code-level)
    - [5.2. Features of Java](#52-features-of-java)
        - [5.2.1. Class](#521-class)
        - [5.2.2. Visibiltiy Modifiers](#522-visibiltiy-modifiers)
        - [5.2.3. The Abstract Class](#523-the-abstract-class)
        - [5.2.4. Hinge Points](#524-hinge-points)
        - [5.2.5. Packages](#525-packages)
        - [5.2.6. Nesting Packages](#526-nesting-packages)
        - [5.2.7. Abtraction Layers](#527-abtraction-layers)
- [6. FIT2099 Week 9 Lecture A](#6-fit2099-week-9-lecture-a)
    - [6.1. Client Supplier Relationship](#61-client-supplier-relationship)
    - [6.2. Software Spec: The Problem](#62-software-spec-the-problem)
    - [6.3. Design by Contract](#63-design-by-contract)
    - [6.4. Software Contract](#64-software-contract)
    - [6.5. Specification of a Class](#65-specification-of-a-class)
    - [6.6. Specs](#66-specs)
- [7. UML Diagram](#7-uml-diagram)
- [8. Java Cheat Sheet](#8-java-cheat-sheet)
    - [Classes](#classes)
    - [Editing, compiling and executing](#editing-compiling-and-executing)
    - [Built-in data types](#built-in-data-types)
    - [Declaration and Assignment Statements](#declaration-and-assignment-statements)
    - [Integers](#integers)
    - [Floating-point numbers](#floating-point-numbers)
    - [Type Conversion and Library Calls](#type-conversion-and-library-calls)
    - [If and else](#if-and-else)
        - [Switch Statement](#switch-statement)
    - [Loops](#loops)
    - [Functions](#functions)
    - [Constructors](#constructors)
        - [Instance Methods](#instance-methods)

<!-- /TOC -->
# 2. Good Design in Software 
Some Combination of
- Functionaly correct
- Performs well enough
- Usable
- Reliable
- Maintainable

_these are the properties of the system, not any design artifacts_

## 2.1. Dependencies
### 2.1.1. Dependency Control
- Biggest issue in design
- Controlling the extent of dependencies
- Controlling the nature of dependencies

_Will have some depenencies, having fewer dependencies makes it easier to debug, modify, change the component_

- form of depencies matter

### 2.1.2. Why Dependencies
- dependencies are unavoidable
- if code unit A depends on code unit B
   - Bugs in B may manifest in A
   - Changes to B may require changes to A

- **Dependencies have to:**
   - _only present when necessary_
   - _explicit_
   - _easy to understand_

## 2.2. Connascence
- Based on earlier ideas of _cohesion_ and _coupling_

> two components are connascent if a change in one would require the other to be modified in order to maintain the overall correctness of the system.

> the reason for maximising connascence within encapsulation boundaries is that you are trying to increase the locality of connascence, if connascence is more local then it is easier to manage those dependencies, and hence it is easier to maintain it

> the best connascence is having no connascence at all
because "two things" that change together are actually just one thin


### 2.2.1. Importance of Connascence
More connascence means:
- Harder to extend.
- More chance of bugs
- Slower to write in the first place

- Not all instances are equal!
- In general, later-listed ones are worse than others.
- Locality matters!
    - Within a method -> almost (but not totally) irrelevant.
    - Between two methods in a class -> often no big deal.
    - Two classes -> warning warning
    - Two classes in different packages -> WARNING WARNING
    - Across application boundaries -> keep to absolute minimum.
- Explicitness matters

### 2.2.2. Type of Connascence
| Type | Description | Example |
| ---- | ----------- |----- |
| Static | obvious from code structure, auto identified by IDE |  |
| Dynamic | Dynamically Generated | 

#### 2.2.2.1. Connascence of Name
Type: **Static**
has no argument(s)

```
class Watch {
    public void testWatch(){
        ...
    }
}
```
called using

```
class Hello {
    Watch demo = new Watch();
    watch.testWatch();
}
```

#### 2.2.2.2. Connascence of Type
Type: **Static**

has argument

```
class Watch {
    public void testWatch(int maxTick){
        ...
    }
}
```
called using:

```
class Hello {
    Watch demo = new Watch();
    watch.testWatch(1000);
}
```

#### 2.2.2.3. Connascence of Position
Type: **Static**
- where order of which things go

```
public LinkedCounter(LinkedCounter l, Counter neighbour){
    super(l);
    this.neightbour = neighbour;
}
```

**watch 3**:
```
public Watch3(Watch3 w){
    this.hours = new MaxCounter(w. hours);
    this.minutes = new LinkedCounter (w.minutes, this.hour);
    this.seconds = new LinkedCounter (w.seconds, this.minutes);
}
```
It has to remember the position for example `this.minutes = new LinkedCounter (w.minutes, this.hour);` has to remember the position of this.hour

#### 2.2.2.4. Connascence of Meaning/Convention (CoM/CoC)
Type: **Static**
```
public void increment(){
    super.increment();
    if(this.getValue() == 0){
        neighbour.increment();
    }
}
```

```
public void reset(){
    value = 0;
}
```
- Documentation is **important**

#### 2.2.2.5. Connascence of Algorithm
Type: **Static**
```
1. (message, key) ->  Encrypter
2. Encrypted Messages trasmits 
3. Encrypted Message Must implement reverse of encrypter
```
_must document very precisely_

IPoAC - [https://en.wikipedia.org/wiki/IP_over_Avian_Carriers](https://en.wikipedia.org/wiki/IP_over_Avian_Carriers)

#### 2.2.2.6. Connascence of Execution (CoE)
Type: **Dynamic**

Example: 
```
public Watch3(){
    hours = maxCounter(24):
    minutes = new LinkedCounter(60, hours);
    seconds = new LinkedCounter(60, minutes);
}
```

Must be ran in the right order for example, hours must be run first (variable declaration)


#### 2.2.2.7. Connascence of Timing (CoT)
Type: **Dynamic**

- Parllel Computing
- Interacting with hardware - especially real-time computing
- Distributed Computing

#### 2.2.2.8. ## Apollo 11 Example
- Requested available memory
- Other programs
- Constant Reboot

#### 2.2.2.9. Connascnce of Values (CoV)
Type: **Dynamic**

Where two values (variables) must be equal (the same) and if changes, it has to be changed as well 

#### 2.2.2.10. Connascnce of Identity (CoI)
Type: **Dynamic**

When two or more variables has to point the object 

## 2.3. Contrascence
- When two things are required to be different
- This is a form of connascence
- “Aliasing bugs” – an example fault type where contranescence has not been maintained.

## 2.4. Minimising Connascence
1. Minimise overall amount of connascence by breaking system into encapsulated elements.
2. Minimise remaining connascence that crosses encapsulation boundaries (guideline 3 will help with this)
3. Maximise connascence within ecapsulation boundaries

# 3. Encpsulation

## 3.1. What is Encapsulation?
- a software development technique that consists of isolating a system function or a set of data and operations on those data within a module and providing precise specifications for the module
- the concept that access to the names, meanings, and values of the responsibilities of a class is entirely separated from access to their realization. 
 - the idea that a module has an outside that is distinct from its inside, that it has an external interface and an internal implementation 

## 3.2. Mechanisms
- Java was made to encapsulate.
- Basic unit of Java programs is the class.
- Can restrict access to anything in the class to:
    - Within the class only (`private`)
    - Within the package only (no access modifier - default)
    - Only to subclasses and within the package (`protected`)
    - No restrictions (`public`)

## 3.3. Using Encapsulation in Java
- Avoid public attributes
- Only make methods public where necessary.
- Keep the class package-private if not needed!
- Use `protected` sparingly, consider using methods rather than attributes

## 3.4. Defensively Copy
- When getters return a mutable object.
- One with public attributes or mutator methods other than constructor.
- Generally, make a copy and return that.

- Otherwise, lose benefit of encapsulation and control of connascence…

# 4. Designing Software
## 4.1. Starting
- Start at the Top:
    - Start with high-level problem.
    - Divide into subproblems.
    - Design to solve those.
    - Put it together…
- Start at the bottom:
    - Start with a small problem that you can solve.
    - Design a solution to that.
    - Do a few more…
    - Start putting them together 
    - Voila…a solution! 


## 4.2. Scenario based design
- Have some scenario(s) that the thing being designed needs to support.
    - Storyboard, activity diagram, plain text…
    - This may come out of requirements or analysis (depending on whether thing is “the system” or some small part of it)
- Work through your scenario(s).
    - Trace through your design as it stands.
- Modify/rework design to support scenario effectively.
    - Keep quality properties in mind…
- Repeat with additional scenarios.

# 5. Using Abstraction in Java (Week 8 Lecture 2)

## 5.1. Using Abstraction at Code Level
- Abtraction is a **design principle** rather than a _programming technique_
- You do not have to write generic classes in this unit

## 5.2. Features of Java
### 5.2.1. Class
- is the most important mechnaism in most OO Languages (incl. Java)
    - represent single concept
    - expose a public interface that allows response in order to furfill its responsiblity
    - hide any implementation details that don't directly fullfil that responsiblity
    - ensures that its attribution are in a valid condition rather than relying  on client code to maintain its state

### 5.2.2. Visibiltiy Modifiers
- These include `public`, `private` and `protected`
- in general when in doubt make it `private`
- only provide `getters` and `setters` if you're sure that external classes need to directly manipulate
- if you leave the visibility modifier, your class/attribute/method will be visible within the package which is declared.

### 5.2.3. The Abstract Class
- The `abstract` class cant be instantiated
    - may lack important components
    - such as method bodies
    - inherits the methods and attributes, this means that it can implement the public methods and the attributes specified by the  **base** class.

### 5.2.4. Hinge Points
- Applying dependency inversion to a single relationship.
- We take a class, seperately define it's interface as an abstract entity, seperate the code. We can let the client code interact with the abstract interface. They only interact with each other through the interface.
![https://upload.wikimedia.org/wikipedia/commons/8/8d/DIPLayersPattern.png](https://upload.wikimedia.org/wikipedia/commons/8/8d/DIPLayersPattern.png)

### 5.2.5. Packages
We want to split things up into packages.
- We group a bunch of `classes` and bundle it into a subsystem.
- The boundary around a package is also an encapsulation boundary.

### 5.2.6. Nesting Packages
- You can't put a package inside another package in Java
- `java.util.jar` is not a package within `java.util`
- If you want to use the package, you have explicitly import (e.g. `import java.util`)

### 5.2.7. Abtraction Layers
- An **abstraction layer** is the publicly accessible interface to a class, package or subsystem.
- You can create an abstraction layer by restricting visiblity as much as possible.
- One problem is to making too much public.

# 6. FIT2099 Week 9 Lecture A

Student data type
```
Name
StudentID
Address
```
- charactersitics behind system
- System support. Given a `studentID` return `studentName`

- Find specification of the class.

## 6.1. Client Supplier Relationship
- We can draw the UML

Client -> Supplier

- **Client** Watch1 "has" 2 counter attributes.
   - Client is a supplier of services to `Watch1`
   - `Watch1` is a client of Counter, and asks it to perform services such as `increment`, `reset()`
   - Inheritments making use of service to.
   
## 6.2. Software Spec: The Problem
- Hardware components
- Well-edfined public interafcaes with a hidden implementation
- Have regorous umabgiousous _specification_ of behaviour

## 6.3. Design by Contract
- _class_ desginer establishes a _software contract_ between him/herselfs and the user(s) of the class he/she designs
- make this impersonal. Contract betweent he class that is the supplier and the clients of the class

## 6.4. Software Contract
- Documentation of the class of the technical user
- the possiblity of enforcing the contract by using exceptions and assertions

Software Contract:
```
Class Documentation

public class Documentation{

}

```

- Software designer tells the user what the class does by providing specs for the class
   - What the methods of the class need to operate correctly
   e.g. `assert studentID to be interger and between 00000001 to 99999999`
   - What the class will guarantee to be if is used correctly

## 6.5. Specification of a Class
- A specification
    - is ideally part of the implementation
        - In some languages such as _Eiffel_ that is built ibn others that i can done by hand (via the use of assertions and exceptions)
    - There are also extendetions
        - Cofoja (Java)
        - Py Contracts (python)
        - Spec## and Code Contract from Microsoft Research for C## and .Net

    - Should ideally be extractable from the implementation via a tool.
        - e.g. Javadoc when using Cofoja
    - is esetnail supporting component reuse and maintenance
    - is more that just the API we havve gotten used to seeing
        - it includes **comments**, and crucially exexcutable sepcs
- The User:
    - should be able to derermine how to use the class
    - not have to look at implemenation details
- Specs forms the public interface of the class

## 6.6. Specs
- Preconditions ('requires')
    - things that need to be true for method to run
    

# 7. UML Diagram
![img](http://www.conceptdraw.com/How-To-Guide/picture/Design-elements-UML-class-diagrams.png)

# 8. Java Cheat Sheet

## Classes
![img](http://introcs.cs.princeton.edu/java/11cheatsheet/images/hello.png)

## Editing, compiling and executing
![img2](http://introcs.cs.princeton.edu/java/11cheatsheet/images/developing.png)

## Built-in data types
![img3](http://introcs.cs.princeton.edu/java/11cheatsheet/images/built-in.png)

## Declaration and Assignment Statements
![img4](http://introcs.cs.princeton.edu/java/11cheatsheet/images/assignment.png)

## Integers
![img5](http://introcs.cs.princeton.edu/java/11cheatsheet/images/int.png)

![img6](http://introcs.cs.princeton.edu/java/11cheatsheet/images/int-expressions.png)

## Floating-point numbers
![img7](http://introcs.cs.princeton.edu/java/11cheatsheet/images/double.png)

![img8](http://introcs.cs.princeton.edu/java/11cheatsheet/images/double-expressions.png)

## Type Conversion and Library Calls
![img10](http://introcs.cs.princeton.edu/java/11cheatsheet/images/library-calls.png)

![img9](http://introcs.cs.princeton.edu/java/11cheatsheet/images/casts.png)

## If and else
![if-else](http://introcs.cs.princeton.edu/java/11cheatsheet/images/if-else.png)

### Switch Statement
![](http://introcs.cs.princeton.edu/java/11cheatsheet/images/switch.png)
## Loops
![while-loop](http://introcs.cs.princeton.edu/java/11cheatsheet/images/while.png)

![for](http://introcs.cs.princeton.edu/java/11cheatsheet/images/for.png)


## Functions
![func](http://introcs.cs.princeton.edu/java/11cheatsheet/images/function-examples.png)

## Constructors
![cons](http://introcs.cs.princeton.edu/java/11cheatsheet/images/constructor.png)

### Instance Methods
![meth](http://introcs.cs.princeton.edu/java/11cheatsheet/images/instance-method.png)

