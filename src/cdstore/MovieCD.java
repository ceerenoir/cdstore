package cdstore;

public class MovieCD extends CD {
   private String director;
   
   /*
    * Ctory
    */
   public MovieCD() {
   }
   
   public MovieCD(String title, String director, double price) {
       this.title = title;
       this.price = price;
       
       this.director = director;
   }

   /*
    * Metody get/set
    */ 
   public String getDirector() {
       return director;
   }
   public void setDirector(String director) {
       this.director = director;
   }
   

    @Override
    public String toString() {
        return  super.toString() + nl
                + " director: "+director;
    }
    
}