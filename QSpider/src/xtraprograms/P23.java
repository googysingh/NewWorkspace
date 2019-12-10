package xtraprograms;
//not completed
public class P23 {

	public static void main(String[] args) {
		int i,j,nc=1;
		
		for(i=1;i<=7;i++){
			int start=1,md=nc/2+1;
			for(j=start;j<=nc;j++){
				if(i<4){
					start=i;
				}
				else{
					start=8-i;
				}
				
				System.out.print(start);
				
				
			}
			if(i<4){
			nc=nc+2;
			}
			else{
				nc=nc-2;
			}
			System.out.println();
		}
		}

}
