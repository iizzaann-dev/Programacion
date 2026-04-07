package botanico;

import java.util.Comparator;

public class ComparadorEspeciePlantaPorLongitud implements Comparator<String> {

    @Override
    public int compare (String var1, String var2){
        return Integer.compare(var1.length(), (var2.length()));
    }
}
