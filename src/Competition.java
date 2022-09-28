public class Competition {
  public static void main(String[] args){
      // Rules
      CompetitionRules rules = CompetitionRules.getInstance();
      rules.printRules();
      System.out.println("-----------------------------TeamA---------------------------------------");
      Team teamA = new Team();
      // Name Team
      teamA.nameTeam = "TeamA";
      // State of the programmer object
      teamA.printTeamDetails();
      System.out.println("programmer1----------------------");
      // Programmer teamA n1
      teamA.p1.printProgrammerDetails("Dino"," Java ",1);
      System.out.println("programmer2----------------------");
      // Programmer teamA n2
      teamA.p2.printProgrammerDetails(" Marta "," C ",3);
      System.out.println("-----------------------------TeamB---------------------------------------");
      Team teamB = new Team();
      // name Team
      teamB.nameTeam = " TeamB ";
      // State of the programmer object
      teamB.printTeamDetails();
      System.out.println("programmer1----------------------");
      // programmer TeamB n1
      teamB.p1.printProgrammerDetails(" Roberta "," Javascript ",5);
      System.out.println("programmer2----------------------");
      // programmer TeamB n2
      teamB.p2.printProgrammerDetails(" Giovanni "," C++ ",2);







  }

}
