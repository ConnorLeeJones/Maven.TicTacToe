package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] theMatrix = new Character[3][3];

    public Board(Character[][] matrix) {
        this.theMatrix = matrix;
    }


    public Boolean isInFavorOfX() {
        return (checkRows().equals("X") || checkColumns().equals("X") || checkDiagonal().equals("X"));
    }


    public Boolean isInFavorOfO() {
        return (checkRows().equals("O") || checkColumns().equals("O") || checkDiagonal().equals("O"));
    }


    public Boolean isTie() {
        return (checkRows().equals("T") && checkColumns().equals("T") && checkDiagonal().equals("T"));
    }


    public String getWinner() {
        if (isInFavorOfX() == true){
            return "X";
        } else if (isInFavorOfO() == true){
            return "O";
        } else {
            return "";
        }
    }


    public String checkRows() {
        String symbol = "T";

        for (int row = 0; row < 3; row++) {
            if (theMatrix[row][0].equals(theMatrix[row][1]) && theMatrix[row][0].equals(theMatrix[row][2]) && (!theMatrix[row][0].equals(' '))) {
                symbol = theMatrix[row][0].toString();
                break;
            }
        }
        return symbol;
    }

    public String checkColumns() {
        String symbol = "T";

        for (int column = 0; column < 3; column++) {
            if (theMatrix[0][column].equals(theMatrix[1][column]) && theMatrix[0][column].equals(theMatrix[2][column]) && (!theMatrix[0][column].equals(' '))) {
                symbol = theMatrix[0][column].toString();
                break;
            }
        }
        return symbol;
    }

    public String checkDiagonal() {
        String symbol = "T";
        if (theMatrix[0][0].equals(theMatrix[1][1]) && theMatrix[0][0].equals(theMatrix[2][2]) && (!theMatrix[0][0].equals(' '))) {
            symbol = theMatrix[1][1].toString();
        } else if (theMatrix[0][2].equals(theMatrix[1][1]) && theMatrix[0][2].equals(theMatrix[2][0]) && (!theMatrix[0][2].equals(' '))) {
            symbol = theMatrix[1][1].toString();
        }
        return symbol;
    }
}
