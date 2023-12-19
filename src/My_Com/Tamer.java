package My_Com;

import Exceptions.IncorrectdoSomethingException;

public class Tamer extends Person implements doSome {

    public Tamer(String name, Status stat) {
        super(name, stat);
    }


    public void dosomething() throws IncorrectdoSomethingException {
        if (stat == Status.HELP) {
            System.out.println("Ему помогал лучший в мире " + name + " домомучительниц,");
        } else if (stat == Status.UNHELP) {
            System.out.println("Ему не помогал лучший в мире " + name + " домомучительниц,");

        } else {
            throw new IncorrectdoSomethingException("Ошибка в статусе Tamer.class: неверный статус");
        }
    }

    @Override
    public Status get() {
        return this.stat;
    }

    public interface Movies {
        void move1();

        void move2();
    }

    public Movies get_move() {
//        локальный класс
        class Moment implements Movies {

            @Override
            public void move1() {
                System.out.println("Но Карлсона не было видно.");
            }

            @Override
            public void move2() {
                System.out.println("Только маленькая пухлая ручка вдруг мелькнула в окне и схватила плюшку с блюда.");;
            }
        }
        return new Moment();

    }
}
