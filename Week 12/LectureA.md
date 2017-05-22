## 0.1. Table of Contents
<!-- TOC -->

    - [0.1. Table of Contents](#01-table-of-contents)
- [1. Software Architecture](#1-software-architecture)
    - [1.1. Consists of](#11-consists-of)
    - [1.2. Abstractions](#12-abstractions)
    - [1.3. Architect](#13-architect)
    - [1.4. Architecture and Design](#14-architecture-and-design)
    - [1.5. Design Decisions](#15-design-decisions)
    - [1.6. Quality Attrivutes](#16-quality-attrivutes)
        - [1.6.1. Quality Attribute Spec](#161-quality-attribute-spec)
        - [1.6.2. Performance](#162-performance)
        - [1.6.3. Scalability](#163-scalability)
        - [1.6.4. Modifiability](#164-modifiability)
        - [1.6.5. Design Tradeoffs](#165-design-tradeoffs)
    - [1.7. Arcchitectural Patterns](#17-arcchitectural-patterns)
        - [1.7.1. Architectural Styles](#171-architectural-styles)
        - [1.7.2. Client Server Pattern](#172-client-server-pattern)
    - [1.8. Architecture Design](#18-architecture-design)
        - [1.8.1. What does an Architect do?](#181-what-does-an-architect-do)
        - [1.8.2. Communication among stakeholders](#182-communication-among-stakeholders)
        - [1.8.3. Design Decisions](#183-design-decisions)
    - [1.9. Division of Labour](#19-division-of-labour)

<!-- /TOC -->

# 1. Software Architecture
## 1.1. Consists of 
- Elements (What)
- Form (How) 
   - properties (constraints on elemnts and system)
   - relationship
- Rationale (Why?)
   - reasoning behind software design

## 1.2. Abstractions
- most important concept

## 1.3. Architect
- Describe Structure and System
- Level of abstraction is chosen such that all critical design decisions are apparent and meaningful
- Specified by
    - Design Diagrams
    - Component Abstractions

## 1.4. Architecture and Design

## 1.5. Design Decisions
- Structure
- Behaviour
- Interaction
- Non Functional Properties
    - Quality Attributes
    
## 1.6. Quality Attrivutes
- Reliatblity
- Availability
- Scalibility 
- Portability
- Performance
- ...
- Part of NFRs

### 1.6.1. Quality Attribute Spec
- Architecture are often told:
- Far too imprecise


### 1.6.2. Performance 
- Measure latency 
- Important metric

### 1.6.3. Scalability
- Request Load
   - Response Time Changes
   - 100 tps application
   - Achieve Linear Increase in performance
   - Concurrency, Memory
- Connections
- Data Size
- Deployments

### 1.6.4. Modifiability
- Modifications to a system during its lifetime
- Modifiable systems are easier to change/resolve
- Modifiability should be assessed
    - **No need to facilitate changes if it is not desired**
    - Impact
       - Metrics are hard to quantify
       - Assessed changes impacts on components
          - Minimising depdencies
    - There is a tradeoff

### 1.6.5. Design Tradeoffs
- QAs interact and affect each other
- Architects must create solutions that makes sensible design comprimises
  - not possible to fully satisfy all competing requirements
  - **Must satisfy all stakeholder needs**
     - This is very difficult



## 1.7. Arcchitectural Patterns
- is a reusable solution to a commonly occuring p
roblem in a software archteccture

### 1.7.1. Architectural Styles
- Patterns catalogue succesfully used structures that faciltate kinds of component communication
  - client-server
  - N-tier
  - Message broker
  - Pipeline
- Patterns have well **known characterisitcs**
- Styles can have different patterns

### 1.7.2. Client Server Pattern
- Server
   - which contains a single machine that provides services to multiple clients
- Client
  - software apps that provide UI (front-end)

## 1.8. Architecture Design
### 1.8.1. What does an Architect do?
- Many responsiblities
   - Communication among stakeholders
   - Design decisions
   - Helps with division of labour
   - Risk management


### 1.8.2. Communication among stakeholders
- Different system characteristics are important to different stakeholders
- A user: reliable and available
- A Customer: built on time and budget
- A Project Manager: allow for development work to be distributed efficiently

### 1.8.3. Design Decisions
- Easy design decisions 
  - enormous impact on rest of software
  - earlier a mistake is made in a project, the more expensive it is to fix.
- Software engineering lore: earlier a mistake is made in a project, the more expensive is it to fix.

## 1.9. Division of Labour
- Software architecture dictates organisational structure
- Standard way to Divide Labour in a large project is make different teams responsible for seperate parts of the system. 