package herencia;

public class Persona {
    private int id;
    private String name;

    public Persona() {
    }

    public Persona(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Employee extends Persona{
    public String cargo;

    public Employee(String cargo) {
        this.cargo = cargo;
    }

    public Employee(int id, String name, String cargo) {
        super(id, name);
        this.cargo = cargo;
    }
}

