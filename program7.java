import java.io.*;
class program7{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number of rows and columns :");
		int rows = Integer.parseInt(br.readLine());
		int arr[][] = new int[rows][rows];

		System.out.print("Enter the elements in an array :");

		for(int i=0; i<arr.length; i++){
			for(int j=0;j<arr[i].length; j++){
				arr[i][j] = Integer.parseInt(br.readLine());
			}
		}
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int prod=1;
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				if(i==j){
					prod = prod*arr[i][j];
				}
			}
		}
		System.out.println("Product of all the diagonal elements is "+prod);
	}
}




