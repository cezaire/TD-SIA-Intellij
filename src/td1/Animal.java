package td1;

import java.util.ArrayList;

public class Animal{
    private String espece;
    private String sexe;
    private Cri cri;
    private ArrayList<Descendant> descendants = new ArrayList<>();

    public Animal(String espece, String sexe, Cri cri) {
        this.espece = espece;
        this.sexe = sexe;
        this.cri = cri;
    }
    
    public void setEspece(String espece){
        this.espece = espece;
    }
        public void setSexe(String sexe){
        this.sexe = sexe;
    }
    
    public String getSexe(){
        return this.sexe;
    }
    public String getEspece(){
        return this.espece;
    }
    
    public Cri getCri(){
        return this.cri;
    }
    
    public void setCri(Cri cri){
        this.cri = cri;
    }
    
    public ArrayList<Descendant> getDescendants() {
		return descendants;
	}

	public void setDescendants(ArrayList<Descendant> descendants) {
		this.descendants = descendants;
	}

	public boolean compatibiliteGrossesse(String espece, String sexe){
        if( (this.espece.equals(espece)) && (this.sexe != sexe) ){
            cri.pousseUnCri();
            return true;
        }
        cri.pousseUnCri();
        return false;
    }

}



