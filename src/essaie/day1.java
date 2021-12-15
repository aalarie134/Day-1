package essaie;
import java.io.*;
import java.util.Scanner;


public class day1 {
    public static void main(String[] args) throws IOException {
        int answer = 0;
        File file = new File("input.txt");

        Scanner scan = new Scanner(file);
        long max =  1999;

        int temp1 = scan.nextInt();
        int temp2 = scan.nextInt();
        int temp3 = scan.nextInt();


        for(int i = 3 ; i < max + 1 ; i++){
            int a = temp1;
            int b = temp2;
            int c = temp3;

            int sumA = a + b + c;

            int d = scan.nextInt();

            int sumB = b + c + d;


            if( comparator.compare(sumA,sumB) ){

                answer++;
            }

            temp1 = b;
            temp2 = c;
            temp3 = d;
        }

        System.out.println(answer);



    }

}
