# Sample Exam 20177

## Question 1
_You have joined a team that is working on a fully-featured version of the Star Wars game, 
complete with a graphical user interface, for commercial release.  It’s planned to re-use the engine 
code (which has gained a lot of new features, including GUI support) for similar games in the 
future._

_The game runs reasonably well, but when you look at the engine code you discover that it contains 
a lot of “cut-and-paste reuse” – that is, repeated similar sequences of code, sometimes with a few 
very small changes._

### Part A
_Why do software engineers consider repeated code to be a bad thing?  Write a 
paragraph or two about the risks of cut-and-paste reuse. (6 marks)_ 

It firstly violates the DRY principle, by violating the DRY principle it means by making a small change within one part of the repeated code, you may need to change more than one component. 
Another factor is that by cutting and pasting code, it will increase the risk of introducing bugs, memory leaks and other factors into your code. Other factors include security vulnerabilities. If you find a bug within the copy-pasted code or even if you want to refactor it you may have to change every place you copy and pasted the code 

## Part B
_Describe how you would go about fixing the code to reduce these risks. (6 marks)_

By analysing the code to see which components/code sequences has been repeated and determine the similarities between them. Then creating a new component that bares the similarilities between
the code pieces. Then modifing and extending this new class/component with abstract (if relevant) classes to replace the code that you written. This will reduce the risk of when refactoring you have
to find everywhere you have copy and pasted the original classes. As well as having a private relationship reducing the risk of security leaks.

## Question 2
In mathematics, an integer is a number that is the member of the set {…,-2,  -1, 0, 1, 2,…}
A rational number is any number that can be expressed as a fraction p/q, where p and q are integers and q
is not 0.

Trivially, any integer x can be unambiguously expressed as a rational number x/1, so any integer is also a 
rational number.

Imagine you wished to define two classes, myInteger and myRational, that (initially) support the following 
operations:
- Constructing new objects with an initial value
- Incrementing the value by the value of another myInteger or myRational object.

Consider two class diagrams below that show proposed inheritance relationships between myInteger and 
myRational 



## Question 4
![imagee](http://i.imgur.com/VgT8tA8.png)