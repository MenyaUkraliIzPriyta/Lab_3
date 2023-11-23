package My_Com;

public class Baby extends Person implements doSome {

    final private Status stat;
    public Baby(String name, Status stat) {
        super(name, stat);
        this.name = name;
        this.stat = stat;
    }


    public void dosomething() {
        if (stat == Status.Move) {
            System.out.println(name + " храбро двинулся на кухню.");
        }
        if (stat == Status.NotAfraid) {
            System.out.println("ему нечего было бояться.");
        }

    }
}
