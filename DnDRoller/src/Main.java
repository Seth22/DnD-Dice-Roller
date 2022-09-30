import java.util.ArrayList;
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
        System.out.println("Let's Roll!");
        System.out.println("       .-------.    ______");
        System.out.println("      /   o   /|   //\\     \\");
        System.out.println("     /_______/o|  //o \\  o  \\");
        System.out.println("     | o     | | //   o\\_____\\");
        System.out.println("     |   o   |o/ \\o   /o    /");
        System.out.println("     |     o |/   \\ o/  o  /");
        System.out.println("     '-------'     \\/____o/");
        input();
    }
    public static void input() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("D:");
            setmax(Math.abs(input.nextInt()));
            output();
        }
        catch(InputMismatchException ex) {
            System.out.println("literally put any number stupid ass fucking human headass");
            input();
        }
    }
    public static void output() {
        randomnum();
        reroll();
    }
    public static void reroll() {
        try {
            System.out.println("Press 1 to reroll, press 2 to reset dice, press 3 to exit");
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
            else if (Math.abs(newinput) >3) {
                System.out.println("Please input 1-3, stupid ass mf");
                reroll();
            }
            else {
                System.out.println("See you later Space Cowboy");
            }
        }
        catch(InputMismatchException ex) {
            System.out.println("Follow the fucking directions omh");
            reroll();
        }
    }
    public static void artnum() {
        int number = getrandom();
        int firstdigit = number/10;
        int seconddigit = number - (firstdigit*10);
        ArrayList<String> art = new ArrayList<>();
        art.add(0, """
                 0000
                00  00
                00  00
                00  00
                 0000""");
        art.add(1, """
                1111
                  11
                  11
                  11
                111111""");
        art.add(2, """
                 2222
                22  22
                   22
                  22
                222222""");
        art.add(3, """
                 3333
                33  33
                   333
                33  33
                 3333""");
        art.add(4, """
                44  44
                44  44
                444444
                    44
                    44""");
        art.add(5, """
                555555
                55
                55555
                    55
                55555""");
        art.add(6, """
                 6666
                66
                66666
                66  66
                 6666""");
        art.add(7, """
                777777
                   77
                  77
                 77
                77""");
        art.add(8, """
                 8888
                88  88
                 8888
                88  88
                 8888""");
        art.add(9, """
                999999
                99  99
                999999
                    99
                   99
                  99""");
        if (getrandom()<10) {
            System.out.println(art.get(number));
        }
        else if (getrandom()<100) {
            System.out.println(art.get(firstdigit));
            System.out.println(art.get(seconddigit));
        }
        System.out.println(getrandom());
    }
    public static void randomnum(){
        setrandom((int) (Math.random() * (getmax() - Main.min + 1) + Main.min));
        if (getrandom()<100) {
            artnum();
        }
    }
}
//created by Seth/SJB