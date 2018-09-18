
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> business = new ArrayList<>();
        business.add( "Jet Loop Methods");
        business.add("Blue Box Printer");
        business.add("Code Coder Inc.");
        business.add("Express Array");
        business.add("Java Worlds");

        System.out.println("Name of all the Business list: " + business);
        System.out.println(business);

        BusinessOutPrint(business);
    }
    public static List BusinessOutPrint(ArrayList var){
        return  var;
    }
}