import java.util.Scanner;

class count_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        if (num == 0) {
            count = 1;
        } else {
            if (num < 0) {
                num = -num;
            }
            while (num > 0) {
                num /= 10;
                count++;
            }
        }
        System.out.println("Number of digits: " + count);
    }
}