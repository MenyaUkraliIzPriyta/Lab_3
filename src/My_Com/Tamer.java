package My_Com;

public class Tamer extends Person implements doSome{
    public Tamer(String name, Status stat){
        super(name, stat);
        this.name = name;
        this.stat = stat;
    }
    public void dosomething() {
        if (stat == Status.Help) {
            System.out.println("Ему помогал лучший в мире " + name + " домомучительниц");
        }
    }
}
