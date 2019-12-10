package sorting;

public class bubblesort {

	public static void main(String[] args) {
		int a[]=new int[30];
		populateA(a);
		System.out.println("Array before sorting");
		printA(a);
		bsort(a);
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

		public static int[] bsort(int[] b)
	{
		int i,j,temp=0;
				for(i=0;i<b.length-1;i++)
				{
					for(j=0;j<b.length-1-i;j++)
					{
						if(b[j]>b[j+1])
						{
							temp=b[j];
							b[j]=b[j+1];
							b[j+1]=temp;
						}
			}
		}
		return b;
	}
	}
