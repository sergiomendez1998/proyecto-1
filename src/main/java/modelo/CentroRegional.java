package modelo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CentroRegional {
    private int id;
    private String nombre;
    private String direccion;
    private List<Carrera> carreras;
}
