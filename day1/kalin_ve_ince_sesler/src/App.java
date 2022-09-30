import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("harf giriniz:");

            String harf = scanner.next();

            switch(harf){
                case "A":
                case "a":
                case "I":
                case "ı":
                case "O":
                case "o":
                case "U":
                case "u":
                    System.out.println("kalin sesli harf");
                    break;
                default:
                    System.out.println("ince sesli harf");    

            }
        }
    }
}
