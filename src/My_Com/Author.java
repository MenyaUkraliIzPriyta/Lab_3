package My_Com;

public class Author implements Speech{
    protected String name;
    public Author(String name) {
        this.name = name;
    }
    public void say1() {
        System.out.println("Малышу повезло и он хорошо провел время.");
    }

    public void say2() {
        System.out.println("Должно быть, есть мучное вредно только детям.");
    }
}