package Aula7;



public class Animal {

	String nome;
	String especie;
	String raca;
	String DataDeNascimento;
	String proprietario;
	


 public Animal(String nome, String especie, String raca, String DataDeNascimento, String proprietario) {
	 this.nome = nome;
	 this.especie = especie;
	 this.raca = raca;
	 this.DataDeNascimento = DataDeNascimento;
	 this.proprietario = proprietario;
	 }
 public String getNome() {
	 return nome;
 }
 public void setNome(String nome) {
	 this.nome = nome;
 }
 
 public String getEspecie() {
	 return especie;
 }
 
 public void setEspecie(String especie) {
	 this.especie = especie;
 }
 
 public String getRaca() {
	 return raca;
 }
 
 public void setRaca(String raca) {
	 this.raca = raca;
 }
 
 public String getDataDeNascimento() {
	 return DataDeNascimento;
 }
 
 public void setDataDeNascimento(String DataDeNascimento) {
	 this.DataDeNascimento = DataDeNascimento;
 }
 
 public String getProprietario(){
	 return proprietario;
 }
 
 public void setProprietario(String proprietario) {
	 this.proprietario = proprietario;
 }
 
}


