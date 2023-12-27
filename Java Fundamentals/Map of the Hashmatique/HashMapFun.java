import java.util.HashMap;
import java.util.Set;

public class HashMapFun {
    public static void main(String[] args) {
        HashMap<String, String> songs = new HashMap<>();
        songs.put("Anne-Marie", "She works at nights by the water, She's gone astray so far");
        songs.put("Eminem", "Fill 'em with the venom and eliminate 'em Other words, I Minute Maid 'em");
        songs.put("ft.Neoni", "Best to give me your loyalty,'Cause I'm taking the world you'll see");
        songs.put("Tom Odell", "I wanna take you somewhere so you know I care, But it's so cold and I don't know where");
        String selectedSong = songs.get("Eminem");
        System.out.println("Selected Song: " + selectedSong);
        Set<String> keys = songs.keySet();
        for (String key : keys) {
            System.out.println(key + ": " + songs.get(key));
        }
    }
}
