public class SongNode {
    String title;
    SongNode next;
    SongNode prev;

    public SongNode(String title) {
        this.title = title;
        this.next = null;
        this.prev = null;
    }
}