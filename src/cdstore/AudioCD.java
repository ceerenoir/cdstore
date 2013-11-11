package cdstore;

public class AudioCD extends CD {
    private String artist;

    /*
     * Ctory
     */
    public AudioCD() {
    }

    public AudioCD(String title, String artist, double price) {
        super(title, price);
        this.artist = artist;
    }
    
    
   /*
    * Metody get/set
    */
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return  super.toString() + nl
                + " artist: "+artist;
    }
}