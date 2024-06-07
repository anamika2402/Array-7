
import java.io.*;
class program10{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number of rows and columns :");
		int rows = Integer.parseInt(br.readLine());
		int arr[][] = new int[rows][rows];
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				arr[i][j] = Integer.parseInt(br.readLine());
			}
		}
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				if((i==0 || i==rows-1) && (j==0 || j==rows-1)){
					System.out.print(arr[i][j]+" , ");
				}
			}
		}
	}
}


