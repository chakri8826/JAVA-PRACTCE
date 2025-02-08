public class MovieInfo{
    String movie_Name;
    String hero_Name;
    String director_Name;
    float gross_Collections;
    MovieInfo next;
    public MovieInfo(String mn,String hn,String dn,float c)
    {
        this.movie_Name=mn;
        this.hero_Name=hn;
        this.director_Name=dn;
        this.gross_Collections=c;
        this.next=null;
    }
    public String toString()
    {
        return movie_Name+" "+hero_Name+" "+director_Name+" "+gross_Collections;
    }
}