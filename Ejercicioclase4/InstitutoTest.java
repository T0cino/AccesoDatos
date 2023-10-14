package instituto;

import java.util.ArrayList;

public class InstitutoTest {
    public static void main(String[] args) throws Exception {
    
        Profesor profeJuan = new Profesor("Juan", 30, "2.6", "Base de datos");
        Profesor profeMiguel = new Profesor("Miguel", 31, "2.7", "Ofimatica");
        
        ArrayList<Profesor> listaProfesores = new ArrayList<Profesor>();
        listaProfesores.add(profeJuan);
        listaProfesores.add(profeMiguel);
        
        Alumnos alumnoPepe = new Alumnos("Pepe", 5, 18, "2.6");
        Alumnos alumnoFernando = new Alumnos("Fernando", 7, 19, "2.6");
        
        ArrayList<Alumnos> listaAlumnosDosSeis = new ArrayList<>();
        listaAlumnosDosSeis.add(alumnoFernando);
        listaAlumnosDosSeis.add(alumnoPepe);

        Aulas aulaDosSeis = new Aulas("2.6", 30,listaProfesores,listaAlumnosDosSeis);

        System.out.println(aulaDosSeis);
        
    }
}