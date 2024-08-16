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
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getOrderId() == orderId){
                return orders.get(i);
            }
        }
        throw  new NoSuchElementException("Заказ с ID " + orderId + " не найден, класс Restaurant, метод getOrderById");

    }

    public void completeOrder(int orderId) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getOrderId() == orderId) {
                orders.get(i).setCompleted(true);
                return;
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
