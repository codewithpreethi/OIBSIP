# Number Guessing Game

## Oasis Infobyte — Java Development — Task 2

### Objective
A Java console-based number guessing game where the computer generates a random number and the user receives higher/lower hints until the number is guessed or the maximum number of attempts is reached.

### Technology
- Java
- `java.util.Random`
- `java.util.Scanner`

### Features
- Random number from 1 to 100
- Maximum of 7 attempts per round
- "Too High!", "Too Low!", and "Correct!" feedback
- Attempt counter
- "You Lost!" message after the maximum attempts
- Reveals the correct number when the user loses
- Play Again option
- Score/round summary across multiple rounds
- Input validation for invalid and out-of-range input

### How to Run

1. Make sure Java JDK is installed.
2. Open a terminal in this folder.
3. Compile:

```bash
javac NumberGuessingGame.java
```

4. Run:

```bash
java NumberGuessingGame
```

### Project Structure

```text
Java-Task2-NumberGuessingGame/
├── NumberGuessingGame.java
└── README.md
```
