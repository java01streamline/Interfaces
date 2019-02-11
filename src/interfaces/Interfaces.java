
package interfaces;

public class Interfaces {

    public static void main(String[] args) {
        /*****Interfaces*****/
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
        
        /*****GENERIC*****/
        String str = "Str";
        Integer intVal = 55;
        
        getType(str);
        getType(intVal);
        getType(myClass);
        
        System.out.println(info(str));
        System.out.println(info(intVal));
        System.out.println(info(new Double("55.4")));
        System.out.println(info(myClass));
        
        checkTypes(str, intVal);
        checkTypes(myClass, myClass);
        System.out.println("_____________");
        GenericClass<String> g1 = new GenericClass<>(str);
        GenericClass<Class1> g2 = new GenericClass<>(myClass);
        System.out.println(g1.type());
        System.out.println(g2.type());
    }
    
    private static <T>void  getType(T value){
        System.out.println(value.getClass().getName());
    }
    
    private static <Type>String info(Type value){
        if(value instanceof String) return "Строка, которая состоит из символов";
        if(value instanceof Integer) return "Число, которое является целым";
        if(value instanceof Double) return "Число, которое содержит дробную часть";
        return "Неопределённый тип";
    }
    
    private static <T1, T2>void checkTypes(T1 value1, T2 value2){
        if(value1.getClass().equals(value2.getClass()))
            System.out.println("Equals types");
        else
            System.out.println("Different types");
    }
    
}
