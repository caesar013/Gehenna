package HackerRank.MonthCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClassVSInstance {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(bf.readLine().trim());
        if (i < 1 || i > 4) {
            bf.close();
            System.exit(0);
        }
        while (i-- > 0) {
            int a = Integer.parseInt(bf.readLine().trim());
            if (a < -5 || a > 30) {
                continue;
            }
            Person p = new Person(a);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        bf.close();
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

    public void yearPasses(){
        age++;
    }

    public void amIOld(){
        if (age < 13) {
            System.out.println("You are young.");
        } else if (age >= 13 && age <18){
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }
}