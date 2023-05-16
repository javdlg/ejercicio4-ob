/* Crea una clase Persona con las siguientes variables:

La edad

El nombre

El teléfono

Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.

Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.

Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador. */

public class Ejercicio1 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Javier");
        cliente.setEdad(29);
        cliente.setTelefono("1234-5678");
        cliente.setCredito(2000);
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getEdad());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Ezequiel");
        trabajador.setEdad(28);
        trabajador.setTelefono("8765-4321");
        trabajador.setSalario(5000);
        System.out.println(trabajador.getNombre());
        System.out.println(trabajador.getEdad());
        System.out.println(trabajador.getTelefono());
        System.out.println(trabajador.getSalario());
    }
}

class Persona {
    String nombre;
    int edad;
    String telefono;
}

class Cliente extends Persona {
    int credito;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setCredito(int credito) {
        this.credito = credito;
    }
    public int getCredito() {
        return credito;
    }
}

class Trabajador extends Persona {
    int salario;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
    public int getSalario() {
        return salario;
    }
}
