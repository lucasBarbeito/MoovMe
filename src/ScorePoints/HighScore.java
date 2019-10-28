package ScorePoints;

import Zone.Zone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class HighScore{

    ArrayList<ScorePoint> scorePoints;
    Zone zone;

    public HighScore(Zone zone) {
        this.scorePoints = new ArrayList<>();
        this.zone = zone;
    }

    //si no funciona asi usar, en vez de reverseOrder, naturalOrder.
    void sortScorePoints(){
        Collections.sort(scorePoints, Comparator.reverseOrder());
    }

    void add(ScorePoint scorePoint){
        if(scorePoint.getZoneName().equals(zone.getZoneName())) {
            scorePoints.add(scorePoint);
        }else{
            throw new RuntimeException();
        }
    }
}
