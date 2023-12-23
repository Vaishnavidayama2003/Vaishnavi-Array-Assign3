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
		
		System.out.println("The reverse of elements of array is:");
		
		for(int i=0;i<arr1.length;i++){
			int rev=0
			int temp=arr1[i];
			while(temp!=0){
				int rem=temp%10;
				rev=rev*10+rem;
				temp=temp/10;
			}
			System.out.println("The reverse of "+arr1[i]+" is "+rev);
		}
	}
}
