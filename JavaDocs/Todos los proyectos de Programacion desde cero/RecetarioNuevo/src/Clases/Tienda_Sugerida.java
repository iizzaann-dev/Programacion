package Clases;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Versión sugerida de `Tienda` con las correcciones explicadas en comentarios.
 *
 * NOTA: Este fichero es solo una sugerencia; no modifica tu `Tienda.java` original.
 */
public class Tienda_Sugerida {

    // ... mismas estructuras que en tu clase original
    private ArrayList<VideoJuegoFisico> catalogoFisico;
    private ArrayList<VideoJuegoDigital> catalogoDigital;
    private String nombreTienda;

    public Tienda_Sugerida(String nombreTienda) {
        this.catalogoFisico = new ArrayList<>();
        this.catalogoDigital = new ArrayList<>();
        this.nombreTienda = nombreTienda;
    }

    /**
     * CORRECCIÓN sugerida: usar el parámetro `rutaFichero` en lugar de una ruta fija.
     * Esto permite llamar cargarCatalogo("./Videojuegos.txt") o pasar otra ruta.
     */
    public void cargarCatalogo(String rutaFichero) throws FileNotFoundException {
        File archivo = new File(rutaFichero); // <-- aquí usamos el parámetro

        Scanner teclado = new Scanner(archivo);

        while (teclado.hasNextLine()) {
            String linea = teclado.nextLine();
            convertidorJuegos(linea);
        }

        teclado.close();
    }

    public void motrarTodosLosProductos() {
        for (VideoJuegoFisico i : catalogoFisico) {
            i.mostrarInfo();
        }

        for (VideoJuegoDigital i : catalogoDigital) {
            i.mostrarInfo();
        }
    }

    public ArrayList<Productos> buscarPorGenero(String genero) {
        ArrayList<Productos> listaCompleta = new ArrayList<>();

        for (VideoJuegoFisico i : catalogoFisico) {
            if (i.getGenero().equalsIgnoreCase(genero)) {
                listaCompleta.add(i);
            }
        }

        for (VideoJuegoDigital i : catalogoDigital) {
            if (i.getGenero().equalsIgnoreCase(genero)) {
                listaCompleta.add(i);
            }
        }

        return listaCompleta;
    }

    /**
     * CORRECCIÓN sugerida para calcular la media de precios.
     * Problema original: se intentaba usar catalogoFisico.get(i.getPrecio())
     * donde `get` espera un índice (int) y se le estaba pasando un double.
     *
     * Aquí sumamos precios de ambos catálogos usando v.getPrecio() y
     * devolvemos la media; si no hay productos devolvemos 0.0.
     */
    public double calcularPrecioMedio() {
        double suma = 0.0;
        int contador = 0;

        for (VideoJuegoFisico v : catalogoFisico) {
            suma += v.getPrecio(); // llamar correctamente al getter
            contador++;
        }

        for (VideoJuegoDigital v : catalogoDigital) {
            suma += v.getPrecio();
            contador++;
        }

        if (contador == 0) {
            return 0.0;
        }

        return suma / contador;
    }

    /**
     * convertidorJuegos: igual que tu implementación, pero con comentarios
     * que aclaran el formato esperado por línea en el fichero.
     * Formato esperado por línea (ejemplo):
     * FISICO;Nombre;Genero;19.99;2020;5;PS5
     * DIGITAL;Nombre;Genero;9.99;2021;1500;true
     */
    private void convertidorJuegos(String linea) {
        String[] partes = linea.split(";");

        if (linea.contains("FISICO")) {
            // tipo, nombre, genero, precio, año, stock, plataforma
            VideoJuegoFisico juego = new VideoJuegoFisico(partes[1], partes[2], Double.parseDouble(partes[3]),
                    Integer.parseInt(partes[4]), Integer.parseInt(partes[5]), partes[6]);
            catalogoFisico.add(juego);
        }

        if (linea.contains("DIGITAL")) {
            // tipo, nombre, genero, precio, año, tamaño, requiereInternet
            VideoJuegoDigital juego = new VideoJuegoDigital(partes[1], partes[2], Double.parseDouble(partes[3]),
                    Integer.parseInt(partes[4]), Integer.parseInt(partes[5]), Boolean.parseBoolean(partes[6]));
            catalogoDigital.add(juego);
        }
    }

    // Métodos auxiliares útiles para pruebas manuales (no están en tu original,
    // los añado como sugerencia; puedes borrarlos si no los quieres):
    public void anadirVideoJuegoFisico(VideoJuegoFisico v) {
        catalogoFisico.add(v);
    }

    public void anadirVideoJuegoDigital(VideoJuegoDigital v) {
        catalogoDigital.add(v);
    }

}
