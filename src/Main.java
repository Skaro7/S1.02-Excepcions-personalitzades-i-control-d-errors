import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- Prova EmptySaleException ---");
        Sale sale = new Sale();

        try {
            sale.calculateTotal();
        } catch (EmptySaleException e) {
            System.out.println("Excepció capturada: " + e.getMessage());
        }

        System.out.println("\n--- Afegim productes i calculem el total ---");
        sale.addProduct(new Product("Portàtil", 900.0));
        sale.addProduct(new Product("Ratolí", 25.0));

        try {
            sale.calculateTotal();
            System.out.println("Total venda: " + sale.getTotalPrice());
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n--- Prova IndexOutOfBoundsException ---");
        List<String> list = new ArrayList<>();

        try {
            list.get(0);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException capturada: " + e.getMessage());
        }
    }
}
