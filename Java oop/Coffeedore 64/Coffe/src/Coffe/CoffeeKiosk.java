package Coffe;

import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeKiosk {
	private ArrayList<Item> menu;
	private ArrayList<Order> orders;

	public CoffeeKiosk() {
		this.menu = new ArrayList<>();
		this.orders = new ArrayList<>();
	}

	public void addMenuItem(String name, double price) {
		Item item = new Item(name, price, 0);
		item.setIndex(menu.size());
		menu.add(item);
	}

	public void displayMenu() {
		for (Item item : menu) {
			System.out.println(item.getIndex() + " " + item.getName() + "$" + item.getPrice());
		}
	}

	public void newOrder() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter customer name for new order:");
		String name = scanner.nextLine();
		Order order = new Order(name);

		displayMenu();

		System.out.println("Please enter a menu item index or q to quit:");
		String input = scanner.nextLine();
		while (!input.equals("q")) {
			int itemIndex = Integer.parseInt(input);
			if (itemIndex >= 0 && itemIndex < menu.size()) {
				Item item = menu.get(itemIndex);
				order.addItem(item);
			} else {
				System.out.println("index out can try more");
			}

			System.out.println("Please enter  q to quit:");
			input = scanner.nextLine();
		}
		

		System.out.println("thank you, " + name + " Here are your order details:");
		System.out.println("Customer Name :"+name);

		System.out.println(order.toString());
		System.out.println("thanks");
		
	}

}