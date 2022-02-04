/**
 * Se encarga de crear targetas de credito.
 * @author Yovanny Arley Valderrama Figueroa.
 */
public class CreditCard {
/**
 * Atributos de la clase
 */
    private String bankingInstitution;
    private int accountNumber;
    private float balance;
    protected boolean activated;
    private String owner;
/**
* get and set; Me permite acceder a los atributos de esta clase
* desde otra clase en el mismo paquete.
* @return Retorna el valor del atributo seleccionado 
*/ 
    public float getBalance() {
        return balance;
    }
    public void setBalance(float balance) {
        this.balance = balance;
    }
    public boolean isActivated() {
        return activated;
    }
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    
    
}
