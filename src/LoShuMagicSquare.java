public class LoShuMagicSquare {
    public static boolean isLoShuMagicSquare(int[][] square) {
        if (square.length != 3 || square[0].length != 3) {
            return false;
        }
        
        boolean[] seen = new boolean[10]; // To check numbers 1-9 appear exactly once
        int magicSum = 15; // Each row, column, and diagonal must sum to 15
        
        for (int i = 0; i < 3; i++) {
            int rowSum = 0, colSum = 0;
            for (int j = 0; j < 3; j++) {
                int num = square[i][j];
                if (num < 1 || num > 9 || seen[num]) return false; // Check valid and unique numbers
                seen[num] = true;
                rowSum += num;
                colSum += square[j][i];
            }
            if (rowSum != magicSum || colSum != magicSum) return false;
        }
        
        int diagonal1 = square[0][0] + square[1][1] + square[2][2];
        int diagonal2 = square[0][2] + square[1][1] + square[2][0];
        
        return diagonal1 == magicSum && diagonal2 == magicSum;
    }

    public static void main(String[] args) {
        int[][] magicSquare = {
            {4, 9, 2},
            {3, 5, 7},
            {8, 1, 6}
        };
        
        if (isLoShuMagicSquare(magicSquare)) {
            System.out.println("The given square is a Lo Shu Magic Square!");
        } else {
            System.out.println("The given square is NOT a Lo Shu Magic Square.");
        }
    }
}
