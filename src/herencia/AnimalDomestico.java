package herencia;

public class AnimalDomestico {
    private String name;
    private int weight;

    public AnimalDomestico(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void comer(){

    }
}

class Dog extends AnimalDomestico{
    private String raza;

    public Dog(String name, int weight) {
        super(name, weight);
    }

    public Dog(String name, int weight, String raza) {
        super(name, weight);
        this.raza = raza;
    }

    @Override
    public void comer() {
        super.comer();
    }
}

