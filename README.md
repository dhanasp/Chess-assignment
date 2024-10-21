# Chess-assignment

I have written this program in kotlin to solve the chess assignment.
Currently, the program is able to calculate the moves of the pawn, king, and queen.

### JDK Version used - 17.0.12

## How to run the program

To run the program, run the following command in the terminal:

```bash
./gradlew clean build
./gradlew run --args="<Piece> <Position>"
```  

`<Piece>` can be one of the following: `Pawn`, `King`, `Queen`

`<Position>` is the position of the piece on the chessboard.

For example:

```bash 
./gradlew run --args="Pawn D4"
```

### How to run the tests:

```bash
./gradlew clean test
```