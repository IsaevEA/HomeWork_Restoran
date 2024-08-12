import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Restaurant {
    private List<Order> orders = new ArrayList<>();
    private List<MenuItem> menu = new ArrayList<>();

    public List<MenuItem> getMenu() {
        return menu;
    }

    public void addMenu(MenuItem menuItem){
        menu.add(menuItem);
    }


    public void placeOrder(Order order){
        orders.add(order);
    }
    public Order getOrderById(int orderId){
        for (Order o:orders) {
            if (o.getOrderId() == orderId){
                return o;
            }
        }
        throw  new NoSuchElementException("Заказ с ID " + orderId + " не найден, класс Restaurant, метод getOrderById");

    }

    public void completeOrder(int orderId) throws Exception{
        for (Order o : orders) {
            if (o.getOrderId() == orderId) {
                o.setCompleted(true);
            }
        }
        throw new NoSuchElementException("Заказ с ID " + orderId + " не найден, класс Restaurant, метод completeOrder");

    }


    public void infoOrder(){
        for (Order o:orders) {
            System.out.println(o);
        }
    }
}
