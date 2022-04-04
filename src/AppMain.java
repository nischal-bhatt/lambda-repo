import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Data {
	private String name;

	public Data(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class AppMain {

	// interface where there is only 1 method declaration
	interface Lambda {
		public void demo();
	}

	public static void main(String[] args) {

		Lambda lambda = () -> System.out.println("hi");

		Lambda lambda2 = () -> {
			System.out.println("hey");
			System.out.println("hihiih");
		};
		lambda.demo();
		lambda2.demo();

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("runnable is a functional interface");

			}

		});

		new Thread(() -> System.out.println("hey")).start();

		thread1.start();
		System.out.println("*********************");

		List<Data> list = new ArrayList<>();
		list.add(new Data("hi"));
		list.add(new Data("ed"));
		list.add(new Data("ko"));
		list.add(new Data("mi"));
		/*
		 * Collections.sort(list, new Comparator<Data>() {
		 * 
		 * @Override public int compare(Data o1, Data o2) { return
		 * o1.getName().compareTo(o2.getName()); }
		 * 
		 * });
		 */

		Collections.sort(list, (Data o1, Data o2) -> {
			return o1.getName().compareTo(o2.getName());
		});

		for (Data data : list) {
			System.out.println(data.getName());
		}

	}

}
