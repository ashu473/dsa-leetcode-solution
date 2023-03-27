class Solution {
    public static boolean isValidSudoku(char[][] board) {
        if(!checkRows(board)){
            return false;
        }
        if(!checkColumns(board)){
            return false;
        }
        if(!checkSquares(board)){
            return false;
        }

        return true;
    }

    public static boolean checkSquares(char[][] board){
        List<Character> existsNumbers = new ArrayList<>();
        int rowCounter = 0;
        int columnCounter = 0;
        int currentSquareLine = 0;
        while(true){
            if(board[rowCounter][columnCounter] != '.'){
                existsNumbers.add(board[rowCounter][columnCounter]);
            }
            if(rowCounter % 3 == 2 && columnCounter % 3 == 2){
                if(isRepeatNumbers(existsNumbers)){
                    return false;
                } else {
                    if (rowCounter == 8 && columnCounter == 8){
                        break;
                    } else {
                        existsNumbers = new ArrayList<>();
                    }
                
                }
            }
            if(rowCounter % 3 == 2){
                if(columnCounter == 8){
                    columnCounter = 0;
                    currentSquareLine += 3;
                    rowCounter = currentSquareLine;
                } else {
                    ++columnCounter;
                    rowCounter = currentSquareLine;
                }
            } else {
                ++rowCounter;
            }

        }
        return true;

    }

    public static boolean checkRows(char[][] board){
        List<Character> existsNumbers = new ArrayList<>();
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                if (board[i][j] != '.') {
                    existsNumbers.add(board[i][j]);

                }
            }
            if (isRepeatNumbers(existsNumbers)) {
                return false;
            }
            existsNumbers = new ArrayList<>();
        }
        return true;
    }

    public static boolean checkColumns(char[][] board){
        List<Character> existsNumbers = new ArrayList<>();
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                if (board[j][i] != '.') {
                    existsNumbers.add(board[j][i]);

                }
            }
            if (isRepeatNumbers(existsNumbers)) {
                return false;
            }
            existsNumbers = new ArrayList<>();
        }
        return true;
    }

    public static boolean isRepeatNumbers(List<Character> numbers) {
        for (int i = 0; i < numbers.size() - 1; ++i) {
            for (int j = numbers.size() - 1; j > i; --j) {
                if (numbers.get(i) == numbers.get(j)) {
                    return true;
                }
            }
        }
        return false;
    }
}