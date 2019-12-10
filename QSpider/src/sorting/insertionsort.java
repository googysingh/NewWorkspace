package sorting;

public class insertionsort {

	public static void main(String[] args) {
		int a[]=new int[10];
		populateA(a);
		System.out.println("Array before sorting");
		printA(a);
		isort(a);
		System.out.println();
		System.out.println("Array after sorting");
		printA(a);
	}
		public static void printA(int[] b)
		{
			for(int i=0;i<b.length;i++)
			{
				System.out.print(b[i]+" ");
			}			
		}
			
		public static int[] populateA(int[] b)
			{
					for(int i=0;i<b.length;i++)
					{
						b[i]=(int)(Math.random()*100);
					}	
					return b;
			}

		public static int[] isort(int[] b)
	{
		int i,j,key,temp;
		for(i=1;i<b.length;i++)
		{
			key=b[i];
			j=i-1;
			while(j>=0&&key<b[j])
			{
				temp=b[j];
				b[j]=b[j+1];
				b[j+1]=temp;
				j--;
			}
		}
		return b;
	}
	}
