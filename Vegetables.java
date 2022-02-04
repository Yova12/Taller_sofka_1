import java.util.ArrayList;
/**
 * Creacio de verduras.
 * @author Yovanny Arley Valderrama Figueroa.
 */
public class Vegetables {
/**
 * Atributos de la clase Vegetables.
 */
    public String vegetableName;
    private float averageWeight;
    public ArrayList<String> color;
    private int cost;
    
/**
* get and set; Me permite acceder a los atributos de esta clase
* desde otra clase en el mismo paquete.
* @return get, recupera el valor de un atributo seleccionado 
*/ 
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }

    

}
