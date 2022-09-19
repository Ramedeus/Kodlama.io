package diziler;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		String ogrenciler[] = new String[4];
		ogrenciler[0]="A";
		ogrenciler[1]="B";
		ogrenciler[2]="C";
		ogrenciler[3]="D";
		
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("==========================");
		
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
			
		
	}

}
