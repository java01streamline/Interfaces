
package interfaces;

public class Class1 implements MyInterface{

    @Override
    public void action() {
        System.out.println("It is "+this.getClass().getName());
    }

    @Override
    public double degreeOfNumber(double num, int degree) {
        return Math.pow(num, degree);
    }
    
}
