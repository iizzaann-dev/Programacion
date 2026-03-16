package Mobiliario;

public interface Ajustable {
	
    public final int MIN_POSICION = 1;
    public final int MAX_POSICION = 4;

    int obtenerPosicion();
    void subirPosicion(int nuevaPosicion);
    void bajarPosicion(int nuevaPosicion);
	
}
