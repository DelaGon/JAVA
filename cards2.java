import java.util.Scanner;
 class caeds2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String game = "";
        int k = 0;
        while (true) {
            String no = sc.next();
            game += no.charAt(1);
            if (no.equals("-")) {
                k++;
            }
            if (k == 2) {
                break;
            }
        }
        int sum1 = 0;
        int sum2 = 0;
        String[] player = game.split("-");
        String player1 = player[0];
        String player2 = player[1];
        for (int i = 0; i < player1.length(); i++) {
            switch (player1.charAt(i)) {
                case 'A':
                    sum1 += 11;
                    break;
                case '2':
                    sum1 += 2;
                    break;
                case '3':
                    sum1 += 3;
                    break;
                case '4':
                    sum1 += 4;
                    break;
                case '5':
                    sum1 += 5;
                    break;
                case '6':
                    sum1 += 6;
                    break;
                case '7':
                    sum1 += 7;
                    break;
                case '8':
                    sum1 += 8;
                    break;
                case '9':
                    sum1 += 9;
                    break;
                case 'T':
                    sum1 += 10;
                    break;
                case 'J':
                    sum1 += 10;
                    break;
                case 'Q':
                    sum1 += 10;
                    break;
                case 'K':
                    sum1 += 10;
                    break;
            }

        }
        for (int i = 0; i < player2.length(); i++) {
            switch (player2.charAt(i)) {
                case 'A':
                    sum2 += 11;
                    break;
                case '2':
                    sum2 += 2;
                    break;
                case '3':
                    sum2 += 3;
                    break;
                case '4':
                    sum2 += 4;
                    break;
                case '5':
                    sum2 += 5;
                    break;
                case '6':
                    sum2 += 6;
                    break;
                case '7':
                    sum2 += 7;
                    break;
                case '8':
                    sum2 += 8;
                    break;
                case '9':
                    sum2 += 9;
                    break;
                case 'T':
                    sum2 += 10;
                    break;
                case 'J':
                    sum2 += 10;
                    break;
                case 'Q':
                    sum2 += 10;
                    break;
                case 'K':
                    sum2 += 10;
                    break;
            }

        }
        if (sum1 > sum2)
            System.out.print(1);
        else
            System.out.print(2);

    }

}
