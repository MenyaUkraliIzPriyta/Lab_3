package My_Com;
import Exceptions.IncorrectdoSomethingException;

import java.lang.Math;

public class Housewife extends Person implements doSome {
    public Status st;
    private double a = Math.random();
    public Housewife(String name){
        super(name);
    }

    @Override
    public void dosomething() {
        if (a >= 0.5) {
            st = Status.REJOICE;
            System.out.println( "На этот раз " + name +  " очень обрадовалась его появлению.");
        }
        if (a < 0.5) {
            st = Status.BURN;
            System.out.println( "На этот раз " + name +  " вовсе не обрадовалась его появлению. Она как раз варила себе кофе.");

        }
    }

    @Override
    public Status get() {
        return st;
    }
}
