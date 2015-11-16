import java.util.List;
import java.util.ArrayList;

/**
 * @author Zachary Stroud
 * @version 1.0
 */
public class Core{
    
    private Scanner scan;
    private List<Cipher> ciphers;
    
    public static void init(){
        scan = new Scanner(System.in);
        
        ciphers = new ArrayList<Cipher>();
    }
    
    // INPUT FUNCTIONS
    
    public String getLine(){
        return scan.nextLine();
    }
    
    public int getInt(){
        return Integer.parseInt( scan.nextLine() );
    }
    
    public int getDouble(){
        return Doube.parseDouble( scan.nextLine() );
    }
    
    // OUTPUT FUNCTIONS
    
    public void listCiphers(){
        for(int i = 0; i < ciphers.size(); i++){
            System.out.println( (i+1) + ". " + ciphers.get(i).getName() );
        }
    }
    public void listCiphers(int min, int max){
        if(min < 1) min = 1;
        if(max > ciphers.size()) max = ciphers.size();
        for(int i = min-1; i < max; i++){
            System.out.println( (i+1) + ". " + ciphers.get(i).getName() );
        }
    }
    
    public static void main(String[] args){
        
        init();
        
        
        
    }
    
}
