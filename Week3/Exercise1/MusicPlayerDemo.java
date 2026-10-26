public class MusicPlayerDemo {
    public static void main(String[] args) {
    MusicPlaylist playlist = new MusicPlaylist();

        System.out.println("=== ADD SONGS ===");
        playlist.addSong("Shape of You");
        playlist.addSong("Blinding Lights");
        playlist.addSong("Perfect");
        playlist.addSong("Flowers");

        System.out.println("\n=== DISPLAY ALL SONGS ===");
        playlist.displayAllSongs();
        
        System.out.println("\n=== DISPLAY CURRENT SONG ===");
        playlist.displayCurrentSong();
        
        System.out.println("\n=== NEXT SONG ===");
        playlist.nextSong();
        
        System.out.println("\n=== NEXT SONG AGAIN ===");
        playlist.nextSong();
        
        System.out.println("\n=== PREVIOUS SONG ===");
        playlist.previousSong();
        
        System.out.println("\n=== ADD SONG AFTER ===");
        playlist.addSongAfter("Blinding Lights", "Levitating");
        playlist.displayAllSongs();
        
        System.out.println("\n=== REMOVE SONG ===");
        playlist.removeSong("Perfect");
        playlist.displayAllSongs();
        
        System.out.println("\n=== REMOVE FIRST SONG ===");
        playlist.removeSong("Shape of You");
        playlist.displayAllSongs();
        
        System.out.println("\n=== REMOVE LAST SONG ===");
        playlist.removeSong("Flowers");
        playlist.displayAllSongs();
        
        System.out.println("\n=== TRY MOVING TO PREVIOUS SONG ===");
        playlist.previousSong();
        
        System.out.println("\n=== FINAL CURRENT SONG ===");
        playlist.displayCurrentSong();
    }
}