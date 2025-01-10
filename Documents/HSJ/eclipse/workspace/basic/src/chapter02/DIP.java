package chapter02;

import javax.swing.text.html.HTMLEditorKit.LinkController;

class Controller{
	
	Service service;
	
	Controller(Service service){
		this.service = service;
	}
	
	void controllerMethod() {
		System.out.println("Controller A");
		service.ServiceMethod();
	}
	void controllerMethod2() {
		System.out.println("Controller A2");
		service.ServiceMethod2();
	}
}
class Service{
	
	// Repository repository = new Repository();
	Repository2 repository;
	
	Service(Repository2 repository){
		this.repository = repository;
	}
	void ServiceMethod() {
		System.out.println("Service A");
		repository.repositoryMethod();
	}
	void ServiceMethod2() {
		System.out.println("Service A2");
		repository.repositoryMethod2();
	}
}
interface IRepository{
	// 인터페이스 추상화
	void repositoryMethod();
	void repositoryMerhod2();
}
class Repository implements IRepository{
	
	public void repositoryMethod() {
		System.out.println("Repository A");
	}
	public void repositoryMethod2() {
		System.out.println("Repository A2");
	}
}
class Repository2 implements IRepository{
	public void repositoryMethod() {
	System.out.println("Repository B");
	}
	void repositoryMethod2() {
	System.out.println("Repository B2");
	}
}

public class DIP {

	public static void main(String[] args) {
		
		Repository repository = new Repository();
		Repository2 repository2 = new Repository2();
		IRepository iRepository = repository2;
		
		Service sevice = new Service(repository2);
		Controller controller = new Controller(sevice);
		
		controller.controllerMethod();
		controller.controllerMethod2();

	}
}
