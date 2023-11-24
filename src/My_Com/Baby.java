package My_Com;

public class Baby extends Person implements doSome {

    public Baby(String name, Status stat) {
        super(name, stat);

    }


    public void dosomething() {
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
}
