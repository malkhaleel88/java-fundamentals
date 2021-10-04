# java-fundamentals

## **Lab: 01 - Java primitives and control flow**

- ### **Files : "Main.java", "Main.class" inside "src" folder in project directory.**

- ### **Methods :**

* **pluralize()**:  This method accepts a word and a number and returns a string with the word pluralized with an “s” if the number is zero, or greater than one.

* **flipNHeads()**: This method accepts an *integer n* and flips coins until n heads are flipped in a row. Simulate coin flipping by choosing a random number between 0 and 1. Numbers **below .5** are considered **tails**. Numbers at and **above .5** are considered **heads**.

* **clock()**:  This method uses Java’s built-in LocalDateTime object to constantly print out the current time to the console, second by second. The program should run until someone manually kills it with **CTRL-C** or presses the**stop** button in their IDE.

-------------------------------------------------------------------------------------------------------------------------
## **Lab: 02 - Arrays, for loops, testing**

- ### **Files : "Main.java", "Library.java" , "LibraryTest.java" inside "basiclibrary" folder in project directory.**

- ### **Methods :**

* **roll()**: This method accepts an **integer `n`** and rolls a six-sided dice `n` times and it returns an **ArrayList** containing the values of the rolls.

* **containsDuplicates()**: This method accepts an **integer array** and it returns `true` or `false` depending on whether the array contains duplicate values.

*  **average()**: This method accepts an **integer array** and calculates and returns the average of all the values in the array.

* **lowestAverage()**: This method accepts an **int array of arrays** and  calculate the average value for each array and return the array with the lowest average.

-------------------------------------------------------------------------------------------------------------------------

## **Lab: 03 - Maps and File I/O**

- ### **Files : 1- "Main.java", "Library.java" , "LibraryTest.java" inside "basiclibrary" folder in project directory.**
  ### **2- "App.java", "gates.js" , "AppTest.java" inside "linter" folder in project directory.**

- ### **Methods :**

* **valuesNotInside()**: This method accepts an **int array of arrays** and iterate through all of the data to find the min and max values. And Use a HashSet of type Integer to keep track of all the unique temperatures seen. Finally, iterate from the min temp to the max temp and create a String containing any temperature not seen during the month and return that String.

* **tally()**: This method accepts a **List of Strings representing votes** and returns one string to show what got the most votes.

* **linter()**: This method accepts a **String path**. the path is the path of the javaScript file. The parpouse of this method is generates an error message whenever it finds a line that doesn’t end in a semi-colon.

--------------------------------------------------------------------------------------------------------------------------

## **Lab: 06 - Inheritance and Interfaces**

### **Classes in this lab:**

Library, Restaurant, Review

### **Fields**

**For Restaurant:** name, rate, priceCategory

**Review:** body, author, starsNumber

### **Methods:**

1.  **Restaurant Class**: The Constructor of Restaurant class acept three variables:
   
    * `String name`: For the restaurant name.
    * `double rate`: For the rate of the restaurant between *0* and *5*.
    * `String  price`: For a price category.

* `getReviews()`: The Type of this method is  `LinkedList<Review>` and it is for store the all reviews in the list.

* `addReview(Review review)`: This method is the Override method from the *RestaurantInterface*, and it accepts a `Review` variable type. Its purpose to add the review in the list of reviews. Also insude this method I call the `updateStars()`.

* `updateStars()`: The purpose of this method is to update the rate of the restaurant (depend on the stars from reviews) by calculating the average of stars.

* `toString()`: To print the restaurant data.

2. **Review Class**: The Constructor of Review class acept three variables:
   
    * `String body`: For writing the review.
    * `String author`: For the person name who writing the review.
    * `double stars`: For rating the restaurant from the person.

* `getStars()`: Its purpose to return the stars from the review which person was choosing.


* `toString()`: To print the Review data.

--------------------------------------------------------------------------------------------------------------------------

## **Lab: 07 -  Inheritance, day 2**

### Overview

In this lab I added a two new class the first one is **Shop** class and the second one is **Theater** class.

### Methods

1. **Shop Class**: The Constructor of Shop class acept three variables:

    * `String name`: For the shop name.
    * `String description`: For store a description about the shop.
    * `int numOfDollarSigns`: For store the number of DollarSigns.

* `getShopReviews()`: The Type of this method is  `LinkedList<Review>` and it is for store the all reviews in the list.

* `addShopReview(Review review)`: This method is the Override method from the *ShopInterface*, and it accepts a `Review` variable type. Its purpose to add the review in the list of reviews. Also insude this method I call the `updateStars()`.

* `toString()`: To print the Shop data.

2. **Theater Class**: The Constructor of Theater class acept one variable:

    * `String name`: For the theater name.

* `getTheaterReviews()`: This method to store the all reviews in the map.

* `addTheaterReview(Review rev, String movieName)`: This method accept `Review` value for the review and `String` value for the movie name. This method check if the movie is existing in the list of movies or not. If is existing, you can write a review about it.

* `addMovie(String movie)`: This method accept `String` value for movie title. Its purpose to add any movie you want in the movies list.

* `removeMovie(String movie)`: This method accept `String` value for movie title. Its purpose to remove any movie you want in the movies list.
