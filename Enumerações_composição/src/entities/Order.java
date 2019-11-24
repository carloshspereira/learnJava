package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus status;
	private Client client;
	private List<OrderItem> itens = new ArrayList<>();

	public Order() {

	}

	public Order(Date moment, OrderStatus status, Client client) {
		super();
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public void addItem(OrderItem item) {
		itens.add(item);
	}

	public void removeItem(OrderItem item) {
		itens.remove(item);
	}

	public Double total() {
		Double total = 0.0;
		for (OrderItem orderItem : itens) {
			total += orderItem.subTotal();

		}
		return total;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
		StringBuilder orderDetail = new StringBuilder();

		orderDetail.append("ORDER SUMMARY:\n");
		orderDetail.append("Order moment: ");
		orderDetail.append(sdf.format(moment)+"\n");
		orderDetail.append("Order status: " + status+"\n");
		orderDetail.append("Client: " + client+"\n");
		orderDetail.append("Order items:\n");
		for (OrderItem orderItem : itens) {
			orderDetail.append(orderItem+"\n");
		}
		orderDetail.append("Total price: $ " + String.format("%.2f", total()));
		return orderDetail.toString();
	}

}
