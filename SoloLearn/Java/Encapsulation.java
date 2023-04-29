package SoloLearn.Java;

public class Encapsulation {
    /*
     * 
     * Methods and classes can also be marked final. This serves to restrict methods so that they can't be overridden and classes so that they can't be subclassed.
     * These concepts will be covered in the next module.
     */
    private double balance=0;
    public void deposit(double x) {
        if(x > 0) {
            balance += x;
        }
    }

    /*
     * Remember that the code below only purpose is to avoid an error
     */
    public double getBalance(){
        return this.balance;
    }

    /*
     * This implementation hides the balance variable, enabling access to it only through the deposit method, 
     * which validates the amount to be deposited before modifying the variable. 
     */

     /*
      * 
        In summary, encapsulation provides the following benefits:

        - Control of the way data is accessed or modified

        - More flexible and easily changed code

        - Ability to change one part of the code without affecting other parts
      */
}
