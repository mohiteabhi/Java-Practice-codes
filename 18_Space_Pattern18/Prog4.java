import java.io.*;
class Prog4{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rows = Integer.parseInt(br.readLine());
		int temp = rows;
		for(int i = 1; i <= rows; i++){
			for(int sp = 1; sp <= rows - i; sp++){
				System.out.print("\t");
			}
			for(int j = 1; j <= i; j++){
				System.out.print((temp*j) + "\t");	
			}
			System.out.println();
		}
	}
}
/*  3
  3 6 
3 6 9
 */
