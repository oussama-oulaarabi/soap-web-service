package banque;
import java.util.Date;
public class compte {
    private int code;
    private double solde;
    private Date datecreation;

    public Date getDatecreation() {
        return datecreation;
    }

    public void setDatecreation(Date datecreation) {
        this.datecreation = datecreation;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public compte(int code) {
        this.code = code;
    }
    public compte(int code , double solde){
        this(code);
        this.solde = solde;
    }
    public compte(int code , double solde, Date datecreation){
        this(code,solde);
        this.datecreation = datecreation;
    }
}

