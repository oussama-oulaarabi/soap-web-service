package banque;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;
import static java.lang.Math.random;
@WebService(serviceName = "bank")
//--------------------------------------
public class banqueService {
    @WebMethod(operationName = "conversion")
    public double conversion(@WebParam(name = "montant") double a){
       return a*11;
}
//--------------------------------------
    @WebMethod
    public compte getcompte(int code ){
       return new compte(code ,random()*9000, new Date());
}
//--------------------------------------
    @WebMethod
    public List<compte> getlistcompte(){
        return  List.of(
    new compte(1 ,random()*9000, new Date()),
    new compte(2 ,random()*9000, new Date()),
    new compte(3 ,random()*9000, new Date()),
    new compte(4 ,random()*9000, new Date())
        );
}



}
