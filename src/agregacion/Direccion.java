package agregacion;

public class Direccion {  int numeroCalle;
    String ciudad;
    String departamento;
    String pais;

    public Direccion(int numeroCalle, String ciudad, String departamento, String pais) {
        this.numeroCalle = numeroCalle;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.pais = pais;
    }
}

class StudentClass{
    int rollNumb;
    String nombreEstudiante;
    Direccion direstudi;

    public StudentClass(int rollNumb, String nombreEstudiante, Direccion direstudi) {
        this.rollNumb = rollNumb;
        this.nombreEstudiante = nombreEstudiante;
        this.direstudi = direstudi;
    }

    public static void main(String[] args) {
        Direccion ad = new Direccion(55,"Armenia","Quindio","Colombia");
        StudentClass obj = new StudentClass(123,"Maria",ad);
        System.out.println(obj.rollNumb);
        System.out.println(obj.nombreEstudiante);
        System.out.println(obj.direstudi.numeroCalle);
        System.out.println(obj.direstudi.ciudad);
        System.out.println(obj.direstudi.departamento);
        System.out.println(obj.direstudi.pais);
    }
}

