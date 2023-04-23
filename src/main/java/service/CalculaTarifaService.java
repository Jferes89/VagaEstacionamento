package service;

import java.util.ArrayList;
import java.util.List;

import model.PagamentoVaga;

public class CalculaTarifaService {

    private final List<ICalculadoraTarifa> calculadorasTarifa;

    public CalculaTarifaService() {
        this.calculadorasTarifa = new ArrayList<ICalculadoraTarifa>();	
        this.calculadorasTarifa.add(new CalculadoraTarifaCarro());
        this.calculadorasTarifa.add(new CalculadoraTarifaMoto());
    }

    public void add(ICalculadoraTarifa calculadoraTarifa) {
        this.calculadorasTarifa.add(calculadoraTarifa);
    }

    public void calcularTarifa(PagamentoVaga pagamento) {
        for (ICalculadoraTarifa calculadoraTarifa : calculadorasTarifa) {
            if (calculadoraTarifa.IsPertenceTarifa(pagamento)) {
                pagamento.setValorTarifa(calculadoraTarifa.calcular(pagamento));
                break;
            }
        }
    }
}
