import java.util.Scanner;

public class ArraysWithWhileLoop extends WhileAndDoWhile {


    @Override
    void printStringArray() {
        int i = 0;
        String []array = {"P","a", "P", "R","I"};
         while (i < array.length){
            System.out.print(" " +array[i]);
            i++;
        }
        System.out.println();
    }

    @Override
    void printVowels(String vowelArray) {

        int i = 0;
        while (i < 1) {
            System.out.println("The vowel is: " + vowelArray);
            i++;
        }
    }

    @Override
    void search_method() {
        String [] word ={"H","I","E","V","E","R","Y","O","N","E"};
       // String searchWord = "E";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the searchWord" );
        String searchWord = sc.nextLine();
        for(int i = 0; i<word.length; i++)
        {

            if(word[i].equalsIgnoreCase(searchWord)){

                System.out.println("Here I am you found me:" +word[i] +" And the index is: "+i);
                return;
            }
        }
        System.out.println("you enter wrong input");
        System.out.println();
    }

    @Override
    void method_1() {
        System.out.println();
        int i = 1;
        while (i < 2) {
            System.out.println("this is method 1");

            i++;
        }

    }

    @Override
    void method_2() {

        int i = 1;
        while (i < 2) {
            System.out.println("this is method 2");

            i++;
        }
    }

    @Override
    void method_3() {

        int i = 1;
        while (i < 2) {
            System.out.println("this is method 3");

            i++;
        }
    }

    @Override
    void method_4() {
        int i = 1;
        while (i < 2) {
            System.out.println("this is method 4");

            i++;
        }

    }

    @Override
    void method_5() {
        int i = 1;
        while (i < 2) {
            System.out.println("this is method 5");

            i++;
        }

    }

    @Override
    void printIntegarArray() {
        int [] number = {1,2,3,4,5};
        for(int num:number){
            System.out.print(" " +num);
        }
        System.out.println();
    }

    @Override
    void printCharArray() {
        char [] ch = {'a','b','c','d','e'};
        for(char ch1:ch){
            System.out.print(" " +ch1);
        }
        System.out.println();

    }

    @Override
    void searchStringArray(String word) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the searchWord" );
        String searchWord = sc.nextLine();

            if(word.equalsIgnoreCase(searchWord)){

                System.out.println("Here I am you found me:" +word);
                return;
            }

        System.out.println("you enter wrong input");
        System.out.println();
    }



    @Override
    void searchIntegarArray(String number) {

    }

    @Override
    void searchCharArray(String letter) {

    }

    public static void main(String[] args) {

        ArraysWithWhileLoop obj = new ArraysWithWhileLoop();
        obj.printStringArray();
        obj.printVowels("A,E,I,O,U");
        obj.search_method();
        obj.method_1();
        obj.method_2();
        obj.method_3();
        obj.method_4();
        obj.method_5();
        obj.searchStringArray("Bangladesh");
        System.out.println("Here print Char array");
        obj.printCharArray();
        System.out.println("Here print integer array");
        obj.printIntegarArray();
    }
}
