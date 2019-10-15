import java.util.Scanner;

public class ArrJump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Size: ");
		int size=input.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("arr["+i+"]= ");
			arr[i]=input.nextInt();
		}
		int jump=0;
		int i=0;
		int get;
			for(;;)
			{
				if(i>arr.length)
				{
					//System.out.println(arr[arr.length-1]);
					break;
				}
				if(arr[i]==0)
				{
					jump=-1;
					break;
				}
				if(arr[i]<0)
				{
					if(-(arr[i])==arr[i+arr[i]])
					{
						jump=-1;
						break;
					}
					
					if(-(arr[i])>arr.length-1-i)
					{
						jump=-1;
						break;
					}
				}
				//System.out.println(arr[i]);
				get=arr[i];
				
				jump++;
				i=i+get;
			}
			System.out.println(jump);
	}

}
