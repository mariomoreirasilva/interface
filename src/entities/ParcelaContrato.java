package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParcelaContrato {
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private LocalDate dataParcela;
	private Double vlrParcela;
	public ParcelaContrato(LocalDate dataParcela, Double vlrParcela) {		
		this.dataParcela = dataParcela;
		this.vlrParcela = vlrParcela;
	}
	public LocalDate getDataParcela() {
		return dataParcela;
	}
	public void setDataParcela(LocalDate dataParcela) {
		this.dataParcela = dataParcela;
	}
	public Double getVlrParcela() {
		return vlrParcela;
	}
	public void setVlrParcela(Double vlrParcela) {
		this.vlrParcela = vlrParcela;
	}
	@Override
	public String toString() {
		return  dataParcela.format(fmt) + " - " + String.format("%.2f", getVlrParcela());
	}
	

}
