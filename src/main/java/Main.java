import modelo.Estudiante;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        estudiante.setId(1);
        estudiante.setNombre("Juan");
        estudiante.setApellido("Perez");
        estudiante.setDpi(1234567589);
        estudiante.setDireccion("Zona 1");
        estudiante.setTelefono(12345678);
        estudiante.setCorreo("Juan@gmail.com");
        estudiante.setFechaNacimiento(null);
        estudiante.setEstado("Activo");

        EstudianteController estudianteController = new EstudianteController();
        estudianteController.guardarEstudiante(estudiante);
        System.out.println("-------------------------------");


        Estudiante estudiante2 = new Estudiante();
        estudiante2.setId(1);
        estudiante2.setDireccion("Zona 6");
        estudiante2.setCorreo("Perez@gmail.com");
        estudiante2.setEstado("inactivo");
        estudianteController.modificarEstudiante(estudiante2);
        System.out.println("-------------------------------");
        estudianteController.listarEstudiantes();
    }
}
