package model.entities;

import model.excecao.ConjuntoDeExeption;

public class Conta {
	private Integer numeroDaConta;
	private String nomeDoDono;
	private Double saldo;
	private Double limiteDeSaque;
	
	public Conta() {
		
	}

	public Conta(Integer numeroDaConta, String nomeDoDono, Double saldo, Double limiteDeSaque) throws ConjuntoDeExeption{
		super();
		this.numeroDaConta = numeroDaConta;
		this.nomeDoDono = nomeDoDono;
		this.saldo = saldo;
		/*if(limiteDeSaque >= this.saldo) {
			throw new ConjuntoDeExeption("O limite de saque informado deve ser menor que o saldo!");
		}*/
		this.limiteDeSaque = limiteDeSaque;
	}

	public Integer getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(Integer numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public String getNomeDoDono() {
		return nomeDoDono;
	}

	public void setNomeDoDono(String nomeDoDono) {
		this.nomeDoDono = nomeDoDono;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getLimiteDeSaque() {
		return limiteDeSaque;
	}

	public void setLimiteDeSaque(Double limiteDeSaque) {
		this.limiteDeSaque = limiteDeSaque;
	}
	
	public void deposita(Double quantia) {
		this.saldo+=quantia;
	}
	
	public void saque(Double quantia) throws ConjuntoDeExeption{
		if(quantia > this.limiteDeSaque) {
			throw new ConjuntoDeExeption("Quantia de saque é maior que o limite permitido!");
		}
		else {
			if(quantia >saldo) {
				throw new ConjuntoDeExeption("Saldo insuficinete para realizar saque!");
			}
			else {
				this.saldo-=quantia;
			}
		}
	}
}
