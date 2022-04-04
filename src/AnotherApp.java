import java.util.ArrayList;
import java.util.List;

interface Lambda {
	abstract public void demo();
}

public class AnotherApp {

	public static void main(String[] args) {

		int x = 33;

		Lambda lambda = new Lambda() {

			@Override
			public void demo() {
				int y = 355;
				System.out.println("hi" + " " + x);

			}

		};
		// System.out.println(y); scope!
		lambda.demo();

		Lambda lambda2 = () -> System.out.println("hi");

		lambda2.demo();

		List<Integer> list = new ArrayList<Integer>();

		list.add(3);
		list.add(5);

		list.forEach((i) -> {
			System.out.println("hey");
			System.out.println(i);
		});
		
		/*=====*/
		
		System.out.println();
		
		
		List<String> list2 = new ArrayList<String>();

		list2.add("j");
		list2.add("d");

		list2.forEach((temp)-> {
			 System.out.println(temp);
		});
		
		
		
		
		
		
		

	}

}
