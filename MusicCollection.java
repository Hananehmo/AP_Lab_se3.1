import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 *
 * @author David J. Barnes and Michael K�lling
 * @version 2011.07.31
 */
public class MusicCollection {
    // An ArrayList for storing the file names of music files.
    private ArrayList<Music> files;
    // A player for the music files.
    private MusicPlayer player;

    /**
     * Create a MusicCollection
     */
    public MusicCollection()
    {
        player = new MusicPlayer();
        files = new ArrayList<Music>();
    }

    /**
     * Add a file to the collection.
     * @param music The file to be added.
     */
    public void addFile(Music music)
    {
        files.add(music);
    }


    private int calculateNumberOfFiles()
    {
        int size = files.size();
        return size;
    }
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public void getNumberOfFiles()
    {
        System.out.println("Number of songs: " + calculateNumberOfFiles());
    }

    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(validIndex(index))
            System.out.println(index + ") " + files.get(index-1).getName());
    }

    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        for(int i=0; i<calculateNumberOfFiles(); i++)
            System.out.println(i+1 + ") " + files.get(i).getName());
    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(validIndex(index))
        {
            files.remove(index-1);
            System.out.println("music number " + index + " removed successfully!");
        }
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        if(validIndex(index))
            player.startPlaying(files.get(index-1).getName(), files.get(index-1).getSinger(), files.get(index-1).getYear());
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
    }


    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index)
    {
        if(index > 0 && index <= calculateNumberOfFiles())
            return true;
        else
            return false;
    }

    public void search (String musicName)
    {
        boolean check = false;
        for(int i=0; i < calculateNumberOfFiles(); i++)
        {
            if(files.get(i).getName().equals(musicName))
            {
                check = true;
                System.out.println("music found at " + i+1 + " index");
                break;
            }
        }
        if(check == false)
            System.out.println(musicName + " not found :(");
    }
}