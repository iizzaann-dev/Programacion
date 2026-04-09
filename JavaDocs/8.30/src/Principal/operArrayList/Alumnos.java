    package Principal.operArrayList;

    public class Alumnos {

        String grupo;
        String nombre;
        String apellido;
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

        @Override
        public String toString() {
            return  "Grupo = " + grupo + ", Apellido = " + apellido + ", Nombre = " + nombre + ", Matematicas = " + matematicas + ", Lengua = " + lengua +
                    ", Fisica = " + fisica + ", Química = " + quimica + ", Inglés = " + ingles + ".";


        }
    }
