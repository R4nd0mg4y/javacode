public class Song {
    private String name;
    private String author;
    private int duration;
    public Song(String name, String author, int duration){
        this.name = name;
        this.author = author;
        this.duration = duration;
    }

public String getName(){
    return name;
}
public String getAuthor(){
    return author;
}
public int getDuration(){
    return duration;
}
public boolean equals(Song song){
        if(this.name.equals( song.getName()) && this.author.equals(song.getAuthor()) && this.duration == song.getDuration()){
            return true;
        }
        return false;
    
}
}

