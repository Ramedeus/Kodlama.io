package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		String ortaMetin="İlginizi çekebilir";
		String altMetin="Vade süresi";
		
		System.out.println(ortaMetin);
		System.out.println(altMetin);
		
		int vade=12;
		
		double dolarDun=18.14;
		
		double dolarBugun=18.10;
		
		boolean dolarDustuMu = false;
		
		String okYonu;
		
		if (dolarDun<dolarBugun) {
			okYonu="up.svg";
			System.out.println(okYonu);
		} else if (dolarDun==dolarBugun){
			okYonu="equal.svg";
			System.out.println(okYonu);
		} else {
			okYonu="down.svg";
			System.out.println(okYonu);
		}

		
		String[] krediler = {"Hızlı Kredi","Maaşını Halkbantan","Mutlu emekli"};
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
	}

}
