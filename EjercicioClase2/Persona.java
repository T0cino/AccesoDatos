public class Persona {
    String nombre;
    int edad;
    String dni;
    char sexo;
    double peso;
    double altura;
    public static final char HOMBRE = 'H';
    public static final char MUJER = 'M';

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.sexo = HOMBRE;
        this.peso = 0.0;
        this.altura = 0.0;
        this.dni = generarDNI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this();
        this.nombre = nombre;
        this.edad = edad;
        if (validaSexo(sexo)) {
            this.sexo = sexo;
        } else {
            throw new IllegalArgumentException("El sexo debe ser 'H' (hombre) o 'M' (mujer)");
        }
    }

    public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
        this(nombre, edad, sexo);
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC() {
        double imc = peso / (altura * altura);
        if (imc < 16) {
            return -1;
        } else if (imc >= 16 && imc < 17) {
            return 0;
        } else {
            return 1;
        }
    }

    private boolean validaSexo(char sexo) {
        return sexo == HOMBRE || sexo == MUJER;
    }

    private String generarDNI() {
        int numeroDNI = (int) (Math.random() * 100000000); // Número aleatorio de 8 cifras
        int indice = numeroDNI % 23;
        char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return Integer.toString(numeroDNI) + letrasDNI[indice];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if (validaSexo(sexo)) {
            this.sexo = sexo;
        } else {
            throw new IllegalArgumentException("El sexo debe ser 'H' (hombre) o 'M' (mujer)");
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public static char getHombre() {
        return HOMBRE;
    }

    public static char getMujer() {
        return MUJER;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nDNI: " + dni + "\nSexo: " + sexo + "\nPeso: " + peso + "\nAltura: " + altura;
    }
}
