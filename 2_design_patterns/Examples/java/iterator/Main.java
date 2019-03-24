package iterator;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList allmenus = new ArrayList<>();
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinnerMenu dinnerMenu = new DinnerMenu();
		CafeMenu cafeMenu = new CafeMenu();
		allmenus.add(pancakeHouseMenu);
		allmenus.add(dinnerMenu);
		allmenus.add(cafeMenu);
		
		Waitress waitress = new Waitress(allmenus);
		waitress.printMenu();

	}

}
