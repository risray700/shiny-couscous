public class Song{

    private String title, artist;
    private  int year, plays;
    private  double duration;
  
    public  Song(){
        // Variables
        title="";
        artist="";
        year=0;
        plays=0;
        duration=0.0;
    }
    public Song(String t, String a, int y, int p, double d ){
        title = t;
        artist =a;
        year = y;
        plays=p;
        duration=d;
    }

    public String toString()
    {
        return "title: "+title +", artist "+ artist + ", year:" + year + " plays: " + plays + " duration: " + duration; 

    }

    public String getTitle(){

    return title;

    }
    public double getDuration(){

        return duration;
        
    }
    public int getYear(){

        return year;
        
    }
 public void  setTitle(String newTitle){
 title=newTitle;
 }
}
