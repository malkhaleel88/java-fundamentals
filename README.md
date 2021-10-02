# java-fundamentals

## **Lab: 01 - Java primitives and control flow**

- ### **Files : "Main.java", "Main.class" inside "src" folder in project directory.**

- ### **Methods :**

* **pluralize()**:  This method accepts a word and a number and returns a string with the word pluralized with an “s” if the number is zero, or greater than one.

* **flipNHeads()**: This method accepts an *integer n* and flips coins until n heads are flipped in a row. Simulate coin flipping by choosing a random number between 0 and 1. Numbers **below .5** are considered **tails**. Numbers at and **above .5** are considered **heads**.

* **clock()**:  This method uses Java’s built-in LocalDateTime object to constantly print out the current time to the console, second by second. The program should run until someone manually kills it with **CTRL-C** or presses the**stop** button in their IDE.





## **Lab: 02 - Arrays, for loops, testing**

- ### **Files : "Main.java", "Library.java" , "LibraryTest.java" inside "basiclibrary" folder in project directory.**

- ### **Methods :**

* **roll()**: This method accepts an **integer `n`** and rolls a six-sided dice `n` times and it returns an **ArrayList** containing the values of the rolls.

* **containsDuplicates()**: This method accepts an **integer array** and it returns `true` or `false` depending on whether the array contains duplicate values.

*  **average()**: This method accepts an **integer array** and calculates and returns the average of all the values in the array.

* **lowestAverage()**: This method accepts an **int array of arrays** and  calculate the average value for each array and return the array with the lowest average.



## **Lab: 03 - Maps and File I/O**

- ### **Files : 1- "Main.java", "Library.java" , "LibraryTest.java" inside "basiclibrary" folder in project directory.**
  ### **2- "App.java", "gates.js" , "AppTest.java" inside "linter" folder in project directory.**

- ### **Methods :**

* **valuesNotInside()**: This method accepts an **int array of arrays** and iterate through all of the data to find the min and max values. And Use a HashSet of type Integer to keep track of all the unique temperatures seen. Finally, iterate from the min temp to the max temp and create a String containing any temperature not seen during the month and return that String.

* **tally()**: This method accepts a **List of Strings representing votes** and returns one string to show what got the most votes.

* **linter()**: This method accepts a **String path**. the path is the path of the javaScript file. The parpouse of this method is generates an error message whenever it finds a line that doesn’t end in a semi-colon.

