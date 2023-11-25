package My_Com;

public abstract class Person {
    protected String name;
    protected Status stat;

    public Person(String name, Status stat){
        this.name = name;
        this.stat = stat;
    }
    public Person(String name){
        this.name = name;

    }
    public Status get() {
        return this.stat;
    }

}
