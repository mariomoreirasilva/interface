package entities;

public class OnlinePaypal implements PagamentoOnline {

	@Override
	public double Taxa(double taxa) {
		//taxa é 2%
		return taxa * 0.02 ;
	}

	@Override
	public double Juro(double valor, int mes) {
		//juro é 1% * mes
		return valor * 0.01 * mes;
	}
	

}
