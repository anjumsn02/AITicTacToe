
import java.util.Random;
import java.util.Scanner;


/* 	Saad Anjum
 * 	Artificial Intelligence 
 * 	10/18/16
 * 
 *  PROJECT DESCRIPTION:
 *  
 *  This is an Artificial Intelligence Tic-Tac-Toe game.
 * 
 */

public class TicTacToe {

	public static int player;
	static int flag = 0;
	public static String[][] s = new String[9][9]; 

	 
	// Check if Player won
	void check_A(){
	 board q = new board();
	 
	 if(s[0][0]==s[1][0]){
		 if(s[1][0]==s[2][0]){
			 if(s[1][0]=="X"){
				 System.out.print("Player A won the Game :)\n");
				 q.dispbrd();
				 System.exit(0);
			 }
		 }
	 }
	 
	 if(s[0][0]==s[0][1]){
		 if(s[0][0]==s[0][2]){
			 if(s[0][0]=="X"){
				 System.out.print("Player A won the Game :)\n");
				 q.dispbrd();
				 System.exit(0);
			 }
		 }
	 }

	 if(s[1][0]==s[1][1]){
		 if(s[1][0]==s[1][2]){
			 if(s[1][0]=="X"){
				 System.out.print("Player A won the Game :)\n");
				 q.dispbrd();
				 System.exit(0);
			 }
		 }
	 }
	 
	 if(s[2][0]==s[2][1]){
		 if(s[2][0]==s[2][2]){
			 if(s[2][0]=="X"){
				 System.out.print("Player A won the Game :)\n");
				 q.dispbrd();
				 System.exit(0);
			 }
		 }
	 }
	 
	 if(s[0][1]==s[1][1]){
		 if(s[1][1]==s[2][1]){
			 if(s[0][1]=="X"){
				 System.out.print("Player A won the Game :)\n");q.dispbrd();
				 System.exit(0);
			 }
		 }
	 }
	 
	 if(s[0][2]==s[1][2]){
		 if(s[1][2]==s[2][2]){
			 if(s[0][2]=="X"){
				 System.out.print("Player A won the Game :)\n");q.dispbrd();
				 System.exit(0);
			 }
		 }
	 }
	 
	 if(s[0][0]==s[1][1]){
		 if(s[1][1]==s[2][2]){
			 if(s[1][1]=="X"){
				 System.out.print("Player A won the Game :)\n");q.dispbrd();
				 System.exit(0);
			 }
		 }
	 }
	 
	 if(s[0][2]==s[1][1]){
		 if(s[1][1]==s[2][0]){
			 if(s[1][1]=="X"){
				 System.out.print("Player A won the Game :)\n");q.dispbrd();
				 System.exit(0);
			 }
		 }
	 }
	 
	 if(s[0][0]==s[1][0]){
		 if(s[1][0]==s[2][0]){
			 if(s[1][0]=="X"){
				 System.out.print("Player A won the Game :)\n");q.dispbrd();
				 System.exit(0);
			 }
		 }
	 }
	 
	 
	 }

	// Check if computer won
	 void check_Comp(){
	 
	 board q = new board();
	 
	 if(s[0][0]==s[0][1]){
		 if(s[0][0]==s[0][2]){
			 if(s[0][2]=="O"){
				 System.out.print("Computer win the Game :(\n");q.dispbrd();
				 System.exit(0);
			 }
		 }
	 }
	 
	 if(s[1][0]==s[1][1]){
		 if(s[1][0]==s[1][2]){
			 if(s[1][0]=="O"){
				 System.out.print("Computer win the Game :(\n");q.dispbrd();
				 System.exit(0); 
			 }
		 }
	 }
	 
	 if(s[2][0]==s[2][1]){
		 if(s[2][0]==s[2][2]){
			 if(s[2][0]=="O"){
				 System.out.print("Computer win the Game :(\n");q.dispbrd();
				 System.exit(0);
			 }
		 }
	 }
	 
	 if(s[0][1]==s[1][1]){
		 if(s[1][1]==s[2][1]){
			 if(s[0][1]=="O"){
				 System.out.print("Computer win the Game :(\n");q.dispbrd();
				 System.exit(0);
			 }
		 }
	 }
	 
	 if(s[0][2]==s[1][2]){
		 if(s[1][2]==s[2][2]){
			 if(s[0][2]=="O"){
				 System.out.print("Computer win the Game :(\n");q.dispbrd();
				 System.exit(0);
			 }
		 }
	 }
	 
	 if(s[0][0]==s[1][1]){
		 if(s[1][1]==s[2][2]){
			 if(s[1][1]=="O"){
				 System.out.print("Computer win the Game :(\n");q.dispbrd();
				 System.exit(0);
			 }
		 }
	 }
	 
	 if(s[0][2]==s[1][1]){
		 if(s[1][1]==s[2][0]){
			 if(s[0][2]=="O"){
				 System.out.print("Computer win the Game :(\n");q.dispbrd();
				 System.exit(0);
			 }
		 }
	 }
	 
	 if(s[0][0]==s[1][0]){
		 if(s[1][0]==s[2][0]){
			 if(s[1][0]=="X"){
				 System.out.print("Computer win the Game :(\n");q.dispbrd();
				 System.exit(0);
			 }
		 }
	 }
	 
	 
	}

	 
	//----------------------------------------MAIN METHOD-------------------------------------------------------------
	public static void main (String[] args) throws InterruptedException{
	 
	 Scanner s1 = new Scanner (System.in);
	 TicTacToe t =new TicTacToe();
	 AI ai = new AI();
	 
	 int a; 
	 int row,col; //row and column
	 
	 for(int i = 0; i < 3; i++){
		 for(int j = 0; j < 3; j++){
			 s[i][j] = " ";
		 }
	 }
	 
	 System.out.print("Let's play Tic-Tac-Toe \n");

	 board q = new board();
	 int temp =16;
	 for(a = 1; a < 10; a++){
	
		 q.dispbrd();
	 
	 
	 if(a%2 != 0){
		 System.out.println("Enter your move:  (X) (row column) ");
		 player = 21;
		 row= s1.nextInt();
		 col =s1.nextInt();
	 
		 do{
			 if((row < 0 && row > 3)&& (col < 0 && col > 3)){
				 System.out.println("Please try again: ");
				 row= s1.nextInt();
				 col =s1.nextInt();
			 }
	 
			 
			 if(s[row][col]!= " "){
				 System.out.println("Please try again: ");
				 row= s1.nextInt();
				 col =s1.nextInt();
			 }
			 
		 	}while(s[row][col]!= " ");

		 		System.out.println("\n");
		 		t.s[row][col] = "X";
	 			t.check_A();

	 }else{
		 
		 		//Calculating the Min and Max of the available moves and taking the best one  
		 		player = 29;
	 
		 		int [] result = ai.minimax(temp,player );

		 		row = result[1];
		 		col = result[2];
	
		 		System.out.println("\n");
		 		t.s[row][col] = "O";
		 		t.check_Comp();
	 
	 	  }
	 
	 }
	 
	 q.dispbrd();
	 
	 System.out.println("\n");
	 // If both of the check Comp and the check A fail
	 System.out.println("Draw");
	 
	
	}
}	
	
