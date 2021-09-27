package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && checkLine(board,i) || checkColumn(board, i)){
                rsl = true;
                break;
            }
        }
        return rsl;
    }

    public static boolean checkLine (int[][] board, int index){
        boolean rsl = true;
        for (int i = 0; i < board[index].length; i++) {
            if (board[index][i] != 1){
                rsl = false;
                break;
            }
        }
        return  rsl;
    }

    public static boolean checkColumn (int[][] board, int index){
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][index] != 1){
                rsl = false;
                break;
            }
        }
        return  rsl;
    }
}
