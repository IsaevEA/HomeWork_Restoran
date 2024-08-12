import java.util.ArrayList;
import java.util.List;

public class Order {
    private  int orderId;
    private String customerName;
    private List<MenuItem> items;
    private boolean isCompleted;

    public Order() {
    }

    public Order( int orderId, String customerName, List<MenuItem> items) {

        this.customerName = customerName;
        this.items = items;
        this.orderId = orderId;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public double calculateTotal(List<MenuItem> items){
        double sum = 0;
        for (MenuItem m: items) {
            sum += m.getPrice();
        }
        return sum;
    }

    public void completeOrder(){
        isCompleted = false;
    }

    @Override
    public String toString() {

        return "Order{" +
                "orderId=" + orderId +
                ", customerName='" + customerName + '\'' +
                ", items=" + items +
                ", isCompleted=" + isCompleted +
                '}';
    }
}
