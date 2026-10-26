package Week1.Exercise1;

public class PlaylistDemo {

    public static void main(String[] args) {

        System.out.println("=== Playlist Track Demo ===");
        System.out.println();

        // Test 1: Default Constructor
        Track track1 = new Track();

        System.out.println("Default Track:");
        System.out.println(track1);
        System.out.println();

        // Test 2: Title-only Constructor
        Track track2 = new Track("Neon Lights");

        System.out.println("Title-only track:");
        System.out.println(track2);
        System.out.println();

        // Test 3: Title + Artist Constructor
        Track track3 = new Track("Ocean Drive", "Midnight Pulse");

        System.out.println("Title + Artist Track:");
        System.out.println(track3);
        System.out.println();

        // Test 4: Full Constructor
        Track track4 = new Track(
                "Raindrop Waltz",
                "Clara Voss",
                210,
                false
        );

        System.out.println("Full Track (non-explicit):");
        System.out.println(track4);
        System.out.println();

        // Test 5: Invalid Duration
        System.out.println("Invalid Duration Test:");

        Track track5 = new Track(
                "Broken Clock",
                "Static Noise",
                -50,
                false
        );

        System.out.println(track5);
        System.out.println();

        // Test 6: Getters
        Track track6 = new Track(
                "Stardust",
                "Stellar Echo",
                242,
                true
        );

        System.out.println("Getter Test:");
        System.out.println("Title:     " + track6.getTitle());
        System.out.println("Artist:    " + track6.getArtist());
        System.out.println("Duration:  " + track6.getDurationFormatted());
        System.out.println("Explicit:  " + track6.isExplicit());
    }
}
