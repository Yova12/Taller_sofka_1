import java.sql.Date;
import java.util.ArrayList;
/**
 * Generador de tikets de ventas.
 * @author Yovanny Arley Valderrama Figueroa.
 */
public class Tickets {
/**
 * Atributos de la clase Ticket.
 */
    private Date dateTicket;
    private String companyName;
    private ArrayList<String> products;
    private float totalCost;
    
/**
* get and set; Me permite acceder a los atributos de esta clase
* desde otra clase en el mismo paquete.
* @return Retorna el valor del atributo seleccionado
*/ 
    public ArrayList<String> getProducts() {
        return products;
    }
    public void setProducts(ArrayList<String> products) {
        this.products = products;
    }
    public float getTotalCost() {
        return totalCost;
    }
    public void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
    }


}
