import java.util.Random;
import java.util.Scanner;

public class RiscAnalyse {
    private String name;
    private int probability, consequence, severity;

    RiscAnalyse(){
        setNameOfRisc();
        setProbability(randomOutput());
        setConsequence(randomOutput());
        setSeverity(probability,consequence);
    }
    public String getName(){
        return name;
    }
    public int getConsequence(){
        return consequence;
    }
    public int getSeverity(){
        return severity;
    }
    public int getProbability(){
        return probability;
    }
    public void setNameOfRisc(){
        Scanner in = new Scanner(System.in);
        System.out.print("Name of analyses: ");
        this.name = in.nextLine();
    }
    public void setProbability(int randomProbability){
        this.probability = randomProbability;
    }
    public void setConsequence(int randomConsequence){
        this.consequence = randomConsequence;
    }
    public void setSeverity(int probability, int consequence) {
        this.severity = probability * consequence;
    }
    public int randomOutput(){
        Random random = new Random();
        return random.nextInt(5) + 1;
    }
}