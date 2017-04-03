# FIT2099 Lecture 1 Week 6


# Table of Contents
<!-- TOC -->

- [FIT2099 Lecture 1 Week 6](#fit2099-lecture-1-week-6)
- [Table of Contents](#table-of-contents)
- [Good Design in Software](#good-design-in-software)
- [Dependencies](#dependencies)
    - [Dependency Control](#dependency-control)
    - [Why Dependencies](#why-dependencies)
- [Connascence](#connascence)
    - [Type of Connascence](#type-of-connascence)
        - [Connascence of Name](#connascence-of-name)
        - [Connascence of Type](#connascence-of-type)
        - [Connascence of Position](#connascence-of-position)
        - [Connascence of Meaning/Convention (CoM/CoC)](#connascence-of-meaningconvention-comcoc)
        - [Connascence of Algorithm](#connascence-of-algorithm)

<!-- /TOC -->

# Good Design in Software 
Some Combination of
- Functionaly correct
- Performs well enough
- Usable
- Reliable
- Maintainable

_these are the properties of the system, not any design artifacts_

_there is no algorithm for_:
- creating good designs
- identifying good designs

_Over the years, key princpiles have been identified_

# Dependencies
## Dependency Control
- Biggest issue in design
- Controlling the extent of dependencies
- Controlling the nature of dependencies

_Will have some depenencies, having fewer dependencies makes it easier to debug, modify, change the component_

- form of depencies matter

## Why Dependencies
- dependencies are unavoidable
- if code unit A depends on code unit B
   - Bugs in B may manifest in A
   - Changes to B may require changes to A

- **Dependencies have to:**
   - _only present when necessary_
   - _explicit_
   - _easy to understand_

# Connascence
- Based on earlier ideas of _cohesion_ and _coupling_

```
two components are connascent if a change in one would require the other to be modified in order to maintain the overall correctness of the system.
            - Connascence (Wikipedia Definition)
```

## Type of Connascence
| Type | Description | Example |
| ---- | ----------- |----- |
| Static | obvious from code structure, auto identified by IDE |  |
| Dynamic | Dynamically Generated | 

### Connascence of Name
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

### Connascence of Type
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

### Connascence of Position
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

### Connascence of Meaning/Convention (CoM/CoC)

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

### Connascence of Algorithm
```
1. (message, key) ->  Encrypter
2. Encrypted Messages trasmits 
3. Encrypted Message Must implement reverse of encrypter
```
_must document very precisely_

