import java.util.Scanner;

class Hello {
    public static void main(String[] args) {

        Scanner kowshik = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = kowshik.nextLine();

        System.out.print("Enter your score: ");
        int score = kowshik.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Score: " + score);

        kowshik.close();
    }
}
