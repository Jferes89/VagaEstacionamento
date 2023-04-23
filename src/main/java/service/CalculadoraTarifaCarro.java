package service;

import model.PagamentoVaga;

public class CalculadoraTarifaCarro implements ICalculadoraTarifa{

    public double calcular(PagamentoVaga pagamentoVaga) {
    	Long horas = pagamentoVaga.getHora();
        double tarifa;

        if (horas <= 0 || horas > 24) {
            throw new IllegalArgumentException("Número de horas inválido");
        }

        if (horas <= 4) {
            tarifa = 5 * horas;
        } else if (horas <= 12) {
            tarifa = 20;
        } else {
            tarifa = 40;
        }

        if (pagamentoVaga.getVaga().getVeiculo().isPreferencial()) {
            tarifa *= 0.7;
        }
        return tarifa;

    }

	public boolean IsPertenceTarifa(PagamentoVaga pagamentoVaga) {
    	return "Carro".equalsIgnoreCase(pagamentoVaga.getVaga().getVeiculo().getTipoVeiculo());
	}
}
