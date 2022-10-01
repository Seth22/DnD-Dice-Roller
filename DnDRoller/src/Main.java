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
            randomnum();
            reroll();
        }
        catch(InputMismatchException ex) {
            System.out.println("That's Universally Stupid Man, type a whole number");
            input();
        }
    }
    public static void reroll() {
        try {
            System.out.println("type 1 to reroll, type 2 to reset dice, type anything to exit");
            Scanner input1 = new Scanner(System.in);
            int newinput = input1.nextInt();
            if (Math.abs(newinput) == 1) {
                randomnum();
                if (getrandom()>99) {
                System.out.println(getrandom());}
                reroll();
            }
            else if (Math.abs(newinput) == 2) {
                input();
            }
            else {
                System.out.println("Until we meet again!");
            }
        }
        catch(InputMismatchException ex) {
        System.out.println("Until we meet again!");
        }
    }
    public static void printNumbers(String[] number0, String[] number1) {
            for (int x = 0; x < 5; x++) {
                System.out.print(number0[x]);
                System.out.print("    ");
                System.out.print(number1[x]);
                System.out.print("\n");
            }
    }
    public static void printNumber(String[] number) {
        for (int x = 0; x < 5; x++) {
            System.out.print(number[x]);
            System.out.print("\n");
        }
    }
    public static void artnum() {
        int number = getrandom();
        int firstdigit = (number/10);
        int seconddigit = (number - (firstdigit*10));
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
        if (getrandom()<10) {
        printNumber(arrays[getrandom()]);
        }
        else if (getrandom()<100) {
        printNumbers(arrays[firstdigit],arrays[seconddigit]);
        }
    }
    public static void randomnum(){
        setrandom((int) (Math.random() * (getmax() - Main.min + 1) + Main.min));
        if (getrandom()<100) {
            artnum();
        }
    }
}
//created by Seth/SJB
//Maybe add loops to roll multible times
//add support for three digit numbers possible bigger(Using math :D)