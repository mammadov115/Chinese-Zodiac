import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int birth_year,remainder;
        String zodiac = "";
        Scanner input = new Scanner(System.in);

        System.out.println("Enter birth year:");
        birth_year = input.nextInt();

        remainder = birth_year % 12;

        switch(remainder){
            case 0:
                zodiac = "Monkey";
                break;
            case 1:
                zodiac = "Rooster";
                break;
            case 2:
                zodiac = "Dog";
                break;
            case 3:
                zodiac = "Pig";
                break;
            case 4:
                zodiac = "Rat";
                break;
            case 5:
                zodiac = "Ox";
                break;
            case 6 :
                zodiac = "Tiger";
                break;
            case 7:
                zodiac = "Rabbit";
                break;
            case 8:
                zodiac = "Dragon";
                break;
            case 9:
                zodiac = "Snake";
                break;
            case 10:
                zodiac = "Horse";
                break;
            case 11:
                zodiac = "Goat";
                break;
        }

        System.out.println("Your chinese zodiac sign is " + zodiac);


    }
}
