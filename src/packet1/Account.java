package packet1;
import java.util.*;
public class Account {
    // private static int continuousId=1;
    private  int id=1;
    private String username;
    private ArrayList<Note>  notes;
    
    public Account(){

    }
    public Account(String username){
        this.username = username;
       // this.id = id;
        this.notes = new ArrayList<>();
    }
    
    
    public int getId(){
        return id;
    }
    public void AddNote(Note note){
       
        notes.add(note);
    }
    public String getName(){
        return username;
    }
   
    public ArrayList<Note> getNote(){
        return notes;
    }
    public void printNote(){
        for(Note note : notes){
            System.out.println(note.getDate()+" | " +note.getContent());
        }
    }

}
