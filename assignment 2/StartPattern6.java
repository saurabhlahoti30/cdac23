import java.util.*;

public class StartPattern6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n=sc.nextInt();
		
		for(int i=n;i>0;i--){
			for(int j=1;j<=n-i;j++){
			 System.out.print(" ");
			}
			
			for(int j=n-i+1;j<=n+i-1;j++){
				 System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
}