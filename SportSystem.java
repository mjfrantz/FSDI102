class SportSystem {

    public static void main(String args[]) {
        System.out.println("Players System");

        Player p1 = new Player(); // first object

        // p1.name = "Mike";
        p1.setName("Mike");
        p1.age = 30;
        p1.nationality = "Panamanian";
        p1.position = "Forward";
        p1.salary = 100000000.99;
        p1.team = "Panama National Team";

        System.out.println("Player 1: " + p1.getName() + " , " + p1.team);

        Player p2 = new Player();

        // p2.name = "Ivan";
        p2.setName("Ivan");
        p2.age = 31;
        p2.nationality = "Domanican";
        p2.position = "Forward";
        p2.salary = 10000000.99;
        p2.team = "Republic of Dominica National Team";

        System.out.println("Player 2: " + p2.getName() + " , " + p2.team);

        p1.teamChange("U.S. National Team");

        System.out.println("Player 1: " + p1.getName() + " , " + p1.team);

    }
}