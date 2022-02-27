
public class format {
	static int arr[][]=new int[9][9];
format()
{
	
	for(int i=0;i<9;i++)
	{
		for(int j=0;j<9;j++)
		{
			arr[i][j]=0;
		}
		
	}
}
public void getarr()
{
	for(int i=0;i<9;i++)
	{
		for(int j=0;j<9;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
}
}
