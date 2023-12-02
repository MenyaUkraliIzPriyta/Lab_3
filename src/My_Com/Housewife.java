package My_Com;
import java.lang.Math;

public class Housewife extends Person implements doSome {
    public Status st;
    private double a = Math.random();
    public Housewife(String name){
        super(name);
    }

    @Override
    public String dosomething() {
        if (a >= 0.5) {
            st = Status.REJOICE;
            return ( "На этот раз " + name +  " очень обрадовалась его появлению.");
        }
        if (a < 0.5) {
            st = Status.BURN;
            return ( "На этот раз " + name +  " вовсе не обрадовалась его появлению.\"Она как раз варила себе кофе.\"");

        }
        return "Ошибка в статусе Housewife.class: неверный статус";
    }

    @Override
    public Status get() {
        return st;
    }
}
