package sorting;

public class selectionsort {

	public static void main(String[] args) {
		int a[]=new int[10];
		populateA(a);
		System.out.println("Array before sorting");
		printA(a);
		ssort(a);
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

		public static int[] ssort(int[] b)
	{
		int i,j,minvalue,minindex,temp=0;
		for(i=0;i<b.length;i++)
		{
			minvalue=b[i];
			minindex=i;
			for(j=i;j<b.length;j++)
			{
				if(b[j]<minvalue)
				{
					minindex=j;
					minvalue=b[j];
				}
			}
			if(minvalue<b[i])
			{
				temp=b[i];
				b[i]=b[minindex];
				b[minindex]=temp;
			}
		}
		return b;
	}
	}
