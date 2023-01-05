import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner_1 = new Scanner(System.in);
        System.out.println("eneter name");
        String name = scanner_1.nextLine();
        System.out.println(name);

        String lang = "java";
        System.out.println(scanner_1.equals(lang));
//
//
//        int num1 = 3;
//        float num2 = 4f;
//        System.out.println(num1+num2 );
//        System.out.println(Math.max(num1, num2));
//
//
//        int age = 4;
//
//        // conditions
//        if (age >= 19){
//            System.out.println("level 3");
//        } else if (age >= 16 && age < 18){
//            System.out.println("level 2");
//        } else {
//            System.out.println("level 1");
//        }
//
//        // switch case
//        switch(age){
//            case 5:
//                System.out.println("less than 5");
//                break;
//            case 6:
//                System.out.println("is 6");
//                break;
//            default:
//                System.out.println("not availabel");
//        }
//
//        // ternary opertor
//        String message = age > 18 ? "level 2": "level 1";
//        System.out.printf("%s%n", message);


//        int[] numbers = new int[4];
//        numbers[0] = 5;
//        for (int num: numbers) System.out.println((double) num);
//
//        String[] names = {"max","kai"};
//        for(String name: names){
//            System.out.println(name);
//        }
//        System.out.println(Arrays.toString(names));


//        int[][] numbers = new int[4][4];
//        numbers[0][3]=5;
//        System.out.println(Arrays.toString(numbers[0]));
//        System.out.println(Arrays.toString(numbers[1]));
//
//
//        for (int i =0; i<numbers.length; i++){
//            for(int j =0; j<numbers[0].length; j++){
//                System.out.println(numbers[i][j]);
//            }
//        }
//          String uName = scanner_1.nextLine();
//          System.out.println(uName);
//
//          int age = scanner_1.nextInt();
//          int year = LocalDate.now().minusYears(age).getYear();
//          System.out.println("%d, %d".formatted(age, year));

//
//        char[] letters = {'A', 'S', 'D', 'D','F','D','A'};
//        System.out.println(countOccurrences(letters, 'A'));

        Lens lensThree = new Lens("sony","30", true);
        System.out.println("brand:%s, isprime:%b , focalLength:%s".formatted(lensThree.brand, lensThree.isPrime, lensThree.focalLength));

    }

    static class Lens {
        String brand;
        String focalLength;
        boolean isPrime;

        Lens(String brand, String focalLength, boolean isPrime){
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }
    }

//    public static int countOccurrences(char [] letters, char searchLetter){
//        int count = 0;
//        for(char letter: letters){
//            if (letter == searchLetter) count++;
//        }
//
//        return count;
//    }
}