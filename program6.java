import java.io.*;
class program6{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the number of rows :");
		int rows = Integer.parseInt(br.readLine());

		int arr[][]= new int[rows][rows];
		System.out.print("Enter the elements in an array :");
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				arr[i][j]= Integer.parseInt(br.readLine());
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
				if(arr[i][j]%3 == 0){
					System.out.print(arr[i][j]+",");
				}
			}
		}
	}
}



				
