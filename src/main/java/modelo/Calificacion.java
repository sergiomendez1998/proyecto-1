package modelo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Calificacion {
    private int id;
    private int nota;
    private Estudiante estudiante;
    private Curso curso;
    private String comentario;
    private Date fechaIngreso;
    public static List<Calificacion> listaCalificaciones = new ArrayList<>();
}
