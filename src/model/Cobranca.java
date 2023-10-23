package model;

public class Cobranca {
	private double valorTotal;
	private String mesReferencia;
	private double valorPago;
	private String dataPagamento;
	
	public String getMesReferencia() {
		return mesReferencia;
	}
	public void setMesReferencia(String mesReferencia) {
		this.mesReferencia = mesReferencia;
	}
	public String getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(String dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
	public void pagamento(String dataPagamento, double valorPago) {
		this.dataPagamento = dataPagamento;
		this.valorPago = valorPago;
	}
	
}
