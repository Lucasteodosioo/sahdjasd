import java.util.Arrays;
import java.util.Scanner;

public class Main {cd
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("Digite 1 = soma, 2 = subtração: ");
            option = sc.nextInt();
            sc.nextLine();

            System.out.println("Digite os numeros separados por virgula (ex: 1,2,3): ");
            String numbers = sc.nextLine();

            int result;

            if (option == 1)
                result = Arrays.stream(numbers.split(","))
                .map(s -> s.trim())
                .mapToInt(Integer::parseInt)
                .sum();
            else{
                result = Arrays.stream(numbers.split(","))
                .map(s -> s.trim())
                .mapToInt(Integer::parseInt)
                .reduce((a, b) -> a - b)
                .orElse(0);
            }
            System.out.println("Resultado: " + result);
        } while (option > 2 || option < 1);

        System.out.println("Ola mundo");
    }
}
