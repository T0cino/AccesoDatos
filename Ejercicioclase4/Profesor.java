
public class Profesor extends Persona{
	 private String materia;
	    
	    public Profesor(String nombre, int edad, String aula,String materia) throws Exception {
	        super(nombre, edad, aula);
	        this.materia = materia;  
	        
	    }
	    
	    public String getMateria() {
	        return materia;
	    }

	    public void setMateria(String materia) {
	        this.materia = materia;
	    }

	    @Override
	    public String toString() {
	        return super.toString()+", materia=" + materia + "]";
	    }


}
