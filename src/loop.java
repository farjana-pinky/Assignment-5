public class loop {
   public void printStringArray() {

       String [] subjects= {"math","computer science","history","geograpghy"};
       for(int i =0; i<subjects.length;i++){
           System.out.println(subjects[i]);
       }
   }
   public void printIntegarArray(){
        int [] numbers= {3,7,9,4,2};

        for(int i =0; i<numbers.length;i++){

            System.out.print(" " +numbers[i]);

        }
        System.out.println();
    }

    public void printCharArray(){

        char [] alphabets= {'a','c','e'};
        for(int i =0; i<alphabets.length;i++){
            System.out.print(" " +alphabets[i]);

        }
        System.out.println();
    }

    public void printStringArray2(){
        String [] subjects= {"math","computer science","history","geograpghy"};

        for(String sub:subjects){

            System.out.println(sub);
        }

    }

    public void printIntegarArray2(){

        int [] numbers= {3,7,9,4,2};
        for(int num:numbers){

            System.out.print(" " +num);

        }
        System.out.println();
    }

    public void printCharArray2() {

        char[] alphabets = {'a', 'c', 'e'};
        for(char alpha:alphabets){

            System.out.print(" " +alpha);

        }

    }
        public static void main(String[] args) {
      loop obj = new loop();
      System.out.println("Printing String array using for loop");
      obj.printStringArray();
      System.out.println("Printing Integer array using for loop");
      obj.printIntegarArray();
      System.out.println("Printing Char array using for loop");
      obj.printCharArray();
      System.out.println("Printing String array using for each loop");
      obj.printStringArray2();
      System.out.println("Printing Integer array using for each loop");
      obj.printIntegarArray2();
      System.out.println("Printing Char array using for each loop");
      obj.printCharArray2();
    }
}
