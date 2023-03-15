package SoloLearn.Java;
class variabel {

    /**********************************
     * `Variables store data for processing. A variable is given a name (or
     * ~identifier~), such as area, age, height, and the like. The name uniquely
     * identifies each variable, assigning a value to the variable and retrieving
     * the value stored.
     * 
     * @param args
     ************************************/
    public static void main(String args[]) {

        int bilanganBulat = 1;
        // int : for integers (Whole Number) such as 123 or -432
        double bilanganRiil = 2.5;
        // double : for floating-point or real numbers with optional decimal points and
        // fractional parts in fixed or scienfic notations, such as 3.1416, -55.66.
        String kalimat = "Materi Variabel";
        // String : for texts such as "Hello" or "Good Morning!". Text Strings are
        // enclosed within double quotes("...").
        // this creates a variable called ~kalimat~ of type ~String~, and assigns it the
        // value "Materi Variabel".
        char karakter = '0', karak = '1';
        // char : stands for character and holds a SINGLE character.
        /**
         * NOTE : Please pay attention! One type can only store one type of values. pay
         * attention on char type data! notice that we can put semicolon after we
         * declare 2 values of ~char-typed~ data. we differ 2 values by adding comma in
         * between.
         */
        boolean online = true;
        // Boolean type has only two possible vallues : true or false.
        // this data type is used for simple flags that track true/false conditions.

        System.out.print(bilanganBulat);
        System.out.println("\tisi dari " + kalimat + " adalah");
        System.out.print(bilanganRiil);
        System.out.println(String.format("\t%s & %s adalah sebuah karakter", karakter, karak));
        System.out.print(online);
    }
}