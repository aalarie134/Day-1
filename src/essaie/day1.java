package essaie;
import java.io.*;
import java.util.Scanner;


public class day1 {
    public static void main(String[] args) throws IOException {
        int answer = 0;
        File file = new File("input.txt");

        Scanner scan = new Scanner(file);
        long max =  1999;

        int temp = scan.nextInt();

        for(int i = 1 ; i < max + 1 ; i++){
            int a = temp;
            int b = scan.nextInt();

            if( comparator.compare(a,b) ){

                answer++;
            }

            temp = b;
        }

        System.out.println(answer);



    }

}
