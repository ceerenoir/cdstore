package cdstore;

public class GameCD extends CD {
   private String platform;

   /*
    * Konstruktory
    */
   public GameCD() {
   }
   
   // Settery w konstruktorze
   // http://stackoverflow.com/questions/4893558/calling-setters-from-a-constructor,
   // http://stackoverflow.com/questions/12533247/java-setters-from-constructors
   public GameCD(String title, String platform, double price) {
       setTitle(title);
       setPrice(price);
       setPlatform(platform);
   }
   
   /*
    * Metody get/set
    */
   public String getPlatform() {
       return platform;
   }
   
   // Ponieważ wywołujemy tę metodę w konstruktorze, powinna być finalna
   public final void setPlatform(String platform) {
       this.platform = platform;
   }
   
    @Override
    public String toString() {
        return  super.toString() + nl
                + " platform: "+platform;
    }
}