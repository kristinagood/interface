public class Quiz implements Measurable 
{
	
	private double score;

	   public Quiz(String name, int score)
	   {
	      this.score = score;
	   }


	public double getMeasure()
	   {
	      return score;
	   }

}