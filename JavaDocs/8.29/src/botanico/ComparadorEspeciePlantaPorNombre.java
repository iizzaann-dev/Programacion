package botanico;

import java.util.Comparator;

public class ComparadorEspeciePlantaPorNombre implements Comparator<String> {

    @Override
    public int compare  (String var1, String var2){
        return var1.compareTo(var2);
    }
}
