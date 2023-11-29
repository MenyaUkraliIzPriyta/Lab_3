package My_Com;

// кухня, душевая, гостиная
public class Fields {
    public String name;
    public Fields(String name ) {
        this.name = name;


    }

    public String getPlace() {
        return this.name;
    }

    public boolean checkPlace() {
        if (name.equals("кухня") | name.hashCode() == ("душевая").hashCode() | name.equals("гостиная")) {
            return true;
        }
        else {
            return false;
        }
    }

}
