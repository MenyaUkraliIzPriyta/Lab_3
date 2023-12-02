package My_Com;

public class Tamer extends Person implements doSome{

    public Tamer(String name, Status stat){
        super(name, stat);
    }


    public String dosomething() {
        if (stat == Status.HELP) {
            return ("Ему помогал лучший в мире " + name + " домомучительниц,");
        }
        if (stat == Status.UNHELP) {
            return ("Ему не помогал лучший в мире " + name + " домомучительниц,");

        }
        return "Ошибка в статусе Housewife.class: неверный статус";
    }

    @Override
    public Status get() {
        return this.stat;
    }
}
