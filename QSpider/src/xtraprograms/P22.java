package xtraprograms;

public class P22 {

	public static void main(String[] args) {
		int i,j,k=1,n=0;
		for(i=1;i<=4;i++){
			for(int a=i;a<4;a++){
				System.out.print(" ");
			}
			for(j=1;j<=k;j++){
				if(j<=i){
					n=n+1;
				}
				else {
					n=n-1;
				}
				System.out.print(n);
			}
			n=0;
			k=k+2;
			System.out.println();
		}

	}

}
