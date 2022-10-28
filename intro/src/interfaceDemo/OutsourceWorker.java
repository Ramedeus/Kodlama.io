package interfaceDemo;

public class OutsourceWorker implements IWorkable , IEatable{

	@Override
	public void work() {
		System.out.println("Çalışılıyor");
	}

	@Override
	public void eat() {
		System.out.println("Yemek arası");
	}


}
