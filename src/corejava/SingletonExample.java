package corejava;

class Singleton {
    private static Singleton singleInstance = null;
    public String str;
    private Singleton(){
        str = "Singleton class string";
    }
    public static synchronized Singleton getInstance(){
        if(singleInstance == null){
            singleInstance = new Singleton();
        }
        return singleInstance;
    }
}
public class SingletonExample {
    public static void main(String[] args) {

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();
        System.out.println("Hashcode of obj1 is: "+obj1.hashCode());
        System.out.println("Hashcode of obj2 is: "+obj2.hashCode());
        System.out.println("Hashcode of obj3 is: "+obj3.hashCode());
    }
}
