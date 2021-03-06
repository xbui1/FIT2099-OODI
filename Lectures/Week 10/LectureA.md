# Week 10 - Code Smells

## Code Smells
- Something small that indicates a deeper problem.
- "Design Smells" inspecting some part of the design.

## SWActor Cloning
- Cloning is a thing in SW Universe
```
/**
* Clone a SWActor. Useful for starting you own Clone Wall
*/

abstract SWActor swclone();
```
- Pretend pertend this is implemented and used and then wee add **Ben Kenobi**...
- There can only be one Ben Kenobi
- Class enforces this...
- So what would swcloning Ben do?

## Liskov Subsitution Principle
- Informally - if B is a subclass of A, you should be able treat an instance of B as an A
- BDC Version:
    - Preconditions can't be strengthend in a subclass
    - Postconditions can't be weakened in a subclass
    - Invariants in superclass must be preserved

## Linking
```
if(a instance of BenKenobi){
    throw Exceptions("...");
} else {
    clone = a.swclone()
}
```
### Why is it a 'code smell'
- Deep ugly connascence between `BenKenobi` and every other class that uses a `SWActor`
- Could check for `SWLegend`...but still violating LSP
- Branching on type information is a code smell

### Candidate Fixes
- Have Interface SWCloneable, branch
- Change specs for swclone, returns null if attempt to clone actor
- A companion `isClonable` method that returns a boolean if an actor is clonable or not.

## Implementing the fix:
- Caveat:we have

## Refactoring:
- _"is a technique for taking a body of code and altering resturcturing"_ - change how existing code to do this, but making it better.
- Refactor to improve quality of software

### Why Refactor?
- Improve Design of code
- Improve understandability
- Improve debuggability

### When to Refactor?
- Fowler
    - When adding new features
    - When you need to fix a bug
    - As you do code review
- Two hats.
    - Don't refactor and add new features at the same time.

## Taxonomy of Code Smells

### Long Smells
- Duplicated Code
- Long Methods
- Large Classes
- Long Parameter Lists

### Social Smells
- Divergent Change
    - keep on making changes to methods (two sets of methods, one set changes together, the other set changes together - low cohesion)
- Shotgun Surgery
    - make series of changes, inside changes touch multiple classes.
    - things that stay together should stay inside its on class
- Feature envy 
    - have a method in one class, that makes changes to an object in another class.


### I smell a Python Prograammer
- Primative Obession
    - Storing everything of `ArrayList` as `Strings`
- Data Clumps
    - Groups of Multiple Variables (two strings and a intenger to store StudentID), String String int. 
    - Data isn't Structured
- Switch Statements
- Data classes

### You do it....no you do it....no YOU do it.
- Message Chains
    - `x= a.getThingy.getStuff(b).getAgain()`
- Middle main

### Overengineering
- Speculative Generality
- Lazy Class

## Refactoring
- Fowler presents a standard set of techniques for eliminating code smells
- Meta technique
    - make small change that elimate.reduces a smell
    - Test
    - Reoat until passes whiff test
- When you break things along the way, it is making a small change at a time rather than a big change.

## Example
- `initialiseWorld` in SWWorld
    - is 114 lines long
    - This is a long method
    - Replace comment with method() call, extract a method

### Extract Method
- Create a method, name it after the intention of the method
- determine visability
- Copy the extracted code from source method into new target method.

### Refactoring initailiseWorld
Extract method. And Refactor. And create a new function.
