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
    - [Performance](#performance)
    - [Scalability](#scalability)
    - [Modifiability](#modifiability)

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


## Performance 
- Measure latency 
- Important metric

## Scalability
- Request Load
   - Response Time Changes
   - 100 tps application
   - Achieve Linear Increase in performance
   - Concurrency, Memory
- Connections
- Data Size
- Deployments

## Modifiability
- Modifications to a system during its lifetime
- Modifiable systems are easier to change/resolve
- Modifiability should be assessed
    - **No need to facilitate changes if it is not desired**
    - Impact
       - Metrics are hard to quantify
       - Assessed changes impacts on components
          - Minimising depdencies
          