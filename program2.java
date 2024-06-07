import java.io.*;
class program2{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number of rows and columns :");
		int rows = Integer.parseInt(br.readLine());
		int arr[][] = new int[rows][rows];

	

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
		int sum=0;
		for(int i=0; i<rows; i++){
			for(int j=0; j<rows; j++){
				sum+=arr[i][j];
			}
		}
		System.out.println("The sum of all the elements in an array is "+sum);
	}
}
				


