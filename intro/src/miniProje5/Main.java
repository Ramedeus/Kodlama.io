package miniProje5;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 10;
		boolean varMi = false;

		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] == aranacak) {
				varMi = true;
				break;
			}
		}

		if (varMi) {
			System.out.println(aranacak + " sayısı dizi içerisinde yer almaktadır.");
		} else {
			System.out.println(aranacak + " sayısı dizi içerisinde yoktur.");
		}

	}

}
