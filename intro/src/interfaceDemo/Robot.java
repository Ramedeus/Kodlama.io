package interfaceDemo;

public class Robot implements IWorkable, IMaintenance{

	@Override
	public void work() {
		System.out.println("Çalışılıyor");
	}

	@Override
	public void maintain() {
		System.out.println("Bakım yapılıyor");
	}

}
