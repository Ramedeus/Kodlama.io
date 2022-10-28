package interfaceDemo;

public class Worker implements IWorkable , IEatable, IPayable{

	@Override
	public void work() {
		System.out.println("Çalışılıyor");	
	}

	@Override
	public void eat() {
		System.out.println("Yemek arası");

	}

	@Override
	public void pay() {
		System.out.println("Ücret ödendi");

	}
	

}
