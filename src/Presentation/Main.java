package Presentation;

import Domain.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person>personAN = new ArrayList<>();
        President president1 = new President();
        president1.setIdPerson(1);
        president1.setName(" Alonso ");
        president1.setSurname(" Matamorros S. ");


        President president2 = new President();
        president2.setIdPerson(2);
        president2.setName(" Leo ");
        president2.setSurname(" Dominguez T. ");


        President president3 = new President();
        president3.setIdPerson(3);
        president3.setName(" Marcelo ");
        president3.setSurname(" Torbe C. ");




        Coach coach1 = new Coach();
        coach1.setIdPerson(11);
        coach1.setName(" Jose ");
        coach1.setSurname(" Perreira R ");
        coach1.setDateOfBirth("23/06/1970");

        Coach coach2 = new Coach();
        coach2.setIdPerson(12);
        coach2.setName(" Arturo ");
        coach2.setSurname(" Rodez M. ");
        coach2.setDateOfBirth("24/07/1965");

        Coach coach3 = new Coach();
        coach3.setIdPerson(13);
        coach3.setName(" Alexandro ");
        coach3.setSurname(" Vaca R. ");
        coach3.setDateOfBirth("30/08/1960");




        Player player1 = new Player();
        player1.setIdPerson(111);
        player1.setName(" Roni ");
        player1.setSurname(" Moreira P. ");
        player1.settShirtNumber(" 5 ");

        Player player2 = new Player();
        player2.setIdPerson(112);
        player2.setName(" Nicolas");
        player2.setSurname(" Reyes ");
        player2.settShirtNumber(" 32 ");

        Player player3 = new Player();
        player3.setIdPerson(113);
        player3.setName(" Fede ");
        player3.setSurname(" Torrres L. ");
        player3.settShirtNumber(" 33 ");

        Player player4 = new Player();
        player4.setIdPerson(114);
        player4.setName(" Fernando ");
        player4.setSurname(" Casillas S.");
        player4.settShirtNumber(" 44 ");

        Player player5 = new Player();
        player5.setIdPerson(115);
        player5.setName(" Manuel ");
        player5.setSurname(" Garcia R. ");
        player5.settShirtNumber("55");

        Player player6 = new Player();
        player6.setIdPerson(116);
        player6.setName(" Benit ");
        player6.setSurname(" Juarez T. ");
        player6.settShirtNumber(" 66 ");

        Player player7 = new Player();
        player7.setIdPerson(117);
        player7.setName(" Lalo ");
        player7.setSurname(" Leonidas R. ");
        player7.settShirtNumber(" 77 ");

        Player player8 = new Player();
        player8.setIdPerson(118);
        player8.setName(" Richi ");
        player8.setSurname("  De la fuente N. ");
        player8.settShirtNumber("88");

        Player player9 = new Player();
        player9.setIdPerson(119);
        player9.setName(" Mateo ");
        player9.setSurname(" Aluche P. ");
        player9.settShirtNumber(" 99 ");

        Player player10 = new Player();
        player10.setIdPerson(120);
        player10.setName(" Isaac ");
        player10.setSurname(" Sotillo S. ");
        player10.settShirtNumber(" 23 ");

        Player player11 = new Player();
        player11.setIdPerson(121);
        player11.setName(" Lucio ");
        player11.setSurname(" Menendez  D. ");
        player11.settShirtNumber(" 21 ");

        Player player12 = new Player();
        player12.setIdPerson(122);
        player12.setName(" Eduardo ");
        player12.setSurname(" Cabrales M.");
        player12.settShirtNumber(" 22 ");

        Player player13 = new Player();
        player13.setIdPerson(123);
        player13.setName(" Jhon");
        player13.setSurname(" Morales V.");
        player13.settShirtNumber("23");

        Player player14 = new Player();
        player14.setIdPerson(124);
        player14.setName(" Michael ");
        player14.setSurname(" Adonis C. ");
        player14.settShirtNumber("24");

        Player player15 = new Player();
        player15.setIdPerson(125);
        player15.setName(" Adam ");
        player15.setSurname(" Ferreiro B. ");
        player15.settShirtNumber(" 25 ");


        ArrayList<Team>teamsA = new ArrayList<>();

        Team team1 = new Team();
        team1.setIdTeam(1111);
        team1.setName("FC-Sevilla");
        team1.setTelephone("623456783");
        team1.setAddress("Sevilla");
        team1.addPerson(president1);
        team1.addPerson(coach1);
        team1.addPerson(player1);
        team1.addPerson(player2);
        team1.addPerson(player3);
        team1.addPerson(player4);
        team1.addPerson(player5);



        ArrayList<Team>teamsB = new ArrayList<>();
        Team team2 = new Team();
        team2.setIdTeam(1112);
        team2.setName("FC-Barcelona");
        team2.setTelephone("624243424");
        team2.setAddress("Barcelona");
        team2.addPerson(president2);
        team2.addPerson(coach2);
        team2.addPerson(player6);
        team2.addPerson(player7);
        team2.addPerson(player8);
        team2.addPerson(player9);
        team2.addPerson(player10);




        ArrayList<Team>teamsC = new ArrayList<>();
        Team team3 = new Team();
        team3.setIdTeam(1113);
        team3.setName("FC-Madrid");
        team3.setTelephone("677575652");
        team3.setAddress("Madrid");
        team3.addPerson(president3);
        team3.addPerson(coach3);
        team3.addPerson(player11);
        team3.addPerson(player12);
        team3.addPerson(player13);
        team3.addPerson(player14);
        team3.addPerson(player15);




        teamsA.add(team1);
        teamsB.add(team2);
        teamsC.add(team3);

        Match match1 = new Match();
        match1.setIdMatch(11111);
        match1.setMatchDate("22/09/2023");
        match1.setHomeTeam(teamsA);
        match1.setAwayTeam(teamsB);

        Match match2 = new Match();
        match2.setIdMatch(11112);
        match2.setMatchDate(" 23/02/2023");
        match2.setHomeTeam(teamsB);
        match2.setAwayTeam(teamsC);

imprimirTeam1(team1);
imprimirTeam2(team2);
imprimirTeam3(team3);

imprimirMatch1(match1);
imprimirMatch2(match2);

    }

    public static void imprimirTeam1(Team team1){

     System.out.println("=========================================LA LIGA============================================= \n");
     System.out.println("============================DATOS DEL PLANTEL DE EQUIPOS DE LA LIGA================================");
     System.out.println("Equipo[A] "
                     + "------------CODIGO EQ: " + team1.getIdTeam()
                     + "------NOMBRE EQ: " + team1.getName()
                     + "------TELEPHONE: " + team1.getTelephone()
                     + "------DIRECCION: " + team1.getAddress());


    }


    public static void imprimirTeam2(Team team2){

        System.out.println("Equipo[B] "
                + "------------CODIGO EQ: " + team2.getIdTeam()
                + "------NOMBRE EQ: " + team2.getName()
                + "------TELEPHONE: " + team2.getTelephone()
                + "------DIRECCION: " + team2.getAddress());
    }

    public static void imprimirTeam3(Team team3){

        System.out.println("Equipo[C] "
                + "------------CODIGO EQ: " + team3.getIdTeam()
                + "------NOMBRE EQ: " + team3.getName()
                + "------TELEPHONE: " + team3.getTelephone()
                + "------DIRECCION: " + team3.getAddress());
    }

    public static  void imprimirMatch1(Match match1){

        System.out.println("========================================PARTIDOS============================================== " );
        System.out.println("[Primer Partido] \n" +
                  "------------CODIGO PARTIDO: " + match1.getIdMatch()
                + "------FECHA PARTIDO: " + match1.getMatchDate()
                + "------EQUIPO LOCAL: " + match1.getHomeTeam()
                + "------EQUIPO VISITANTE: " + match1.getAwayTeam());

    }

    public static void imprimirMatch2(Match match2){

        System.out.println("[Segundo Partido] \n" +
                "------------CODIGO PARTIDO: " + match2.getIdMatch()
                + "------FECHA PARTIDO: " + match2.getMatchDate()
                + "------EQUIPO LOCAL: " + match2.getHomeTeam()
                + "------EQUIPO VISITANTE: " + match2.getAwayTeam());

    }




}