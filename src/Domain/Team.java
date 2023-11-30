package Domain;

import java.util.ArrayList;

public class Team {

    private Integer idTeam;
    public String name;
    public String telephone;
    public String address;

    private ArrayList<Person>personsEN = new ArrayList<>();

    private ArrayList<Person>perTeam;


    public Integer getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(Integer idTeam) {
        this.idTeam = idTeam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public ArrayList<Person> getPerTeam() {
        return perTeam;
    }

    public void setPerTeam(ArrayList<Person> perTeam) {
        this.perTeam = perTeam;
    }


    public void addPerson(Person person){
    personsEN.add(person);
    }

    public Person getPerson(Integer posicion){
        return personsEN.get(posicion);
    }






}



