package service;

import model.PagamentoVaga;

public class CalculadoraTarifaMoto implements ICalculadoraTarifa {

	public boolean IsPertenceTarifa(PagamentoVaga pagamentoVaga) {
		return "Moto".equalsIgnoreCase(pagamentoVaga.getVaga().getVeiculo().getTipoVeiculo());
	}

	public double calcular(PagamentoVaga pagamentoVaga) {
		  Long horas = pagamentoVaga.getHora();
	        double tarifa;

	        if (horas <= 0 || horas > 24) {
	            throw new IllegalArgumentException("Número de horas inválido");
	        }

	        if (horas <= 4) {
	            tarifa = 2.5 * horas;
	        } else if (horas <= 12) {
	            tarifa = 10;
	        } else {
	            tarifa = 20;
	        }

	        if (pagamentoVaga.getVaga().getVeiculo().isPreferencial()) {
	            tarifa *= 0.7;
	        }

	        return tarifa;
	}


}
