public class CompetitionRules {
        private static CompetitionRules competitionRule = new CompetitionRules();
    private String competitionRule1 = " Do not copy and paste from StackOverflow! ";
    private String competitionRule2 = " Learn every day! ";
    private String competitionRule3 = " Be the best team! ";
    public void printRules() {
        System.out.println(competitionRule1);
        System.out.println(competitionRule2);
        System.out.println(competitionRule3);
    }
        private CompetitionRules(){}
        public static CompetitionRules getInstance() {
            return competitionRule;
        }



}
