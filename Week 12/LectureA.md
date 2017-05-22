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
    - [1.7. Quality Attribute Spec](#17-quality-attribute-spec)
    - [1.8. Performance](#18-performance)
    - [1.9. Scalability](#19-scalability)
    - [1.10. Modifiability](#110-modifiability)
    - [1.11. Design Tradeoffs](#111-design-tradeoffs)
    - [1.12. Arcchitectural Patterns](#112-arcchitectural-patterns)
        - [Architectural Styles](#architectural-styles)

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

## 1.7. Quality Attribute Spec
- Architecture are often told:
- Far too imprecise


## 1.8. Performance 
- Measure latency 
- Important metric

## 1.9. Scalability
- Request Load
   - Response Time Changes
   - 100 tps application
   - Achieve Linear Increase in performance
   - Concurrency, Memory
- Connections
- Data Size
- Deployments

## 1.10. Modifiability
- Modifications to a system during its lifetime
- Modifiable systems are easier to change/resolve
- Modifiability should be assessed
    - **No need to facilitate changes if it is not desired**
    - Impact
       - Metrics are hard to quantify
       - Assessed changes impacts on components
          - Minimising depdencies
    - There is a tradeoff

## 1.11. Design Tradeoffs
- QAs interact and affect each other
- Architects must create solutions that makes sensible design comprimises
  - not possible to fully satisfy all competing requirements
  - **Must satisfy all stakeholder needs**
     - This is very difficult



## 1.12. Arcchitectural Patterns
- is a reusable solution to a commonly occuring problem in a software archteccture

### Architectural Styles
- Patterns catalogue succesfully used structures that faciltate kinds of component communication
  - client-server
  - N-tier
  - Message broker
  - Pipeline
- Patterns have well **known characterisitcs**
- Styles can have different patterns