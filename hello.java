import java.util.Scanner;

class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int score = sc.nextInt();

        System.out.println(name);
        System.out.println(score);
    }
}
