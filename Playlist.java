import java.util.*;
 
/**
* The Playlist class, which will keep track of a playlist of Song objects
* Refer to the project description to make sure you have access to all available methods
*/
public class Playlist{
   /**
    * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
    * (CarDealership, Zoo) for structure on how this will look
    */
    private ArrayList<Song> playlist;
 
    /**
     * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
     * then use additional methods to add Songs in one-by-one
     */
    public Playlist(){
        playlist = new ArrayList<Song>();
    }     
 
     /**
      * Methods-- Remember that you need to be able to complete all of the following:
      * Adding a song
      * 'liking' a song
      * Removing a specific song
      * Examining all Songs (a String return makes sense here)
      * Examining a sublist of all liked songs
      * Determining the total duration of all songs
      * Removing all unliked songs from the playlist (careful with this one!)
      */
 
    public void addSong(Song c){
        playlist.add(c);
    }
 
    public void removeSong(int pos){
        playlist.remove(pos);
    }
 
    public String examSongs(){
        String list = "";
        for (Song c: playlist){
            list += c.toString();
        }
        return list;
    }
     
 
    public void TesterExamSongs(){
        for (Song c: playlist){
            System.out.println(c.toString());
        }
    }
     
 
    public void likeSong(int pos){
        playlist.get(pos).changeStatus();
    }
 
    public String examLikedSongs(){
        String list = "";
        for (Song c: playlist){
            if (c.getStatus()){
                list += c.toString();
            }
        }
        return list;
    }
  
    public void TesterExamLikedSongs(){
        for (Song c: playlist){
            if (c.getStatus()){
                System.out.println(c.toString());
            }
        }
    }
     
 
 
    public int totalDuration(){
        int total = 0;
        for (Song c : playlist){
            total += c.getDuration();
        }
        return total;
    }
 
    public void removeUnliked(){
        for (int i = 0; i<playlist.size(); i++){
            if (!playlist.get(i).getStatus()){
                playlist.remove(playlist.get(i));
                i--;
            }
        }
    }
}