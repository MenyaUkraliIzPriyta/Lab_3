package My_Com;
import java.lang.Math;

public class Housewife extends Person implements doSome {
    public Status st;
    protected double a = Math.random();
    public Housewife(String name){
        super(name);
    }

    public void dosomething() {
        if (a >= 0.5) {
            st = Status.Rejoice;
            System.out.println( "На этот раз " + name +  " очень обрадовалась его появлению.");

        }
        if (a < 0.5) {
            st = Status.Burn;
            System.out.println( "На этот раз " + name +  " вовсе не обрадовалась его появлению.");
            System.out.println("Она как раз варила себе кофе.");
        }

    }

    public Status get() {
        return st;
    }
}
