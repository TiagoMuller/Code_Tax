package entities;

public class PessoaFisica extends Pessoa {

	private Double gastos;

	public PessoaFisica() {};
	
	public PessoaFisica(String name, Double rendaAnual, Double gastos) {
		super(name, rendaAnual);
		this.gastos = gastos;
	}

	public Double getGastos() {
		return gastos;
	}

	public void setGastos(Double gastos) {
		this.gastos = gastos;
	}

	@Override
	public Double imposto() {
		if(rendaAnual < 20000.0) {
			return rendaAnual * 0.15 - gastos * 0.5;
		}
		else {
			return rendaAnual * 0.25 - gastos * 0.5;
		}
	}
	
	public String toString(){
		return name + ": $" + imposto();
	}
}
