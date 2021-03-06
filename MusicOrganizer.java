import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;

    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<String>();
    }

    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }

    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }

    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
       /* if(index >= 0 && index < files.size()) {
            String filename = files.get(index);
            System.out.println(filename);
        }*/
        String filename = files.get(index);
        validIndex(index);
        System.out.println(filename);
    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
       /* if(index >= 0 && index < files.size()) {
            files.remove(index);
        }*/
        validIndex(index);
        files.remove(index);
    }

    public void checkIndex(int index){
        if(index <0 || index > files.size()){
            System.out.println("El indice indicado no esta en el rango de 0 a " + files.size());
        }

    }
    public boolean validIndex(int index){
       boolean valido = false;
        if(index >= 0 && index < files.size()){
            valido = true;
        }
        else{
            valido = false;
        }
        return valido;
    }
   
}
