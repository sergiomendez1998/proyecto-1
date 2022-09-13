import modelo.Estudiante;

import java.util.List;

public interface EstudianteInterface {
    public void guardarEstudiante(Estudiante estudiante);
    public void modificarEstudiante(Estudiante estudiante);
    public void eliminarEstudiante(int id);
    public Estudiante buscarEstudiante(int id);
    public List<Estudiante> listarEstudiantes();
}
