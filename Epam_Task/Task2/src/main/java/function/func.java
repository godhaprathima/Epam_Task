package function;
import sweet.*;
import work.*;

public class func {
	private static final int St= 20;
	private static final int END = 30;

	// Creating objects
	private static final badhusha badhusha1 = new badhusha("badhusha1", 10, 10);
	private static final kaja kaja1 = new kaja("kaja1", 15, 15);
	private static final kalakand kalakand1 = new kalakand("kalakand1", 25, 20);
	private static final badhusha badhusha2 = new badhusha("badhusha2", 10, 50);
	private static final badhusha badhusha3 = new badhusha("badhusha3", 20, 50);
	private static final kaja kaja2 = new kaja("kaja2", 20, 15);
	private static final kalakand kalakand2 = new kalakand("kalakand2", 30, 20);
	private static final kalakand kalakand3 = new kalakand("kalakand3", 30, 20);
	private static final kalakand kalakand4 = new kalakand("kalakand4", 30, 20);
	private static final kaja kaja3 = new kaja("kaja3", 20, 15);

	// Creating container
	private static final  work GIFT = new work();

	public static work getGift() {
		return GIFT;
	}



	public static void createGift() {
		getGift().add(badhusha1, 5);
		getGift().add(kaja1, 10);
		getGift().add(kalakand1, 8);
		getGift().add(badhusha2, 11);
		getGift().add(badhusha3, 21);
		getGift().add(kaja2, 13);
		getGift().add(kalakand2, 8);
		getGift().add(kalakand3, 9);
		getGift().add(kalakand4, 12);
		getGift().add(kaja3, 13);
		getGift().add(badhusha1, 24);
		getGift().add(kaja1, 11);
		getGift().add(kaja3,2);
		getGift().add(kalakand2, 13);
		getGift().add(badhusha2, 11);
	}
    public static void main( String[] args )
    {
    	createGift();
		System.out.println(" All objects from the gift:");
		getGift().getAllCandy();
		System.out.println();
		System.out.println("Sorting  by 'SUGARLEVEL':");
		getGift().sortBySugarValue(getGift().getList());
		getGift().getAllCandy();
		System.out.println();
		System.out.println("Total 'Weight' of the gift: ");
		System.out.println(getGift().calculateTotalWeight() + " grm");
		System.out.println();
		System.out
				.println("Getting all objects with selected range of sugar value(from "
						+ St + "% to " + END + "%) :");
		for (allsweets sweet : getGift().receiveBySugarValue(St, END)) {
			System.out.print(sweet.printAllValues());
		}
    }

}
