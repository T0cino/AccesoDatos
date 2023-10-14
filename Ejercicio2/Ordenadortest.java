
public class Ordenadortest {
    public static void main(String[] args) {
        Ordenador ordenador1 = new Ordenador(1001, 8, "Intel Core i5", 699.99);
        Portatil portatil1 = new Portatil(2001, 16, "Intel Core i7", 1299.99, 2.5);
        Sobremesa sobremesa1 = new Sobremesa(3001, 12, "AMD Ryzen 5", 899.99, "Mini Torre");

        System.out.println(ordenador1);
        System.out.println(portatil1);
        System.out.println(sobremesa1);

        // Operaciones con los objetos
        System.out.println("Características de ordenador1: " + ordenador1.getCaracteristicas());
        System.out.println("Características de portatil1: " + portatil1.getCaracteristicas());
        System.out.println("Características de sobremesa1: " + sobremesa1.getCaracteristicas());
    }
}
