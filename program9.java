import java.io.*;
class program9{
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
		int prime_sum=0;

		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				if(i==j){
					prime_sum+=arr[i][j];
				}
			}
		}
		System.out.println("The sum of all the primary elements is "+prime_sum);

		int second_sum=0;
		                                                                                                                                                              for(int i=0; i<arr.length; i++){                                                                                                                                    for(int j=0; j<arr[i].length; j++){
                                 second_sum+=arr[i][rows-1-i];   
				 break;

                        }
                }
		System.out.println("The sum of all the secondary elements is "+second_sum);
		System.out.println("The product of primary and secondary element diagonal elements is "+prime_sum*second_sum);
	}
}





