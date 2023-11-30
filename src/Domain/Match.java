package Domain;

import java.util.ArrayList;

public class Match {

    private Integer idMatch;
    public String matchDate;

    private ArrayList<Team>homeTeam = new ArrayList<>();
    private ArrayList<Team>awayTeam = new ArrayList<>();



    public Integer getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(Integer idMatch) {
        this.idMatch = idMatch;
    }

    public String getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(String matchDate) {
        this.matchDate = matchDate;
    }



    public void setHomeTeam(ArrayList<Team> homeTeam) {
        this.homeTeam = homeTeam;
    }

    public void setAwayTeam(ArrayList<Team> awayTeam) {
        this.awayTeam = awayTeam;
    }




    public ArrayList<Team> getHomeTeam() {
        return homeTeam;
    }

    public ArrayList<Team> getAwayTeam() {
        return awayTeam;
    }




}
