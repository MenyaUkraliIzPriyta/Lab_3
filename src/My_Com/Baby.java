package My_Com;
//return
public class Baby extends Person implements doSome {

    public Baby(String name, Status stat) {
        super(name, stat);

    }

    public String dosomething() {
        return "Ошибка в статусе Baby.class: неверный статус";
    }
    public String dosomething(String obj) {
        if (obj.equals("кухня")) {
            if (stat == Status.MOVE) {
                return (name + " храбро двинулся на кухню.");
            }

            if (stat == Status.NOTAFRAID) {
                return (" ему нечего было бояться.");
            }

            if (stat == Status.AFRAID) {
                return (" поэтому он испугался и побежал на кухню.");
            }
        }
        if (obj.equals("гостиная")) {
            if (stat == Status.MOVE) {
                return (name + " храбро двинулся в в гостиную.");
            }

            if (stat == Status.NOTAFRAID) {
                return (" ему нечего было бояться.");
            }

            if (stat == Status.AFRAID) {
                return (" поэтому он испугался и побежал в гостиную.");
            }
        }
        if (obj.equals("душевая")) {
            if (stat == Status.MOVE) {
                return (name + " храбро двинулся в душевую.");
            }

            if (stat == Status.NOTAFRAID) {
                return (" ему нечего было бояться.");
            }

            if (stat == Status.AFRAID) {
                return (" поэтому он испугался и побежал в душевую.");
            }
        }
        return "Ошибка в статусе Baby.class: неверный статус";
    }

    public String understood(Status obj) {
        if (obj == Status.REJOICE) {
            return ("Малыш прекрасно понимал, что она хочет с кем-нибудь поговорить и попить кофе со свежими печеньками.");
        }
        if (obj == Status.BURN) {
            return ("Малыш прекрасно понимал, что она собиралась провести в тишине несколько приятных минут, заедая кофе свежими плюшками.");

        }
        return "Ошибка в статусе Baby.class: неверный статус";

    }

}
