package My_Com;

public abstract class Person {
    protected String name;
    protected Status stat;

    public Person(String name, Status stat){
        this.name = name;
        this.stat = stat;
    }
    public Status get() {
        return this.stat;
    }

}
