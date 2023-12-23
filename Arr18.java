import java.io.*;
class ArrayDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter size of array:");
		int size1=Integer.parseInt(br.readLine());
		
		int arr1[]=new int[size1];
		
		System.out.println("Enter elements in array:");
		
		for(int i=0;i<arr1.length;i++){
			arr1[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.println("The composite numbers in the array are:");
		
		for(int i=0;i<arr1.length;i++){
			int count=0;
			for(int j=1;j<=arr1[i];j++){
				if(arr1[i]%j==0)
					count++;
			}
			if(count>2)
				System.out.println(arr1[i]+" is a composite number at index "+i);
		}
	}
}
