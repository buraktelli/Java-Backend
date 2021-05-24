package kodlamaio.northwind.core.utilities.results;

public class DataResult<T> extends Result{

	//<T> Butun tipleri kapsar any gibi
	
	private T data;
	
	public DataResult(T data, boolean success, String message) {
		super(success, message); //Base sinifin constructorini calistirir
		this.data = data;
		
	}
	
	public DataResult(T data, boolean success) {
		super(success);
		this.data = data;
		
	}
	
	public T getData() {
		return this.data;
	}
	
}
