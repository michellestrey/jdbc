package connectionStudyJdbcClasses;

public class Classes {
	private Integer id;
	private String cpf;
	private String nome;
	public Classes(Integer id, String cpf, String nome) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	

}
