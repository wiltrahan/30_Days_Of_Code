# DAY 13 Abstract Classes

## Objective
Today, we're taking what we learned yesterday about Inheritance and extending it to Abstract Classes. 
Because this is a very specific Object-Oriented concept, submissions are limited to the few languages 
that use this construct. Check out the Tutorial tab for learning materials and an instructional video!

## Task 
Given a Book class and a Solution class, write a MyBook class that does the following:

Inherits from Book  
Has a parameterized constructor taking these 3 parameters:  
string *title*  
string *author*  
int *price*  
Implements the Book class' abstract display() method so it prints these 3 lines:
Title, a space, and then the current instance's *title*.  
Author, a space, and then the current instance's *author*.  
Price, a space, and then the current instance's *price.  

## Sample Input
The following input from stdin is handled by the locked stub code in your editor:  
The Alchemist  
Paulo Coelho  
248  

## Sample Output
The following output is printed by your display() method:  
Title: The Alchemist  
Author: Paulo Coelho  
Price: 248
