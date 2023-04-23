package model;

public class PagamentoVaga {

	private Long hora; 
	private Double ValorTarifa; 
	private Vaga vaga;
	
	public PagamentoVaga(Vaga vaga ,Long hora) {
		this.vaga = vaga;
		this.hora = hora;
	}
	
	public Long getHora() {
		return hora;
	}
	public void setHora(Long hora) {
		this.hora = hora;
	}
	public Double getValorTarifa() {
		return ValorTarifa;
	}
	public void setValorTarifa(Double valorTarifa) {
		ValorTarifa = valorTarifa;
	}
	public Vaga getVaga() {
		return vaga;
	}

	
}
