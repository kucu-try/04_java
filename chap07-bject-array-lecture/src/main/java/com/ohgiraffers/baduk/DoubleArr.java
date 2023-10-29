package main.java.com.ohgiraffers.baduk;

public class DoubleArr {
    public static void main(String[] args){
        String[][] babo = new String[5][5];

        for (int i = 0; i < babo.length; i++){
            for (int j = 0 ; j < babo[i].length; j++){
                babo[i][j] = " ㅇ ";
            }
        }

        for (int i = 0; i < babo.length; i++) {
            System.out.print("|");
            for (int j=0; j < babo[i].length; j++){
                System.out.print(babo[i][j] + "|");
            }
//            System.out.println();
        }
    }
}
