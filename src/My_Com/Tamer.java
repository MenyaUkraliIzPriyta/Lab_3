package My_Com;

public class Tamer extends Person implements doSome{

    public Tamer(String name, Status stat){
        super(name, stat);
    }


    public void dosomething() {
        if (stat == Status.Help) {
            System.out.print("Ему помогал лучший в мире " + name + " домомучительниц,");
        }
        if (stat == Status.Unhelp) {
            System.out.print("Ему не помогал лучший в мире " + name + " домомучительниц,");

        }
    }

    public Status get() {
        return this.stat;
    }
}
