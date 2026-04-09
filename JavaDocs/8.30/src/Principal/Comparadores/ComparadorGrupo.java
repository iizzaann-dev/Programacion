package Principal.Comparadores;

import Principal.operArrayList.Alumnos;
import java.util.Comparator;

public class ComparadorGrupo implements Comparator<Alumnos> {

    @Override
    public int compare (Alumnos var1, Alumnos var2){

        int resultado = var1.getGrupo().compareTo(var2.getGrupo());

        if (var1.getGrupo().equals(var2.getGrupo())){
            return var1.getApellido().compareTo(var2.getApellido());

        }else{
            return resultado;
        }
    }


}
