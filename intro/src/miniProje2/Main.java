package miniProje2;

public class Main {

	public static void main(String[] args) {

		char harf = 'I';

		switch (harf) {
		case 'A':
			System.out.println(harf + " kalın sesli bir harftir.");
			break;
		case 'I':
			System.out.println(harf + " kalın sesli bir harftir.");
			break;
		case 'O':
			System.out.println(harf + " kalın sesli bir harftir.");
			break;
		case 'U':
			System.out.println(harf + " kalın sesli bir harftir.");
			break;
		case 'E':
			System.out.println(harf + " ince sesli bir harftir.");
			break;
		case 'İ':
			System.out.println(harf + " ince sesli bir harftir.");
			break;
		case 'Ö':
			System.out.println(harf + " ince sesli bir harftir.");
			break;
		case 'Ü':
			System.out.println(harf + " ince sesli bir harftir.");
			break;
			
		default :
			System.out.println(harf + " kalın veya ince harf kapsamına girmemektedir !");
			break;
		}

	}

}
