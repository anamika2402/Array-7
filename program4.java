import java.io.*;
class program4{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number of rows :");
		int rows = Integer.parseInt(br.readLine());

		int arr[][] = new int[rows][rows];
		System.out.println("Enter the array elements :");
		for(int i=0; i<rows; i++){
			for(int j=0; j<rows; j++){
				arr[i][j]=Integer.parseInt(br.readLine());
			}
		}
		for(int i=0; i<rows; i++){
			for(int j=0; j<rows; j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();

		}
		for(int i=0; i<rows; i++){
			int sum=0;

			for(int j=0; j<rows; j++){
				if((i+1)%2!=0){
					sum=sum+arr[i][j];
				}
				
				 
				
			}
			if((i+1)%2!=0){
				System.out.println("Sum of "+(i+1)+" row is "+sum);
			}
		}
	}
}
					

		
				
