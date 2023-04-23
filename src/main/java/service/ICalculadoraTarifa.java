package service;

import model.PagamentoVaga;

public interface ICalculadoraTarifa {

    boolean IsPertenceTarifa(PagamentoVaga pagamentoVaga);

    double calcular(PagamentoVaga pagamentoVaga);
}
