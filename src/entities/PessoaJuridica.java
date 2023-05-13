package entities;

public class PessoaJuridica extends Pessoa{

	protected Double funcionarios;

	public PessoaJuridica() {}
	
	public PessoaJuridica(String name, Double rendaAnual, Double funcionarios) {
		super(name, rendaAnual);
		this.funcionarios = funcionarios;
	}

	public Double getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Double funcionarios) {
		this.funcionarios = funcionarios;
	}

	@Override
	public Double imposto() {
		if(funcionarios > 10) {
			return rendaAnual * 0.14;
		}
		else {
			return rendaAnual * 0.16;
		}
		
	}
	
	public String toString(){
		return name + ": $" + String.format("%.2f", imposto());
	}
}