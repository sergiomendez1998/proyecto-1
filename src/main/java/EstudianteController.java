import modelo.Estudiante;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EstudianteController implements EstudianteInterface {


    /**
     * @param estudiante
     */
    @Override
    public void guardarEstudiante(Estudiante estudiante) {
        Estudiante encontrarEstudiante = Estudiante.listaEstudiantes.stream()
                        .filter(estu -> estu.getDpi() == estudiante.getDpi())
                        .findFirst()
                        .orElse(null);

        if (encontrarEstudiante == null) {
            Estudiante.listaEstudiantes.add(estudiante);
            System.out.println("Estudiante guardado");
        }else{
            System.out.println("El estudiante ya existe");
        }

    }

    /**
     * @param estudiante
     */
    @Override
    public void modificarEstudiante(Estudiante estudiante) {
         Estudiante modificarEstudiante = buscarEstudiante(estudiante.getId());
         if (modificarEstudiante != null) {
                modificarEstudiante.setNombre(estudiante.getNombre());
                modificarEstudiante.setApellido(estudiante.getApellido());
                modificarEstudiante.setDpi(estudiante.getDpi());
                modificarEstudiante.setDireccion(estudiante.getDireccion());
                modificarEstudiante.setTelefono(estudiante.getTelefono());
                modificarEstudiante.setCorreo(estudiante.getCorreo());
                modificarEstudiante.setFechaNacimiento(estudiante.getFechaNacimiento());
         }else{
                System.out.println("El estudiante no existe");
         }

    }

    /**
     * @param id
     */
    @Override
    public void eliminarEstudiante(int id) {
        Estudiante eliminarEstudiante = buscarEstudiante(id);
        if (eliminarEstudiante != null) {
            Estudiante.listaEstudiantes.remove(eliminarEstudiante);
        }else{
            System.out.println("El estudiante no existe");
        }

    }

    /**
     * @param id
     * @return
     */
    @Override
    public Estudiante buscarEstudiante(int id) {
        Estudiante encontrarEstudiante = Estudiante.listaEstudiantes.stream()
                        .filter(estu -> estu.getId() == id)
                        .findFirst()
                        .orElse(null);
        return encontrarEstudiante;
    }

    /**
     * @return
     */
    @Override
    public List<Estudiante> listarEstudiantes() {
        List<Estudiante> ret = new ArrayList<>();
        for(Estudiante estudiante: Estudiante.listaEstudiantes){
            System.out.println(estudiante);
            ret.add(estudiante);
        }
        return ret;
    }
}

