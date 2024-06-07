import java.io.*;
class program1{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number of rows :");
		int rows = Integer.parseInt(br.readLine());

		int arr[][] = new int[rows][rows];
		System.out.println("Enter the elements in an array :");

		for(int i=0; i<rows; i++){
			for(int j=0; j<rows; j++){
				arr[i][j] = Integer.parseInt(br.readLine());
			}
		}
		for(int i=0; i<rows; i++){
			for(int j=0; j<rows; j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
				


