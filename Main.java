
public class Main {

    public static void main(String[] args) {

        MusicCollection pop = new MusicCollection();
        MusicCollection jazz = new MusicCollection();
        MusicCollection rock = new MusicCollection();
        MusicCollection country = new MusicCollection();
        MusicCollection favorites = new MusicCollection();

        Music m1 = new Music("music1", "me", 1390);
        Music m2 = new Music("music2", "you", 1391);
        Music m3 = new Music("music3", "he", 1392);
        Music m4 = new Music("music4", "she", 1393);
        Music m5 = new Music("music5", "we", 1394);
        Music m6 = new Music("music6", "you2", 1395);
        Music m7 = new Music("music7", "they", 1396);



        pop.addFile(m1);
        jazz.addFile(m2);
        rock.addFile(m3);
        country.addFile(m4);
        pop.addFile(m5);
        pop.addFile(m6);
        pop.addFile(m7);
        favorites.addFile(m1);
        favorites.addFile(m3);
        favorites.addFile(m5);
        favorites.addFile(m7);

        System.out.println("pop: ");
        pop.getNumberOfFiles();
        pop.listAllFiles();
        pop.removeFile(2);
        pop.listFile(2);
        pop.startPlaying(1);
        pop.stopPlaying();
        pop.search("music1");
        pop.search("music2");

        System.out.println("\njazz: ");
        jazz.getNumberOfFiles();
        jazz.listAllFiles();

        System.out.println("\nrock: ");
        rock.getNumberOfFiles();
        rock.listAllFiles();

        System.out.println("\ncountry: ");
        country.getNumberOfFiles();
        country.listAllFiles();

        System.out.println("\nfavorites: ");
        favorites.getNumberOfFiles();
        favorites.listAllFiles();
        favorites.removeFile(3);
        favorites.listAllFiles();

    }
}