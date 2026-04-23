package Principal.operArrayList;

import java.io.*;


    public class Alumnos {

        private FileInputStream file;
        private ObjectInputStream input;
        public String grupo;
        public String nombre;
        public String apellido;
        public int matematicas;
        public int lengua;
        public int fisica;
        public int quimica;
        public int ingles;

        public Alumnos (String grupo, String nombre, String apellido, int matematicas, int lengua, int fisica, int quimica, int ingles){

                this.grupo = grupo;
                this.nombre = nombre;
                this.apellido = apellido;
                this.matematicas = matematicas;
                this.lengua = lengua;
                this.fisica = fisica;
                this.quimica = quimica;
                this.ingles = ingles;
        }

        public String getApellido() {
            return apellido;
        }

        public String getGrupo() {
            return grupo;
        }

        public String getNombre(){
            return nombre;
        }

        public int getNotaMatematicas (){
            return matematicas;
        }

        public int getLengua() {
            return lengua;
        }

        public int getFisica() {
            return fisica;
        }

        public int getQuimica() {
            return quimica;
        }

        public int getIngles() {
            return ingles;
        }

        @Override
        public String toString() {
            return  "Grupo = " + grupo + ", Apellido = " + apellido + ", Nombre = " + nombre + ", Matematicas = " + matematicas + ", Lengua = " + lengua +
                    ", Fisica = " + fisica + ", Química = " + quimica + ", Inglés = " + ingles + ".";


        }

        public void abrir() throws IOException{
            file = new FileInputStream("");
            input = new ObjectInputStream(file);
        }

        public void cerrar() throws IOException{
            if(input == null){
                input.close();
            }
        }

        public Alumnos leer () throws IOException, ClassNotFoundException{
            Alumnos alumno = null;
            if(input == null){
                try{
                    alumno = (Alumnos) input.readObject();

                }catch (EOFException eof){

                }
            }

            return alumno;
        }

    }
