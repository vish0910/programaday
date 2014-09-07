import java.util.Random;

/**
 * This Code is written by Vishal Doshi studying at University of Illinois at Chicago
 * in MS in CS program.
 * This belong to daily project named "A program a day". Contact: visdos007@gmail.com
 */

public class RandomWithProbability {
	Random rand;
	float a,b,c,d;	
	public RandomWithProbability() {
		/*Provide the probabilities between 0.0 to 1.0.
		 * Note: the sum of all of the values should be 1.0
		 *
		 * Eg 1: With 4 different events with respective probability
		 * float a = 0.2f;  20% probability 
		 * float b = 0.5f;	30% probability i.e. a+b = 0.2+0.3 =0.5
		 * float c = 0.75f; 25% probability i.e. a+b+c = 0.2+0.3+0.25=0.75
		 * float d = 1.0f; 	25% probability i.e. a+b+c = 0.2+0.3+0.25=0.75
		 * 
		 * Eg 2: With 2 events with respective probability of occurrence. Replace values with -1.0 for the other 2
		 * float a = 0.3f;  30% probability 
		 * float b = 1.0f;	70% probability i.e. a+b = 0.3+0.7 =1.0
		 * float c = -1.0f; 0% probability i.e. -1.0
		 * float d = -1.0f; 0% probability i.e. -1.0
		 */
			
		a = 0.2f;  
		b = 0.5f;
		c = 0.75f;
		d = 1.0f;
		rand=new Random();
	}
	public static void main(String[] args) {
		RandomWithProbability obj = new RandomWithProbability();
		int numberOfRuns=1000;
		int casecounter[]={0,0,0,0,0};
		for(int i =0;i<numberOfRuns;i++)
		{
			int casePerformed =obj.getActionToBePerformed(obj.a, obj.b, obj.c, obj.d);
			switch(casePerformed)
			{
			case 0:{
					System.out.println("Case 1 with probability of "+obj.a+"%");
					casecounter[0]++;
					break;
					}
			case 1:{
					System.out.println("Case 2 with probability of "+obj.b+"%");
					casecounter[1]++;
					break;
					}
			case 2:{
					System.out.println("Case 3 with probability of "+obj.c+"%");
					casecounter[2]++;
					break;
					}
			case 3:{
					System.out.println("Case 4 with probability of "+obj.d+"%");
					casecounter[3]++;
					break;
					}
			
			case 4:{
					System.out.println("Default Case:");
					casecounter[4]++;
					break;
					}
			
			}// End of Switch-cases
		}//End of for-loop
		System.out.println("Results after "+numberOfRuns+ " runs:\n----------------");
		System.out.println("Case 1: "+casecounter[0]);
		System.out.println("Case 2: "+casecounter[1]);
		System.out.println("Case 3: "+casecounter[2]);
		System.out.println("Case 4: "+casecounter[3]);
		System.out.println("Default Case: "+casecounter[4]);
		System.out.println("Exiting:");
		System.out.println("Test2 for git to check the fast-forward push");
		System.out.println("test3");
		System.out.println("Added via Vishal Master");
		System.out.println("Added via Vishal");
		System.out.println("Added via vishal2");
	}
	public int getActionToBePerformed(float a,float b,float c,float d)
	{
		float rf = rand.nextFloat();
		if(rf >= 0.0f && rf<=a )
			return 0; 
		else if(rf > a && rf<=b )
			return 1; 
		else if(rf > b && rf<=c )
			return 2;
		else if(rf > c && rf<=d )
			return 3; 
		return 4;//Default
	}
}
