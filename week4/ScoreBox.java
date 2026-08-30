public class ScoreBox
{
    private int score;
    public ScoreBox(int score)
    {
        this.score = score;
    }
    public int getScore(){
        return score;
    }
    public boolean setScore(int score){
        if (score >=0) {
            this.score= score;
            return true;
        }
        return false;
    }
    public String toString()
    {
        return "Score=" + score;
    }
}