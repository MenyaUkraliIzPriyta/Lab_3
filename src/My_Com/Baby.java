package My_Com;

import Exceptions.IncorrectdoSomethingException;

//return
public class Baby extends Person implements doSome {

    public Baby(String name, Status stat) {
        super(name, stat);

    }

    public void dosomething() {
        System.out.println("Ошибка в статусе Baby.class: неверный статус");
    }
    public void dosomething(String obj) throws IncorrectdoSomethingException {
        if (obj.equals("кухня")) {
            if (stat == Status.MOVE) {
                System.out.println(name + " храбро двинулся на кухню.");
            }

            else if (stat == Status.NOTAFRAID) {
                System.out.println("ему нечего было бояться.");
            }

            else if (stat == Status.AFRAID) {
                System.out.println(" поэтому он испугался и побежал на кухню.");
            }
            else
                throw new IncorrectdoSomethingException("Ошибка в статусе Baby.class: неверный статус");
        }
        if (obj.equals("гостиная")) {
            if (stat == Status.MOVE) {
            }

            else if (stat == Status.NOTAFRAID) {
                System.out.println(" ему нечего было бояться.");
            }

            else if (stat == Status.AFRAID) {
                System.out.println(" поэтому он испугался и побежал в гостиную.");
            }
            throw new IncorrectdoSomethingException("Ошибка в статусе Baby.class: неверный статус");
        }
        if (obj.equals("душевая")) {
            if (stat == Status.MOVE) {
                System.out.println(name + " храбро двинулся в душевую.");
            }

            else if (stat == Status.NOTAFRAID) {
                System.out.println(" ему нечего было бояться.");
            }

            else if (stat == Status.AFRAID) {
                System.out.println(" поэтому он испугался и побежал в душевую.");
            }
            else {
                throw new IncorrectdoSomethingException("Ошибка в статусе Baby.class: неверный статус");
            }

        }

    }

    public void understood(Status obj) throws IncorrectdoSomethingException  {
        if (obj == Status.REJOICE) {
            System.out.println("Малыш прекрасно понимал, что она хочет с кем-нибудь поговорить и попить кофе со свежими печеньками.");
        }
        else if (obj == Status.BURN) {
            System.out.println("Малыш прекрасно понимал, что она собиралась провести в тишине несколько приятных минут, заедая кофе свежими плюшками.");

        }
        else {
            throw new IncorrectdoSomethingException("Ошибка в статусе Baby.class: неверный статус");
        }
    }

}
