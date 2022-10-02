import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    private static int max; final static int min = 1;
    static int getmax() {
        return max; }
    static void setmax(int newmax) {
        max = newmax;
    }
    private static int random;
    static int getrandom() {
        return random;
    }
    static void setrandom(int newrandom) {
        random = newrandom;
    }
    public static void main(String[] args) {
        System.out.println("Let's Roll!, Your Fate is now in Jah's Hands");
        System.out.println("""      
       .-------.   `______'
      /   o   /|  `/\\     \\'
     /_______/o| `/o \\  o  \\'
     | o     | |`/   o\\_____\\'
     |   o   |o/`\\o   /o    /
     |     o |/  `\\ o/  o  /
     '-------'    `\\/____o/
                """);
        input();
    }
    public static void input() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("D:");
            setmax(Math.abs(input.nextInt()));
            reroll();
        }
        catch(InputMismatchException ex) {
            System.out.println("That's Universally Stupid Man, type a whole number");
            input();
        }
    }
    public static void reroll() {
        try {
            System.out.println("Type 1 to roll, Type 2 to reset dice, Type 3 to roll the dice multiple times in a row, Type anything to exit");
            Scanner input1 = new Scanner(System.in);
            int newinput = input1.nextInt();
            if (Math.abs(newinput) == 1) {
                randomnum();
                reroll();
            }
            else if (Math.abs(newinput) == 2) {
                input();
            }
            else if (Math.abs(newinput) == 3) {
                try {
                    System.out.print("\nPlease type the number of times you would like to roll the dice:");
                    int y = Math.abs(input1.nextInt());
                    int totalNumber = 0;
                    for (int x = 0; x<y; x++) {
                        randomnum();
                        System.out.println();
                        totalNumber += getrandom();
                    }
                    System.out.println("The total number is:"+totalNumber);
                    printNumbers(totalNumber);
                    System.out.println("\nThe average is:"+totalNumber/y);
                    printNumbers((totalNumber/y));
                    reroll();
                }
                catch(InputMismatchException ex) {
                    System.out.println("That's Universally Stupid Man, type a whole number");
                    reroll();
                }
            }
            else {
                System.out.println("Until we meet again!");
            }
        }
        catch(InputMismatchException ex) {
        System.out.println("Until we meet again!");
        }
    }
    public static void printNumbers(int number) {
        String[] art0 = {" 0000 ","00  00","00  00","00  00"," 0000 "};
        String[] art1 = {"1111  ","  11  ","  11  ","  11  ","111111"};
        String[] art2 = {" 2222 ","22  22","   22 ","  22  ","222222"};
        String[] art3 = {" 3333 ","33  33","   333","33  33"," 3333 "};
        String[] art4 = {"44  44","44  44","444444","    44","    44"};
        String[] art5 = {"555555","55    ","55555 ","    55","55555 "};
        String[] art6 = {" 6666 ","66    ","66666 ","66  66"," 6666 "};
        String[] art7 = {"777777","   77 ","  77  "," 77   ","77    "};
        String[] art8 = {" 8888 ","88  88"," 8888 ","88  88"," 8888 "};
        String[] art9 = {"999999","99  99","999999","    99","   99 ","  99  "};
        String[][] arrays = {art0,art1,art2,art3,art4,art5,art6,art7,art8,art9};
        if (number<10) {
            for (int x = 0; x < 5; x++) {
                System.out.print(arrays[number][x]);
                System.out.print("\n");
            }
        }
        else if (number<100) {
            for (int x = 0; x < 5; x++) {
                System.out.print(arrays[number/10][x]);
                System.out.print("    ");
                System.out.print(arrays[number%10][x]);
                System.out.print("\n");
            }
        }
        else if (number<1000) {
            for (int x =0; x<5; x++) {
                System.out.print(arrays[number/100][x]);
                System.out.print("    ");
                System.out.print(arrays[(number%100)/10][x]);
                System.out.print("    ");
                System.out.print(arrays[number%10][x]);
                System.out.print("\n");
            }
        }
        else {
            System.out.println(number);
        }
    }
    public static void randomnum(){
        setrandom((int) (Math.random() * (getmax() - Main.min + 1) + Main.min));
        printNumbers(getrandom());
    }
}
//created by Seth/SJB