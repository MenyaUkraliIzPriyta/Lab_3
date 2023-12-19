package My_Com;

public class Author implements Speech{
    protected String name;
    public Author(String name) {
        this.name = name;
    }
    @Override
    public void say1() {

        System.out.println("Пацану повезло и он хорошо провел время.");
    }

    @Override
    public void say2() {

        System.out.println("Должно быть, есть мучное вредно только детям.");
    }

    // вложенный внутренний класс
    public class Baby_mind {
        public void say() {
            System.out.println("Малой подумал, что теперь самое время с ней заговорить.");
        }

    }
}
