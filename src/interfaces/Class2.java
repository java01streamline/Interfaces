
package interfaces;

public class Class2 implements MyInterface{

    @Override
    public void action() {
        System.out.println("It is "+this.getClass().getName());
    }

    @Override
    public double degreeOfNumber(double num, int degree) {
        double ret = 1;
        for(int i = 1; i <= degree;i++){
            ret *= num;
        }
        return ret;
    }
    
}
