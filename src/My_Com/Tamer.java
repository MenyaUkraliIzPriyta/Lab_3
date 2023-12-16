package My_Com;

import Exceptions.IncorrectdoSomethingException;

public class Tamer extends Person implements doSome{

    public Tamer(String name, Status stat){
        super(name, stat);
    }


    public void dosomething() throws IncorrectdoSomethingException {
        if (stat == Status.HELP) {
            System.out.println("Ему помогал лучший в мире " + name + " домомучительниц,");
        }
        else if (stat == Status.UNHELP) {
            System.out.println("Ему не помогал лучший в мире " + name + " домомучительниц,");

        }
        else {
            throw new IncorrectdoSomethingException("Ошибка в статусе Tamer.class: неверный статус");
        }
    }

    @Override
    public Status get() {
        return this.stat;
    }
}
