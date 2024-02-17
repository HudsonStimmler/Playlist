/**
* Sample of a tester file for the Playlist class. This file should demonstrate all the capability of your
* playlist in the main method. You don't need to follow the testing specifications of this exactly
* if you want to write your own separate tester instead.
* Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
* @author
* @version
*/
import java.util.*;
public class PlaylistTester {
    public static void main(String[] args) {
        System.out.println("Initializing a Playlist...\n");
        Playlist a = new Playlist();
 
        System.out.println("Adding songs to the Playlist...\n");
       /**
        * Add some songs here. Note that the format for adding a Song to a Playlist p
        * is something like...
        * p.addSong(new Song(..., ..., ...))
        */
        a.addSong(new Song("oui", "Jeremih", 238));
        a.addSong(new Song("Cudi Zone", "Kid Cudi", 258));
        a.addSong(new Song("Through Da Storm", "Polo G", 195));
        a.addSong(new Song("Too Comfortable", "Future", 236));
        a.addSong(new Song("On Me", "Lil Baby", 136));
        a.addSong(new Song("This Could Be Us", "Rae Sremmurd", 206));
        a.addSong(new Song("through the late night", "Travis Scott", 286));
        a.addSong(new Song("Hallucinating", "Future", 136));
        a.addSong(new Song("Down Below", "Roddy Ricch", 224));
        a.addSong(new Song("Best I Ever Had", "Drake", 258));
 
 
 
        System.out.println("Printing the songs...\n");
        //Print out all the songs in the playlist to verify it's working correctly
        //System.out.println(a.examSongs());
        a.TesterExamSongs();
 
 
        System.out.println("\nLiking the songs in position X, Y, Z, etc....\n");
        //Once your songs are 'liked', this should be reflected in the next printout
        a.likeSong(1);
        a.likeSong(4);
        a.likeSong(5);
 
        System.out.println("Printing the songs...\n");
        //System.out.println(a.examSongs());
        a.TesterExamSongs();
 
 
        System.out.println("\nRemoving the song in position A, B, C, etc...\n");
        a.removeSong(0);
        a.removeSong(8);
        a.removeSong(3);
 
 
        System.out.println("Printing the songs...\n");
        //System.out.println(a.examSongs());
        a.TesterExamSongs();
 
 
        System.out.println("\nPrinting only the liked songs...\n");
        //Your Playlist should be able to do this without looping while in main!
        //System.out.println(a.examLikedSongs());
        a.TesterExamLikedSongs();
 
 
        System.out.println("\nPrinting the total duration of all songs...\n");
        //Note that the format should look something like minutes:seconds
        System.out.println(a.totalDuration()/60 + ":" + a.totalDuration()%60);
 
 
        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        //This should be doable with a single method call
        a.removeUnliked();
 
 
        System.out.println("Printing all songs...\n");
       //This should now look like only the liked songs list from before
       //System.out.println(a.examSongs());
       a.TesterExamSongs();
    }
}
 
 
