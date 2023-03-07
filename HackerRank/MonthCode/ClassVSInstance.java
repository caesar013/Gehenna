package HackerRank.MonthCode;

public class ClassVSInstance {
    public static void main(String[] args) {
        
    }
}

class Person{
    private int age;

    public Person(int initialAge){
        if (initialAge > 0) {
            age = initialAge;
        } else {
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
    }
}