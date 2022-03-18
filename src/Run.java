import java.util.Scanner;

public class Run {

    public void runProgram(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter amount of risc analyses you want to make: ");
        RiscAnalyse[] riscAnalyses = new RiscAnalyse[in.nextInt()];

        for (int i = 0; i < riscAnalyses.length; i++) {
            riscAnalyses[i] = new RiscAnalyse();
        }
        System.out.println("RISC ANALYSIS TABLE: ");
        for (int i = 0, j = 1; i < riscAnalyses.length; i++, j++) {
            String colorLevel;
            if (riscAnalyses[i].getSeverity() <= 3){
                colorLevel = LevelOfRiscColors.TEXT_GREEN + "Very low";
            } else if (riscAnalyses[i].getSeverity() <= 9){
                colorLevel = LevelOfRiscColors.TEXT_GREEN + "Low";
            } else if (riscAnalyses[i].getSeverity() <= 16){
                colorLevel = LevelOfRiscColors.TEXT_YELLOW + "Moderate";
            } else if (riscAnalyses[i].getSeverity() <= 19){
                colorLevel = LevelOfRiscColors.TEXT_RED + "High";
            } else {
                colorLevel = LevelOfRiscColors.TEXT_RED + "Very high";
            }
            System.out.printf("# %d: %s:       %d  %d  %d   %s%s\n",j, riscAnalyses[i].getName(), riscAnalyses[i].getProbability(),riscAnalyses[i].getConsequence(),riscAnalyses[i].getSeverity(),colorLevel,LevelOfRiscColors.TEXT_RESET);
        }
    }
    public static void main(String[] args) {
        new Run().runProgram();
    }
}
