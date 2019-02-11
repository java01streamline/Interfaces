
package interfaces;

public class Interfaces {

    public static void main(String[] args) {
        MyInterface inter = new Class1();
        inter.action();
        System.out.println(inter.degreeOfNumber(4, 2));
        inter = new Class2();
        inter.action();
        System.out.println(inter.degreeOfNumber(4, 2));
        System.out.println("__________");
        Class1 myClass = new Class1();
        System.out.println(myClass.degreeOfNumber(5, 2));
        myClass.action();
        Class2 myClass2 = new Class2();
        System.out.println(myClass2.degreeOfNumber(5, 2));
        myClass2.action();
        System.out.println("__________");
        MyInterface[] arr = new MyInterface[2];
        arr[0] = myClass;
        arr[1] = myClass2;
        
        for(int i = 0; i < arr.length; i++){
            arr[i].action();
        }
    }
    
}
