/*64. TASK 5 - PRODUCT INVENTORY
Required filename: ProductInventory.java
Create a Product class and a public ProductInventory driver.
Product requirements:
- code, name, unit price, quantity, and a static product counter
- overloaded constructors for zero quantity and supplied quantity
- positive price and non-negative quantity invariants
- restock(int amount)
- sell(int amount), rejecting unavailable quantities
- getInventoryValue()
- static getProductCount()
- toString()
Create several products and demonstrate independent quantities and one shared
static count.
*/
public class Product
{
    private String code;
    private String name;
    private double unit_price;
    private int quantity;
    private static int productCount= 0;
    public Product(String code, String name, double unit_price)
    {
            this.code = code;
        this.name =name;
        if (unit_price >0)
            {
                this.unit_price = unit_price;
            }
            else
                {
                    this.unit_price = 1;
        }
        quantity =0;
        productCount++ ;
    }

    public Product(String code,String name,double unitPrice, int quantity)
    {
        this.code = code;
        this.name = name;
        if(unit_price > 0)
            {
                this.unit_price = unit_price;
            }
            else {
            this.unit_price = 1;
        }
        if (quantity>= 0)
            {
                this.quantity = quantity;
            }
            else{
                this.quantity = 0;
        }

        productCount++;
    }

    public void restock(int amount)
    {
        if (amount> 0) {
            quantity =quantity +amount;
        }
    }
    public boolean sell(int amount){
        if (amount >0 && amount <=quantity) {
            quantity= quantity -amount;
            return true;
        }
        return false;
    }
    public String getCode()
    {
        return code;
    }
    public String getName() {
        return name;
    }
    public double getUnitPrice()
    {
        return unit_price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getInventoryValue() {
        return unit_price * quantity;
    }
    public static int getProductCount() {
        return productCount;
    }
    public String toString() {
        return "product=" + name+",code=" + code+ ", picee=" + unit_price+", quantity=" + quantity+ ", value=" + getInventoryValue();
    }
}