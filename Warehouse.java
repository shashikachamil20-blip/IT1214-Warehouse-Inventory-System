import java.util.Scanner;

public class Warehouse {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\nWarehouse Inventory System");
            System.out.println("1 Add Item");
            System.out.println("2 Remove Item");
            System.out.println("3 Update Quantity");
            System.out.println("4 Search by ID");
            System.out.println("5 Search by Name");
            System.out.println("6 Display Items");
            System.out.println("7 Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    String id = sc.next();

                    System.out.print("Enter Name: ");
                    String name = sc.next();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    Item item = new Item(id,name,qty,price);
                    inventory.addItem(item);
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    inventory.removeItem(sc.next());
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    String uid = sc.next();

                    System.out.print("Enter new quantity: ");
                    int newQty = sc.nextInt();

                    inventory.updateQuantity(uid,newQty);
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    inventory.searchById(sc.next());
                    break;

                case 5:
                    System.out.print("Enter Name: ");
                    inventory.searchByName(sc.next());
                    break;

                case 6:
                    inventory.displayItems();
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");

            }

        } while(choice != 7);

    }
}