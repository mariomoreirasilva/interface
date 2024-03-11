package entities;

import java.time.LocalDate;

public class GerarParcela {
	
	private PagamentoOnline pagamento;

	public GerarParcela(PagamentoOnline pagamento) {		
		this.pagamento = pagamento;
	}
	
	public void processarParcela(Contrato obj, int meses) {
		
		double vlrBaseParcela = obj.getVlrTotal() / meses;
		
		for(int i = 1; i<= meses; i++) {
			//data inicial mais qtd de meses posteriores
			LocalDate dataContrato = obj.getDataContrato().plusMonths(i);			
			double juro = pagamento.Juro(vlrBaseParcela, i);
			double taxa = pagamento.Taxa(vlrBaseParcela + juro);
			double vlrTotalParcela = vlrBaseParcela + taxa + juro;
			obj.getParcelas().add(new ParcelaContrato(dataContrato, vlrTotalParcela));
			
		}
		
		
		
	}

}
