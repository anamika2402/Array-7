import java.io.*;
class program8{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the number of rows and columns in an array :");
		int rows = Integer.parseInt(br.readLine());
		int[] arr[] = new int[rows][rows];

		System.out.println("Enter the elements of an array :");
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
		int sum=0;
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				sum = sum + arr[i][rows-1-i];
				break;
			}
		}
		System.out.println("The sum of all secondary diagonal elements is "+sum);
	}
}






