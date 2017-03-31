package td1;

public class Descendant {
	private String surnom;
	private String sexe;
	private Animal animal; 
	
	public Descendant(String nom, String sexe, Animal animal) {
		super();
		this.surnom = nom;
		this.sexe = sexe;
		this.animal = animal;
	}
	
	public String ascendant(){
		return this.animal.getEspece();
	}

	public String getNom() {
		return surnom;
	}

	public void setNom(String nom) {
		this.surnom = nom;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

}
