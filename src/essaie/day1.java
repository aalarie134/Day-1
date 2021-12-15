package essaie;
import java.io.*;
import java.util.Scanner;


public class day1 {
    public static void main(String[] args) throws IOException {
        int answer = 0;
        File file = new File("input.txt");

        Scanner scan = new Scanner(file);
        int max = (int) file.length();
        System.out.println(max);
        int temp = scan.nextInt();
        System.out.println(temp);
        for(int i = 0 ; i < max ; i++){
                //to do
        }




    }

}
