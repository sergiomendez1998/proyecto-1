package modelo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Curso {
    private int id;
    private String nombre;
    int horas;
    private Sementre sementre;
    private Profesor profesor;
}
