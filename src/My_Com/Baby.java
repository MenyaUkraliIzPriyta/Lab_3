package My_Com;

public class Baby extends Person implements doSome {

    public Baby(String name, Status stat) {
        super(name, stat);

    }


    public void dosomething() {
//        if (stat == Status.Move) {
//            System.out.println(name + " храбро двинулся на кухню.");
//        }
//
//        if (stat == Status.NotAfraid) {
//            System.out.println(" ему нечего было бояться.");
//        }
//
//        if (stat == Status.Afraid) {
//            System.out.println(" поэтому он испугался и побежал на кухню.");
//        }

    }
    public void dosomething(String obj) {
        if (obj.equals("кухня")) {
            if (stat == Status.Move) {
                System.out.println(name + " храбро двинулся на кухню.");
            }

            if (stat == Status.NotAfraid) {
                System.out.println(" ему нечего было бояться.");
            }

            if (stat == Status.Afraid) {
                System.out.println(" поэтому он испугался и побежал на кухню.");
            }
        }
        if (obj.equals("гостиная")) {
            if (stat == Status.Move) {
                System.out.println(name + " храбро двинулся в в гостиную.");
            }

            if (stat == Status.NotAfraid) {
                System.out.println(" ему нечего было бояться.");
            }

            if (stat == Status.Afraid) {
                System.out.println(" поэтому он испугался и побежал в гостиную.");
            }
        }
        if (obj.equals("душевая")) {
            if (stat == Status.Move) {
                System.out.println(name + " храбро двинулся в душевую.");
            }

            if (stat == Status.NotAfraid) {
                System.out.println(" ему нечего было бояться.");
            }

            if (stat == Status.Afraid) {
                System.out.println(" поэтому он испугался и побежал в душевую.");
            }
        }
    }

    public void understood(Status obj) {
        if (obj == Status.Rejoice) {
            System.out.println("Малыш прекрасно понимал, что она хочет с кем-нибудь поговорить и попить кофе со свежими печеньками.");
        }
        if (obj == Status.Burn) {
            System.out.println("Малыш прекрасно понимал, что она собиралась провести в тишине несколько приятных минут, заедая кофе свежими плюшками.");

        }

    }



}
