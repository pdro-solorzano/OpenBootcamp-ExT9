public class Main {
    public static void main(String[] args) {
        // Cliente
        Cliente cliente = new Cliente();
        cliente.setNombre("Franciso Reynosa");
        cliente.setEdad(36);
        cliente.setTelefono("3322556677");
        cliente.setCredito((float) 19000.00);

        // Mostrar datos cliente
        System.out.println("** Datos Cliente **");
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Telefono: " + cliente.getTelefono());
        System.out.println("Credito: " + cliente.getCredito() + "\n");

        // Trabajador
        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Guadalupe Esparza");
        trabajador.setEdad(25);
        trabajador.setTelefono("3399887755");
        trabajador.setSalario((float) 25000.00);

        // Mostrar datos trabajador
        System.out.println("** Datos Trabajador **");
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Telefono: " + trabajador.getTelefono());
        System.out.println("Salario: " + trabajador.getSalario());
    }
}

