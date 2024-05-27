package classes;

public class Compte {
    private int code;
    private Double solde = 1500.0;
    private String name;
    private String currency = "euro";
    boolean isActive = false;

    public Compte(int code, Double solde) {
        this.code = code;
        this.solde = solde;
    }

    public Compte(int code, String name) {
        this.code = code;
        this.name = name;
        this.solde =0.0;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Double getSolde() {
        return solde;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }

    public void retirer(Double mt){
        if(solde== null){
            solde = 0.0;
        }
        solde = solde-mt;
    }
    public String getSoldeEnEuro(){
        return solde + " " + currency;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "code=" + code +
                ", solde=" + solde +
                ", name='" + name + '\'' +
                ", currency='" + currency + '\'' +
                '}';
    }
   public void activeCompte(){
        isActive = true;
    }

    public boolean isActive() {
        return isActive;
    }
}
