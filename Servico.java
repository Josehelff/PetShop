package Aula7;

public abstract class Servico {
  public abstract String descricao();
  public abstract double preco();
}
 
     class Banho extends Servico {
		public String descricao() {
			return "Banho";
		}
		public double preco() {
			return 50.00;
		}
	}
     
     class Tosa ext