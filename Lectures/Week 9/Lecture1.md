# FIT2099 Week 9 Lecture A

Student data type
```
Name
StudentID
Address
```
- charactersitics behind system
- System support. Given a `studentID` return `studentName`

- Find specification of the class.

## Client Supplier Relationship
- We can draw the UML

Client -> Supplier

- **Client** Watch1 "has" 2 counter attributes.
   - Client is a supplier of services to `Watch1`
   - `Watch1` is a client of Counter, and asks it to perform services such as `increment`, `reset()`
   - Inheritments making use of service to.
   
## Software Spec: The Problem
- Hardware components
- Well-edfined public interafcaes with a hidden implementation
- Have regorous umabgiousous _specification_ of behaviour

## Design by Contract
- _class_ desginer establishes a _software contract_ between him/herselfs and the user(s) of the class he/she designs
- make this impersonal. Contract betweent he class that is the supplier and the clients of the class

### Software Contract
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

## Specification of a Class
- A specification
    - is ideally part of the implementation
        - In some languages such as _Eiffel_ that is built ibn others that i can done by hand (via the use of assertions and exceptions)
    - There are also extendetions
        - Cofoja (Java)
        - Py Contracts (python)
        - Spec# and Code Contract from Microsoft Research for C# and .Net

    - Should ideally be extractable from the implementation via a tool.
        - e.g. Javadoc when using Cofoja
    - is esetnail supporting component reuse and maintenance
    - is more that just the API we havve gotten used to seeing
        - it includes **comments**, and crucially exexcutable sepcs
- The User:
    - should be able to derermine how to use the class
    - not have to look at implemenation details
- Specs forms the public interface of the class

## Specs
- Preconditions ('requires')
    - things that need to be true for method to run
    

