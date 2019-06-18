class Player {

    private String name;
    public String position;
    public String nationality;
    public int age;
    public double salary;
    public String team;

    public void teamChange(String newTeam) {
        team = newTeam;
    }

    // setters and getters

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }
}