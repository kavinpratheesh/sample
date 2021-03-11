public class Kav {

	public static void main(String[] args) {
		String results="About 650,000 Results";
		String count[]=results.split(" ");
		System.out.println(count[1]);
		String ne=count[1].replaceAll(",", "");
		System.out.println(ne);
		int newa=Integer.parseInt(count[1].replaceAll(",", ""));
		System.out.println(newa);

	}

}