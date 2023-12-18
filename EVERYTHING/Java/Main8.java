/* HOW TO TAKE USER INPUT?
ans - using Scanner class
first type -> import java.util.Scanner;
then type -> Scanner sc = new Scanner(System.in); //creating an object of scanner class(more on this later)
then type -> int a = sc.nextInt(); -> to take integer input or type
             //here nextInt() is a method of Scanner class and similarly this class has methods to take input
             // for float, double etc like nextDouble(), nextFloat(), next() for char, nextline() for string
*/

//LOOPS questions only

//nested loops and pattern programs

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    /* to print
	    
	    *****
	    *   *
	    *   *
	    *   *
	    *****
	    
	    */
	    //code
	    /*
	    int n;
	    System.out.print("Enter the number of rows:");
	    Scanner sc = new Scanner(System.in);
	    n=sc.nextInt();
	    
	    for(int i=1; i<=n; i++){
	        for(int j=1; j<=n; j++){
	            if(i==1 || i==n || j==1 || j==n){
	                System.out.print("*");
	            }
	            else{
	                System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }
	    */
	    
	    /* to print
	    
	    *****
	    *   *
	    *****
	    *   *
	    *   *
	    
	    */
	    //code
	    /*
	    int n;
	    System.out.print("Enter the number of rows:");
	    Scanner sc = new Scanner(System.in);
	    n=sc.nextInt();
	    
	    for(int i=1; i<=n; i++){
	        for(int j=1; j<=n; j++){
	            if(i==1 || i==(n+1)/2 || j==1 || j==n){
	                System.out.print("*");
	            }
	            else{
	                System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }
	    
	    */
	    
	    /* to print
	    
	    *   *
	    *   *
	    *****
	    *   *
	    *   *
	    
	    */
	    //code
	    /*
	    int n;
	    System.out.print("Enter the number of rows:");
	    Scanner sc = new Scanner(System.in);
	    n=sc.nextInt();
	    
	    for(int i=1; i<=n; i++){
	        for(int j=1; j<=n; j++){
	            if(i==(n+1)/2 || j==1 || j==n){
	                System.out.print("*");
	            }
	            else{
	                System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }
	    */
	    
	    /* to print
	    
	    *****  *     *****  *       * *****  *   *  *****  *   * 
	      *    *     *   *   *     *  *       * *   *   *  *   *
	      *    *     *   *    *   *   *****    *    *   *  *   *
	      *    *     *   *     * *    *        *    *   *  *   *
	    *****  ***** *****      *     *****    *    *****  *****
	    
	    */
	    //code 
	    int n;
	    System.out.print("Enter the number of rows:");
	    Scanner sc = new Scanner(System.in);
	    n=sc.nextInt();
	    System.out.println();
	    System.out.println();
	    System.out.println();
	    System.out.println();
	    System.out.println();
	    System.out.println();
	    System.out.println();
	    System.out.println();
	    System.out.println();
	    System.out.println();
	    for(int i=1; i<=n; i++){
	        
	        for(int j=1; j<=18; j++){
	                System.out.print(" ");
	        }
	        
	        //1
	        
	        for(int j=1; j<=n; j++){
	            if(i==n || i==1 || j==(n+1)/2){
	                System.out.print("*");
	            }
	            else{
	                System.out.print(" ");
	            }
	        }
	        
	        System.out.print("     ");
	        
	        //2
	        
	        for(int j=1; j<=n; j++){
	            if(i==n || j==1){
	                System.out.print("*");
	            }
	            else{
	                System.out.print(" ");
	            }
	        }
	        
	        System.out.print(" ");
	        
	        //3
	        
	        for(int j=1; j<=n; j++){
	            if(i==1 || i==n || j==1 || j==n){
	                System.out.print("*");
	            }
	            else{
	                System.out.print(" ");
	            }
	        }
	        
	        System.out.print(" ");
	        
	        //4
	        
	        for(int j=1; j<=(2*n-1); j++){
	            if(j==i || j==((2*n-1)-i+1)){
	                System.out.print("*");
	            }
	            else{
	                System.out.print(" ");
	            }
	        }
	        
	        System.out.print(" ");
	        
	        //5
	        
	        for(int j=1; j<=n; j++){
	            if(i==(n+1)/2 || i==1 || i==n || j==1){
	                System.out.print("*");
	            }
	            else{
	                System.out.print(" ");
	            }
	        }
	        
	        System.out.print("     ");
	        
	        //6
	        
	        for(int j=1; j<=n; j++){
	            if(n%2!=0){
	                if( (i<(n+1)/2 && j==n-i+1) || (j==i && i<(n+1)/2) || (i>=(n+1)/2 && j==(n+1)/2) ){
	                    System.out.print("*");
	                }
	                else{
	                    System.out.print(" ");
	                }
	            }
                else{
	            if( (i<(n/2) && j==n-i) || (j==i && i<(n/2)) || (i>=(n/2) && j==(n+1)/2) ){
	                System.out.print("*");
	            }
	            else{
	                System.out.print(" ");
	            }
                }
	        }
	        
	        System.out.print(" ");
	        
	        //7
	        
	        for(int j=1; j<=n; j++){
	            if(i==1 || i==n || j==1 || j==n){
	                System.out.print("*");
	            }
	            else{
	                System.out.print(" ");
	            }
	        }
	        
	        System.out.print(" ");
	       
	        //8 
	        
	        for(int j=1; j<=n; j++){
	            if(j==1 || j==n || i==n){
	                System.out.print("*");
	            }
	            else{
	                System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }
	    
	    System.out.println();
        
	    
	    for(int i=1; i<=n; i++){
	        
	        for(int j=1; j<=21; j++){
	                System.out.print(" ");
	        }
	        	        
	        //1
	        for(int j=1; j<=2*n-1; j++){
	            if(i!=(n+1)/2 && j==n+1-i || (i!=(n+1)/2 && j==n+i-1) || (i==(n+1)/2 && j>=(n+1-i) && j<=(n-1+i))){
	                System.out.print("*");
	            }
	            else{
	                System.out.print(" ");
	            }
	        }
	        
	        System.out.print(" ");
	        
	        //2
	        
	        for(int j=1; j<=n; j++){
	            if(n%2!=0){
	                if( (i<(n+1)/2 && j==n-i+1) || (j==i && i<(n+1)/2) || (i>=(n+1)/2 && j==(n+1)/2) ){
	                    System.out.print("*");
	                }
	                else{
	                    System.out.print(" ");
	                }
	            }
                else{
	            if( (i<(n/2) && j==n-i) || (j==i && i<(n/2)) || (i>=(n/2) && j==(n+1)/2) ){
	                System.out.print("*");
	            }
	            else{
	                System.out.print(" ");
	            }
                }
	        }
	        
	        System.out.print("  ");

	        //3
	        
	        for(int j=1; j<=n; j++){
	            if(i==1 || i==n || j==1 || j==n){
	                System.out.print("*");
	            }
	            else{
	                System.out.print(" ");
	            }
	        }
	        
	        System.out.print("   ");

	        //4
	        
	        for(int j=1; j<=n; j++){
	            if(((i==1 || i==n) && (j>=1 && j<n)) || ((i>1 && i<n) && (j==1 || j==n))){
	                System.out.print("*");
	            }
	            else{
	                System.out.print(" ");
	            }
	        }
	        
	        System.out.print("  ");
	        
	        //5
	        
	        for(int j=1; j<=n; j++){
	            if(i==(n+1)/2 || j==1 || j==n){
	                System.out.print("*");
	            }
	            else{
	                System.out.print(" ");
	            }
	        }
	        System.out.print("   ");
	        
	        //6
	        
	        for(int j=1; j<=n; j++){
	            if(n%2!=0){
	                if( (i<(n+1)/2 && j==n-i+1) || (j==i && i<(n+1)/2) || (i>=(n+1)/2 && j==(n+1)/2) ){
	                    System.out.print("*");
	                }
	                else{
	                    System.out.print(" ");
	                }
	            }
                else{
	            if( (i<(n/2) && j==n-i) || (j==i && i<(n/2)) || (i>=(n/2) && j==(n+1)/2) ){
	                System.out.print("*");
	            }
	            else{
	                System.out.print(" ");
	            }
                }
	        }
	        
	        //7
	        
	        for(int j=1; j<=2*n-1; j++){
	            if(i!=(n+1)/2 && j==n+1-i || (i!=(n+1)/2 && j==n+i-1) || (i==(n+1)/2 && j>=(n+1-i) && j<=(n-1+i))){
	                System.out.print("*");
	            }
	            else{
	                System.out.print(" ");
	            }
	        }
	        
	        System.out.print(" ");
	        System.out.println();
	    }
	    System.out.println();
	    System.out.println();
	    System.out.println();
	    System.out.println();
	    System.out.println();
	    System.out.println();
	    System.out.println();
	    System.out.println();
	    System.out.println();
	    System.out.println();
	}
}
