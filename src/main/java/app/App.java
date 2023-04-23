package app;

import model.PagamentoVaga;
import model.Vaga;
import model.Veiculo;
import service.CalculaTarifaService;

public class App {

	public static void main(String[] args) {
        CalculaTarifaService calculaTarifaService = new CalculaTarifaService();

		
        Veiculo carroComum = new Veiculo("Carro", "A50984", false);
        Veiculo carroPreferencial = new Veiculo("Carro", "A50984", true);

		Vaga vagaA1 = new Vaga("A1",true);
		Vaga vagaA2 = new Vaga("A2",true);
		
		vagaA1.setVeiculo(carroComum);
		vagaA2.setVeiculo(carroPreferencial);

		PagamentoVaga pagamentoVagaA1 = new PagamentoVaga(vagaA1,2L);
		PagamentoVaga pagamentoVagaA2 = new PagamentoVaga(vagaA2,10L);
		
		calculaTarifaService.calcularTarifa(pagamentoVagaA1);
		calculaTarifaService.calcularTarifa(pagamentoVagaA2);
		
		System.out.println("Tarifa para Vaga" + pagamentoVagaA1.getVaga().getDescricao() + "R$" + "" + pagamentoVagaA1.getValorTarifa());
		System.out.println("Tarifa para Vaga" + pagamentoVagaA2.getVaga().getDescricao() + "R$" + "" + pagamentoVagaA2.getValorTarifa());
        
		
		
	}
	
}
