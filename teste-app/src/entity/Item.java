package entity;

public class Item {

	private Integer id;
	private String nome;
	private String status;
	
	public Item (Integer id, String nome, String status) {
		this.id = id;
		this.nome = nome;
		this.status = "N";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", nome=" + nome + ", status=" + status + "]";
	}
	
	

}
