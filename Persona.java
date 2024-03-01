public class Persona {
    String name;
    int matricula;

    public Persona(String name, int matricula) {
        this.name = name;
        this.matricula = matricula;
    }

    public void mostrar() {
        System.out.println(name + " " + matricula);
    }

}
