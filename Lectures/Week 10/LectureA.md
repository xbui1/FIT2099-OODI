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
