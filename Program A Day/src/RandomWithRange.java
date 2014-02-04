import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * This Code is written by Vishal Doshi studying at University of Illinois at Chicago
 * in MS in CS program.
 * This belong to daily project named "A program a day". Contact: visdos007@gmail.com
 */

/**
 * @author Vish
 *
 */
public class RandomWithRange {

		/**
		 * @param args
		 * @throws IOException 
		 */
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			int max;
			int min;
			int rand;
			String exit="";
			Random r;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			r=new Random();
			while(!exit.equalsIgnoreCase("q"))
			{
				System.out.println("---------------------\nProvide the range:\nMinimum: ");
				min=Integer.parseInt(br.readLine());
				System.out.println("Maximum: ");
				max=Integer.parseInt(br.readLine());
				rand=(int) (min+(r.nextFloat()*(max-min+1)));
				System.out.println("Random number:"+ rand);
				System.out.println("Hit Enter to Continue or Q to Exit");
				exit=br.readLine();
			}
			System.out.println("Exited");
		}

	}

