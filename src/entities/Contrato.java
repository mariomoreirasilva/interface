package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {
	
	private Integer numero;
	private LocalDate dataContrato;
	private Double vlrTotal;	
	private List<ParcelaContrato> parcelas = new ArrayList<>();
	public Contrato(Integer numero, LocalDate dataContrato, Double vlrTotal) {		
		this.numero = numero;
		this.dataContrato = dataContrato;
		this.vlrTotal = vlrTotal;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public LocalDate getDataContrato() {
		return dataContrato;
	}
	public void setDataContrato(LocalDate dataContrato) {
		this.dataContrato = dataContrato;
	}
	public Double getVlrTotal() {
		return vlrTotal;
	}
	public void setVlrTotal(Double vlrTotal) {
		this.vlrTotal = vlrTotal;
	}
	public List<ParcelaContrato> getParcelas() {
		return parcelas;
	}

	

}
