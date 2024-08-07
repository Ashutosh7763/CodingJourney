package Day_5;
import java.util.ArrayList;
import java.util.Random;
public class MusicLibrary {
    String music;
    static ArrayList<String> collections = new ArrayList<>();
    public static void addMusic(String music){
        collections.add(music);
    }
    public static void removeMusic(String music){
        if(collections.remove(music)){

        }
        else{
            System.out.println("No music in the playlist");
        }

    }
    static void getMusic() {
        if (collections.isEmpty()) {
            System.out.println("No music found in playlist collection");
        } else {
            Random random = new Random();
            int ran = random.nextInt(collections.size());
            for (int i = 0; i < collections.size(); i++) {
                if (ran == i) {
                    System.out.println("Music : " + collections.get(i));
                }
            }
        }
    }

    public static void main(String[] args) {
        addMusic("Hindi");
        addMusic("English");
        addMusic("Bhojpuri");
        removeMusic("English");
        getMusic();
    }
}
