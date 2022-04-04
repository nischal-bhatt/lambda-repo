import java.util.function.IntPredicate;

//predicate
public class MainMainMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//IntPredicate lessThan18;

		/*
		lessThan18 = new IntPredicate() {

			@Override
			public boolean test(int value) {
				if (value < 18) {
					return true;
				} else {
					return false;
				}
			}

		};
        */
		
		
		
		
		//System.out.println(lessThan18.test(4));
		
		
		
		
		
		
		
		IntPredicate lessThan18 = i-> i<18;
		IntPredicate moreThan18 = i-> i>10;
		
		System.out.println(lessThan18.test(3));
		System.out.println(lessThan18.test(18));
		System.out.println(lessThan18.and(moreThan18).test(13));
		
		
		System.out.println("-----");
		
		new MainMainMain().demo(4, lessThan18, moreThan18);
		new MainMainMain().demo(13, lessThan18, moreThan18);
		new MainMainMain().demo(15, lessThan18, moreThan18);
		
		
		
		
		
	}
	
	public void demo(int x, IntPredicate lessThan18, IntPredicate moreThan10)
	{
		
		if (lessThan18.and(moreThan10).test(x))
		{
			System.out.println("case 1");
		}else
		{
			System.out.println("case 2");
		}
		
	}

}
