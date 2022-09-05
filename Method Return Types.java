import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       double score1 = read.nextDouble();
       double score2 = read.nextDouble();
       double score3 = read.nextDouble();
       double score4 = read.nextDouble();
       double avgScore = getAverageScore(score1, score2, score3, score4);
       System.out.println(avgScore);
   }
  // the ... used to determine the number of args given
  public static double getAverageScore(double ... kwargs){
	    double temp = 0;
	    for(double x : kwargs){
	        temp +=x;
	    }
	    return temp / kwargs.length;
	}
}
