# FSD_Task

# Team TANDEMLOOP,

My application for the Full Stack Developer role.  

Implemented in Java 17.

---

## Problem 1: Basic Calculator

**Goal:** Build a console-based calculator that performs one of four basic operations based on user selection.

**Approach:**
1. The user for two integer values.
2. Display a menu with choices for addition, subtraction, multiplication, and division.
3. Read the selected option and execute the operation using a `switch` statement.
4. Show the computed result or an error if the choice is invalid or division by zero occurs.

---

## Problem 2: Generate First `n` Odd Numbers

**Goal:** Print the first *n* odd numbers starting from 1.

**Approach:**
1. Take `n` as input from the user.
2. Use a counter to track how many odd numbers have been printed.
3. Start from 1 and keep adding 2 until the desired count is reached.
4. Separate numbers with commas for readability.

---

## Problem 3: Conditional Odd Sequence

**Goal:** Print a sequence of odd numbers based on whether the given number is even or odd.

**Approach:**
1. Accept an integer input.
2. If it’s even, print `(n - 1)` odd numbers; if odd, print `n` odd numbers.
3. Calculate each odd number using the formula `2 * index + 1`.
4. Output the sequence, separated by commas.

---

## Problem 4: Counting Multiples in a List

**Goal:** Determine how many numbers in a given list are divisible by each integer from 1 to 9.

**Approach:**
1. Store the list of sample integers in an array.
2. Prepare a map with keys from 1 to 9, initialized to zero.
3. For each number, check divisibility by each key and increment the corresponding count.
4. Display the final map showing divisibility counts.

---

