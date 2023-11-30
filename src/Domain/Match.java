package Domain;

public class Match {

    private Integer idMatch;
    public String matchDate;
    public String homeTeam;
    public String awayTeam;


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

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }
}
