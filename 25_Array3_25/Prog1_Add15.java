import java.io.*;
class Prog1_Add15{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size: ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
		System.out.println("Enter Array elements: ");
		for(int i = 0; i < size; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Output: ");
		for(int j = 0; j < size; j++){
			System.out.print(arr[j] + 15 + " ");
		}
	}
}
