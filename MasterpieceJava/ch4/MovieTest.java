package MasterpieceJava.ch4;
class Movie {
    String title;
    int year;
    void print(){
        System.out.println(title + ":" + year);
    }
}

public class MovieTest {
    public static void main(String[] args) {
        Movie m;
        m = new Movie();
        m.year = 2012;
        m.title = "Total Recall";
        m.print();
        
    }
    
}
