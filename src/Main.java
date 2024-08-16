import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        MenuItem menuItem1 = new MenuItem("Шорпо", 170);
        MenuItem menuItem2 = new MenuItem("Солянка", 130);
        MenuItem menuItem3 = new MenuItem("Суп какойто", 70);
        MenuItem menuItem4 = new MenuItem("Чай", 30);
        MenuItem menuItem5 = new MenuItem("хлеб", 20);
        MenuItem menuItem6 = new MenuItem("Кофе", 110);
        MenuItem menuItem7 = new MenuItem("Сок", 30);
        MenuItem [] menuItems = {menuItem1, menuItem2, menuItem3,menuItem4,menuItem5,menuItem6,menuItem6, menuItem7};
        Restaurant restaurant = new Restaurant();
        for (MenuItem item : menuItems) {
            restaurant.addMenu(item);
        }




        List <MenuItem>menuItems1 = new ArrayList<>();
        menuItems1.add(menuItem5);
        menuItems1.add(menuItem4);
        menuItems1.add(menuItem1);

        Order order1 = new Order( 1, "Чынгыз", menuItems1);
        order1.calculateTotal(menuItems1);

        List <MenuItem>menuItems2 = new ArrayList<>();
        menuItems2.add(menuItem2);
        menuItems2.add(menuItem5);
        menuItems2.add(menuItem1);

        Order order2 = new Order(2, "Кутман", menuItems2);

        order2.calculateTotal(menuItems2);

        List <MenuItem>menuItems3 = new ArrayList<>();
        menuItems3.add(menuItem1);
        menuItems3.add(menuItem3);
        menuItems3.add(menuItem2);

        Order order3 = new Order( 3,"Муха", menuItems3);

        order3.calculateTotal(menuItems3);

        restaurant.placeOrder(order1);
        restaurant.placeOrder(order2);
        restaurant.placeOrder(order3);

        restaurant.infoOrder();
        System.out.println(restaurant.getOrderById(3));
        restaurant.completeOrder(3);
        System.out.println(restaurant.getOrderById(3));



    }
}