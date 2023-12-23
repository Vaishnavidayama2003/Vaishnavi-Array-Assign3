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
		
		System.out.println("The armstrong numbers in the array are:");
		
		for(int i=0;i<arr1.length;i++){
			int temp=arr1[i];
			int num=arr1[i];
			int count=0;
			while(temp!=0){
				count++;
				temp=temp/10;
			}
			int sum=0;
			while(num!=0){
				int mult=1;
				int rem=num%10;
				int p=1;
				while(p<=count){
					mult=mult*rem;
					p++;
				}
				sum=sum+mult;
				num=num/10;
			}
			if(sum==arr1[i])
				System.out.println(arr1[i]+" is an armstrong number at index "+i);
		}
	}
}
