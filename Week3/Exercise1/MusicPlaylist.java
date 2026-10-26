public class MusicPlaylist {
    SongNode head;
    SongNode tail;
    SongNode current;

    public MusicPlaylist() {
        head = null;
        tail = null;
        current = null;
    }

    public void addSong(String title) {
        SongNode newNode = new SongNode(title);

        if (head == null) {
            head = newNode;
            tail = newNode;
            current = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }

        System.out.println("Added: " + title);
    }

    public void removeSong(String title) {
        SongNode temp = head;

        while (temp != null && !temp.title.equals(title)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Song not found: " + title);
            return;
        }

        if (temp == head) {
            head = temp.next;
        }

        if (temp == tail) {
            tail = temp.prev;
        }

        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }

        if (current == temp) {
            current = temp.next;

            if (current == null) {
                current = tail;
            }
        }

        if (head == null) {
            tail = null;
            current = null;
        }

        System.out.println("Removed: " + title);
    }

    public void nextSong() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Current song: " + current.title);
        } else {
            System.out.println("There is no next song.");
        }
    }

    public void previousSong() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Current song: " + current.title);
        } else {
            System.out.println("There is no previous song.");
        }
    }

    public void displayCurrentSong() {
        if (current == null) {
            System.out.println("Playlist is empty.");
        } else {
            System.out.println("Current song: " + current.title);
        }
    }

    public void displayAllSongs() {
        if (head == null) {
            System.out.println("Playlist is empty.");
            return;
        }

        SongNode temp = head;

        System.out.println("Playlist:");

        while (temp != null) {
            if (temp == current) {
                System.out.println("-> " + temp.title + " (Current)");
            } else {
                System.out.println("   " + temp.title);
            }

            temp = temp.next;
        }
    }

    public void addSongAfter(String existingTitle, String newTitle) {
        SongNode search = head;

        while (search != null && !search.title.equals(existingTitle)) {
            search = search.next;
        }

        if (search == null) {
            System.out.println("Song not found: " + existingTitle);
            return;
        }

        SongNode newNode = new SongNode(newTitle);

        newNode.prev = search;
        newNode.next = search.next;

        if (search.next != null) {
            search.next.prev = newNode;
        } else {
            tail = newNode;
        }

        search.next = newNode;

        System.out.println("Added: " + newTitle + " after " + existingTitle);
    }

}

