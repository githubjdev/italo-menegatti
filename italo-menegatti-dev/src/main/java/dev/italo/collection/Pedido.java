package dev.italo.collection;

public class Pedido {

	private String id;
	private String status;

	public Pedido(String id, String status) {
		this.id = id;
		this.status = status;
	}
	
	
	public Pedido() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", status=" + status + "]";
	}

}
