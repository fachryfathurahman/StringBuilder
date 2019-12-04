import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("masukkan inputan");

        String str=input.nextLine() ;
        char[] reverse = str.toCharArray();

        //without StringBuilder class
        System.out.println("without StringBuilder class");
        char[] afterReverse=new char[100];
        int j=0;
        for (int i = reverse.length-1; i >= 0; i--,j++) {
            afterReverse[j]=reverse[i];
        }
        String hasil=new String(afterReverse);
        System.out.println(hasil);

        //with StringBuilder class
        System.out.println("with StringBuilder class");
        StringBuilder reverseWithStringBuilder = new StringBuilder(str);
        System.out.println(reverseWithStringBuilder.reverse());
    }
}
