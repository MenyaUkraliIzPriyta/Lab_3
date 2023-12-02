package My_Com;

public class Author implements Speech{
    protected String name;
    public Author(String name) {
        this.name = name;
    }
    @Override
    public String say1() {

        return ("Пацану повезло и он хорошо провел время.");
    }

    @Override
    public String say2() {

        return ("Должно быть, есть мучное вредно только детям.");
    }
}
