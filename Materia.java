import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
@Getter
@Setter
public class Materia {
    public String nombre;
    public ArrayList<Materia> materiasCorrelativas;
}
