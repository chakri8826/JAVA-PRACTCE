public class player {
    String playerName;
    int totalRuns;
    int totalMatches;
    float averageScore;
    player next;
    public player(String name,int runs,int matches)
    {
        this.playerName=name;
        this.totalRuns=runs;
        this.totalMatches=matches;
        this.averageScore=totalRuns/totalMatches;
        this.next=null;
    }
    public String toString()
    {
        return "Player Name:"+playerName+" Total Runs:"+totalRuns+" Total Matches:"+totalMatches+" Average Score:"+averageScore;
    }
}
