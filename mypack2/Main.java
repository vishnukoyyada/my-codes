package mypack2;
class Vishnu{
     public int method(){
        return 10;
    }
}
public class Main extends Vishnu{
    static int method2(){
        return 10*10;
    }
    public static void main(String[] args){
        Vishnu myobj = new Vishnu();
        System.out.println(myobj.method());
        System.out.println(method2());
    }

}