import java.io.*;
class Prog1_Perfect{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number: ");
		int num = Integer.parseInt(br.readLine());
		
		int sumDiv = 1;
	       for(int i = 2; i < num; i++){
	       		if(num % i == 0){
				sumDiv += i;
			}
	       }
	       if(sumDiv == num){
	       		System.out.println(num + " is a Perfect Number");
	       }
	       else{
	       		System.out.println(num + " not a perfect number");
	       }
	}
}