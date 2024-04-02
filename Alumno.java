import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
@Setter
@Getter
public class Alumno {
    public String nombre;
    public Integer legajo;
    public ArrayList<Materia> materiasAprobadas;

    public boolean correlativasAprobadas(Materia materia) {
        if(!materia.materiasCorrelativas.isEmpty()){
        for (Materia correlativa : materia.materiasCorrelativas){
            if(this.materiasAprobadas.contains(correlativa)){
            }else{
            return false;}
        }}
        return true;
    }
}

