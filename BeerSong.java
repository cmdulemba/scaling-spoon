public class BeerBottle {

	public static void main(String [] args) {
		BeerBottle.Ninety_Nine_Bottles_of_Beer(); //calling the function

	}


	static void Ninety_Nine_Bottles_of_Beer() {
		String s = "s";
		for (int beers=99; beers>-1; beers--)
		{
			System.out.print(beers + " bottle" + s + " of beer on the wall, ");
			System.out.println(beers + " bottle" + s + " of beer, ");
	
			System.out.print("Take one down, pass it around, ");
			s = (--beers ==1)?"":"s";
			System.out.println(beers + " bottle" + s + " of beer on the wall.\n");
		}
		/**

		*/
	}

}
