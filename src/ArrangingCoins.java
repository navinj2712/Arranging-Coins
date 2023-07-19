import java.util.Scanner;

public class ArrangingCoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of coins : ");
        int coins = scanner.nextByte();
        //int output = findArrangingCoins(coins);
        int row = 0;
        int output = findArrangingCoins(coins, row);
        System.out.println("Output : " + output);
    }

    private static int findArrangingCoins(int coins, int row) {
        if( coins < row){
            return row - 1;
        }
        return findArrangingCoins(coins - row, row+1);
    }

    private static int findArrangingCoins(int coins) {
        int rows = 1 ;
        while (coins > rows){
            coins = coins - rows;
            rows++;
        }
        return rows;
    }

}
