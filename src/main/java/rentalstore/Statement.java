package rentalstore;

import java.util.List;

public abstract class Statement {
     public String generateStatement(Customer customer){
         String result = headerStr(customer);
         for (Rental each : customer.getRentals()) {
             result += detailStr(each);
         }
         result += footerStr(customer);
         return result;
     }

    public abstract String headerStr(Customer customer);
     public abstract String detailStr(Rental each);
     public abstract String footerStr(Customer customer);
}
