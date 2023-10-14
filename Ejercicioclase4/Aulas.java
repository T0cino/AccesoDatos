package instituto;

import java.util.ArrayList;
import java.util.Arrays;

public class Aulas {
	private String nombreAula;
    private int numAlumnos;
    private String[] materias;
    private String[] alumnos;
    private String[] profesores;

    public Aulas(String nombreAula, int numAlumnos, ArrayList<Profesor> profesAsignadosParam,
            ArrayList<Alumnos> alumnosAsignadosParam) throws Exception {
        this.nombreAula = nombreAula;
        this.numAlumnos = numAlumnos;
        profesores=new String[profesAsignadosParam.size()];
        alumnos=new String[alumnosAsignadosParam.size()];
        materias=new String[profesAsignadosParam.size()];

        if (numAlumnos > ConstantesJairo.MAX_ESTUDIANTES) {
            throw new Exception("Alcanzado máximo de estudiantes." + numAlumnos + "/30");
        } else if (numAlumnos < 0) {
            throw new Exception("No se pueden añadir alumnos negativos.");
        }

        if (!Arrays.asList(ConstantesJairo.LISTA_CLASES).contains(nombreAula)) {
            throw new Exception("Aula " + nombreAula + " no disponible.");
        }

        Profesor[] profes= new Profesor[profesAsignadosParam.size()];
        profesAsignadosParam.toArray(profes);

        for (int i = 0; i < profes.length; i++) {
            profesores[i]=profes[i].getNombre();
        }

        for(int i = 0;i<profes.length;i++){
            materias[i] = profes[i].getMateria();
        }

        Alumnos[] alumS= new Alumnos[alumnosAsignadosParam.size()];
        alumnosAsignadosParam.toArray(alumS);

        for (int i = 0; i < alumS.length; i++) {
            alumnos[i]=alumS[i].getNombre();
        }

        

    }

    public String getNombreAula() {
        return nombreAula;
    }

    public void setNombreAula(String nombreAula) {
        this.nombreAula = nombreAula;
    }

    public int getNumAlumnos() {
        return numAlumnos;
    }

    public void setNumAlumnos(int numAlumnos) {
        this.numAlumnos = numAlumnos;
    }

    @Override
    public String toString() {
        return "Aulas [nombreAula=" + nombreAula + ", numAlumnos=" + numAlumnos + ", materias="
                + Arrays.toString(materias) + ", alumnos=" + Arrays.toString(alumnos) + ", profesores="
                + Arrays.toString(profesores) + "]";
    }

}
