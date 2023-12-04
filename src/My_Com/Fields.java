package My_Com;

import java.util.Objects;

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

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Fields place = (Fields) o;
        return (this.getName()).equals(place.getName());
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.getName());
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '}';
    }
}
