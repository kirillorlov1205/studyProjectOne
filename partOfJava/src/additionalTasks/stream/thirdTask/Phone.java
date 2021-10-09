package additionalTasks.stream.thirdTask;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Phone {
	private String name;
	private Price price;


	public Phone(String name, int price) {
		this.name = name;
		this.price = new Price(price);
	}

	public static List getAllPrice(ArrayList<Phone> phoneArrayList) {
		List<String> priceList = phoneArrayList.stream()
				.sorted((p1, p2) -> p1.getName().length() - p2.getName().length())
				.map(p -> {
					return "Price (" + p.getPrice().getValue() + ")";
				})
				.collect(Collectors.toList());
		return priceList;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Phone{" +
				"name='" + name + '\'' +
				", price=" + price +
				'}';
	}
}
