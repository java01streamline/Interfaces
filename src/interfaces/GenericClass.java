
package interfaces;

public class GenericClass<T> {
    private T obj;
    
    public GenericClass(T obj){
        this.obj = obj;
    }
    
    public String type(){
        return obj.getClass().getName();
    }
}
