package cdstore;

/**
 * Klasa główna płyty
 */
public class CD {
    // pola protected ze względu na konstruktor w klasie MovieCD
    protected String title;
    protected double price;

    protected String nl = System.getProperty("line.separator");
    
    /*
     * Ctory
     */
    public CD() {
    }

    public CD(String title, double price) {
        this.title = title;
        this.price = price;
    }
    /*
     * Metody get/set
     */
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return getClass().getSimpleName()+nl
                +" title: "+title+nl
                +" price: "+price;
    }

}