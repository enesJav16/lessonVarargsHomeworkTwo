import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        String word = scanner1.nextLine();
        wordMod(word);

    }

    public static void wordMod(String a) {
        a = a.toUpperCase().trim();
        System.out.println(a);


        if (a.contains("A")) {
            int b =0;
            for (int i = 0; i < a.length() && b <= 0; i++) {
                if (a.charAt(i) == 'A') {
                    b = i;
                    a = a.substring(0, b);
                }
            }
            System.out.println(a);
        }else {
            System.out.println(a+" there is no 'A'");
        }
    }
}
