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


        /*Estudiante estudiante2 = new Estudiante();
        estudiante2.setId(1);
        estudiante2.setDireccion("Zona 6");
        estudiante2.setCorreo("Perez@gmail.com");
        estudiante2.setEstado("inactivo");
        estudianteController.modificarEstudiante(estudiante2);*/


        estudianteController.listarEstudiantes().stream().forEach(estudiante1 -> {
            System.out.println(estudiante1.getNombre());
            System.out.println(estudiante1.getApellido());
            System.out.println(estudiante1.getDpi());
            System.out.println(estudiante1.getDireccion());
            System.out.println(estudiante1.getTelefono());
            System.out.println(estudiante1.getCorreo());
            System.out.println(estudiante1.getFechaNacimiento());
            System.out.println(estudiante1.getEstado());
            System.out.println("-------------------------------");
        });
    }
}
