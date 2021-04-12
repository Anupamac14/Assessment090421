import java.util.function.Consumer;

public class ConsumerExmp {

	public static void main(String[] args) {
		Consumer<String>ConsumerObject=(Company)-> System.out.println(Company);
		Consumer<Integer>ConsumerObj=(number)->System.out.println(number*6);
		ConsumerObj.accept(6);
		ConsumerObject.accept("Vee Technologies");
	}
}
