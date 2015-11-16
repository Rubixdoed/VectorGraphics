package cipher;

public abstract class Cipher{
    
    private String name;
    
    public Cipher(String name){
        this.name = name;
    }
    
    public abstract String encrypt(String text, String ... args);
    public abstract String decrypt(String text, String ... args);
    
    public abstract String getDescription();
    
    public String getName(){
        return name;
    }
    
}
