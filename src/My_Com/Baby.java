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
        if (obj == "кухня") {
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
        if (obj == "гостиная") {
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
        if (obj == "душевая") {
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



}
