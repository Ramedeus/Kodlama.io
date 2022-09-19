package cokBoyutluDiziler;

public class Main {

	public static void main(String[] args) {
		String[][] sehirler = new String[3][3];

		sehirler[0][0] = "A";
		sehirler[0][1] = "B";
		sehirler[0][2] = "C";
		sehirler[1][0] = "D";
		sehirler[1][1] = "E";
		sehirler[1][2] = "F";
		sehirler[2][0] = "G";
		sehirler[2][1] = "K";
		sehirler[2][2] = "J";

		for (int i = 0; i <= 2; i++) {

			System.out.println("==========");

			for (int j = 0; j <= 2; j++) {
				System.out.println(sehirler[i][j]);
			}
		}

	}

}
