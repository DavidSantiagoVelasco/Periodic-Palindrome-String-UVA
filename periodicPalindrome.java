import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i = 0; i < cases; i++) {
            String str = sc.next();
            String smallest = "";
            String test = "";
            for (int j = 0; j < (str.length() + 1) / 2; j++) {
                boolean continium = false;
                smallest += str.charAt(j);
                for (int k = 0; k < smallest.length() / 2; k++) {
                    if (!smallest.substring(k, k + 1).equals(smallest.substring(smallest.length() - k - 1, smallest.length() - k))) {
                        continium = true;
                        break;
                    }
                }
                if (continium) {
                    if (j + 1 >= (str.length() + 1) / 2) {
                        System.out.println("-1");
                    }
                    continue;
                }
                test = str.substring(j + 1, smallest.length() * 2);
                if (smallest.equalsIgnoreCase(test)) {
                    int start = smallest.length() * 2;
                    for (int k = 0; k < (str.length() / smallest.length()) - 2; k++) {
                        test = str.substring(start, start + smallest.length());
                        start += smallest.length();
                        if (!smallest.equalsIgnoreCase(test)) {
                            continium = false;
                            break;
                        } else {
                            continium = true;
                        }
                    }
                }
                if (continium) {
                    System.out.println(smallest.length());
                    break;
                }
                if (j + 1 >= (str.length() + 1) / 2) {
                    System.out.println("-1");
                }
            }
        }
    }

}
