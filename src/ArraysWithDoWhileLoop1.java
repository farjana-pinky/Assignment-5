 public class ArraysWithDoWhileLoop1 extends WhileAndDoWhile {


    @Override
    void printStringArray() {
        int i = 0;
        String []array = {"F","a", "r", "j","a", "n", "a"};
        do {
            System.out.print(" " +array[i]);
            i++;

        } while (i < array.length);
        System.out.println();
    }


    @Override
    void printVowels(String vowelArray) {
        int i =0;
        while(i<1){
            System.out.println("The vowel is: " +vowelArray);
           i++;
        }


    }
     @Override
    void search_method(){
        String [] word ={"A","B","D","G","k","w","S","P"};
        String searchWord = "S";
        for(int i = 0; i<word.length;i++){

            if(word[i] == searchWord){

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
        do {
            System.out.println("this is method 1");

            i++;
        } while (i < 3);

    }

    @Override
    void method_2() {
        int i = 1;
        do {
            System.out.println("this is method 2");
            i++;
        } while (i < 3);
    }

    @Override
    void method_3() {
        int i = 1;
        do {
            System.out.println("this is method 3");
            i++;
        } while (i < 3);
    }

    @Override
    void method_4() {
        int i = 1;
        do {
            System.out.println("this is method 4");
            i++;
        } while (i < 4);
    }

    @Override
    void method_5() {
        int i = 1;
        do {
            System.out.println("this is method 5");
            i++;
        } while (i < 3);
    }

     @Override
     void printIntegarArray() {

     }

     @Override
     void printCharArray() {

     }

     @Override
     void searchStringArray(String word) {

     }

     @Override
     void searchIntegarArray(String number) {

     }

     @Override
     void searchCharArray(String letter) {

     }

     public static void main(String[] args) {

        ArraysWithDoWhileLoop1 obj = new ArraysWithDoWhileLoop1();
        obj.printVowels("A,E,I,O,U");
        obj.printStringArray();
        obj.search_method();
        obj.method_1();
        obj.method_2();
        obj.method_3();
        obj.method_4();
        obj.method_5();

    }

}

