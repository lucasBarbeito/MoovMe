package ScorePoints;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

    public String getZoneScoreBoardName() {
        return zoneScoreBoardName;
    }

    public ArrayList<String> getTop10Usernames() {
        ArrayList<String> top10Usernames = new ArrayList<>(10);
        zoneScoreBoard.sort(Comparator.comparing(ScorePoint::getTotalMonthlyPoints));
        Collections.reverse(zoneScoreBoard);
        for (ScorePoint aScorePoint: zoneScoreBoard) {
            top10Usernames.add(aScorePoint.getUsername());
        }
        zoneScoreBoard.get(0).makeMonthlyTop3();
        zoneScoreBoard.get(1).makeMonthlyTop3();
        zoneScoreBoard.get(2).makeMonthlyTop3();
        return top10Usernames;
    }

}
