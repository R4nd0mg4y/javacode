package packet1;
public class Note {
  //  private static int continuousId=1;
    private String content;
     private int id;
    private String date;
    
    public Note() {
        
    }
    public Note(String contents){
        this.content = contents.substring(8, contents.length());
        String tmp = contents.substring(0,7);
        String tmp1 = tmp.substring(0,3);
        String tmp2 = tmp.substring(3,5);
        String tmp3 = tmp.substring(5,7);
        this.date = tmp2 + " " + tmp1 + " " +tmp3;
       // this.id = continuousId++;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getContent(){
        return content;
    }
    public String getDate(){
        return date;
    }
    
}
    