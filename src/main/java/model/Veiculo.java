package model;

public class Veiculo {
	
	private String tipoVeiculo;
	private String placa;
	private Boolean isPreferencial;
	
	
	public Veiculo(String tipoVeiculo, String placa, Boolean isPreferencial) {
		this.tipoVeiculo = tipoVeiculo;
		this.placa = placa;
		this.isPreferencial = isPreferencial;
	}


	public String getTipoVeiculo() {
		return tipoVeiculo;
	}


	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public Boolean isPreferencial() {
		return isPreferencial;
	}


	public Boolean getIsPreferencial() {
		return isPreferencial;
	}


	public void setIsPreferencial(Boolean isPreferencial) {
		this.isPreferencial = isPreferencial;
	}
	
	
	
}
