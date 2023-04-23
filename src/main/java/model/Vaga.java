package model;

public class Vaga {

	private String Descricao;
	private Veiculo veiculo;
	private Boolean isLiberada;
	
	public Vaga(String descricao, Boolean isLiberado) {
		Descricao = descricao;
		isLiberada = isLiberado;
	}
	

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Boolean getIsLiberada() {
		return isLiberada;
	}

	public void setIsLiberada(Boolean isLiberada) {
		this.isLiberada = isLiberada;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}	
	
	
}
