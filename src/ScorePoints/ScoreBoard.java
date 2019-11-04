package ScorePoints;

import Database.MemberDatabase;

import java.util.ArrayList;

public class ScoreBoard {
    
    private ArrayList<ScorePoint> zoneScoreBoard;
    private String zoneScoreBoardName;

    public ScoreBoard(String zoneScoreBoardName) {
        this.zoneScoreBoardName = zoneScoreBoardName;
        zoneScoreBoard = new ArrayList<>();
    }

    public ArrayList<ScorePoint> getHighScores() {
        return zoneScoreBoard;
    }

    public void calculateHighScores() {

    }

}
