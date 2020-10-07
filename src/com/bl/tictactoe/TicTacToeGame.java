package com.bl.tictactoe;

import java.util.Random;
import java.util.Scanner;


public class TicTacToeGame {
	public static void main(String[] args) {
		System.out.println("welcome to tictactoe problem");
		Scanner sc = new Scanner(System.in);
		char[] board = createBoard();
		char toss =whoStartFirst();
		twoPlayers(board,sc,toss);
	}
	
	private static void twoPlayers(char[] board,Scanner sc,char turn) {
		while(true){
			enterValue(board,sc,turn);
			int check = checkWinner(board,turn);
			if(check==1){
				break;
			}
			int value =checkBlockingMove(board,turn);
			int result = checkWinningMove(board,turn);
			if(result ==1){
				break;
			}
			if(value==0){
			if(turn == 'X'){
				turn ='O';
			}
			else{
				turn = 'X';
			}
			}
		}
		showBoard(board);
		checkWinner(board,turn);
	}

	
	private static int checkBlockingMove(char[] board, char turn) {
		int flag=0;
		char move = (turn == 'X')? 'O' : 'X';
		if(board[1]==turn&& board[2]==turn){
			if(board[3]==' '){
				board[3]=move;
				flag=1;
			}
		}
		if(board[2]==turn&& board[3]==turn){
			if(board[1]==' '){
				board[1]=move;
				flag=1;
			}
		}if(board[1]==turn&& board[3]==turn){
			if(board[2]==' '){
				board[2]=move;
				flag=1;
			}
		}if(board[4]==turn&& board[5]==turn){
			if(board[6]==' '){
				board[6]=move;
				flag=1;
			}
		}if(board[4]==turn&& board[6]==turn){
			if(board[5]==' '){
				board[5]=move;
				flag=1;
			}
		}if(board[5]==turn&& board[6]==turn){
			if(board[4]==' '){
				board[4]=move;
				flag=1;
			}
		}if(board[7]==turn&& board[8]==turn){
			if(board[9]==' '){
				board[9]=move;
				flag=1;
			}
		}if(board[7]==turn&& board[9]==turn){
			if(board[8]==' '){
				board[8]=move;
				flag=1;
			}
		}if(board[8]==turn&& board[9]==turn){
			if(board[7]==' '){
				board[7]=move;
				flag=1;
			}
		}if(board[1]==turn&& board[4]==turn){
			if(board[7]==' '){
				board[7]=move;
				flag=1;
			}
		}if(board[1]==turn&& board[7]==turn){
			if(board[4]==' '){
				board[4]=move;
				flag=1;
			}
		}if(board[4]==turn&& board[7]==turn){
			if(board[1]==' '){
				board[1]=move;
				flag=1;
			}
		}if(board[2]==turn&& board[5]==turn){
			if(board[8]==' '){
				board[8]=move;
				flag=1;
			}
		}if(board[2]==turn&& board[8]==turn){
			if(board[5]==' '){
				board[5]=move;
				flag=1;
			}
		}if(board[5]==turn&& board[8]==turn){
			if(board[2]==' '){
				board[2]=move;
				flag=1;
			}
		}if(board[3]==turn&& board[6]==turn){
			if(board[9]==' '){
				board[9]=move;	
				flag=1;
			}
		}if(board[3]==turn&& board[9]==turn){
			if(board[6]==' '){
				board[6]=move;
				flag=1;
			}
		}if(board[6]==turn&& board[9]==turn){
			if(board[3]==' '){
				board[3]=move;
				flag=1;
			}
		}if(board[1]==turn&& board[5]==turn){
			if(board[9]==' '){
				board[9]=move;
				flag=1;
			}
		}if(board[1]==turn&& board[9]==turn){
			if(board[5]==' '){
				board[5]=move;
				flag=1;
			}
		}if(board[5]==turn&& board[9]==turn){
			if(board[1]==' '){
				board[1]=move;
				flag=1;
			}
		}if(board[3]==turn&& board[5]==turn){
			if(board[7]==' '){
				board[7]=move;
				flag=1;
			}
		}if(board[3]==turn&& board[7]==turn){
			if(board[5]==' '){
				board[5]=move;
				flag=1;
			}
		}if(board[5]==turn&& board[7]==turn){
			if(board[3]==' '){
				board[3]=move;
				flag=1;
			}
		}
		showBoard(board);
		return flag;
	}

	private static int checkWinningMove(char[] board, char turn) {
		int flag=0;
		if(board[1]==turn&& board[2]==turn){
			if(board[3]==' '){
				board[3]=turn;
				flag=1;
			}
		}
		if(board[2]==turn&& board[3]==turn){
			if(board[1]==' '){
				board[1]=turn;
				flag=1;
			}
		}if(board[1]==turn&& board[3]==turn){
			if(board[2]==' '){
				board[2]=turn;
				flag=1;
			}
		}if(board[4]==turn&& board[5]==turn){
			if(board[6]==' '){
				board[6]=turn;
				flag=1;
			}
		}if(board[4]==turn&& board[6]==turn){
			if(board[5]==' '){
				board[5]=turn;
				flag=1;
			}
		}if(board[5]==turn&& board[6]==turn){
			if(board[4]==' '){
				board[4]=turn;
				flag=1;
			}
		}if(board[7]==turn&& board[8]==turn){
			if(board[9]==' '){
				board[9]=turn;
				flag=1;
			}
		}if(board[7]==turn&& board[9]==turn){
			if(board[8]==' '){
				board[8]=turn;
				flag=1;
			}
		}if(board[8]==turn&& board[9]==turn){
			if(board[7]==' '){
				board[7]=turn;
				flag=1;
			}
		}if(board[1]==turn&& board[4]==turn){
			if(board[7]==' '){
				board[7]=turn;
				flag=1;
			}
		}if(board[1]==turn&& board[7]==turn){
			if(board[4]==' '){
				board[4]=turn;
				flag=1;
			}
		}if(board[4]==turn&& board[7]==turn){
			if(board[1]==' '){
				board[1]=turn;
				flag=1;
			}
		}if(board[2]==turn&& board[5]==turn){
			if(board[8]==' '){
				board[8]=turn;
				flag=1;
			}
		}if(board[2]==turn&& board[8]==turn){
			if(board[5]==' '){
				board[5]=turn;
				flag=1;
			}
		}if(board[5]==turn&& board[8]==turn){
			if(board[2]==' '){
				board[2]=turn;
				flag=1;
			}
		}if(board[3]==turn&& board[6]==turn){
			if(board[9]==' '){
				board[9]=turn;
				flag=1;
			}
		}if(board[3]==turn&& board[9]==turn){
			if(board[6]==' '){
				board[6]=turn;
				flag=1;
			}
		}if(board[6]==turn&& board[9]==turn){
			if(board[3]==' '){
				board[3]=turn;
				flag=1;
			}
		}if(board[1]==turn&& board[5]==turn){
			if(board[9]==' '){
				board[9]=turn;
				flag=1;
			}
		}if(board[1]==turn&& board[9]==turn){
			if(board[5]==' '){
				board[5]=turn;
				flag=1;
			}
		}if(board[5]==turn&& board[9]==turn){
			if(board[1]==' '){
				board[1]=turn;
				flag=1;
			}
		}if(board[3]==turn&& board[5]==turn){
			if(board[7]==' '){
				board[7]=turn;
				flag=1;
			}
		}if(board[3]==turn&& board[7]==turn){
			if(board[5]==' '){
				board[5]=turn;
				flag=1;
			}
		}if(board[5]==turn&& board[7]==turn){
			if(board[3]==' '){
				board[3]=turn;
				flag=1;
			}
		}
		return flag;
		
	}

	private static int checkWinner(char[] board, char toss) {
		if(isWinning(board,toss)){
			System.out.println("Winner is "+toss);
			return 1;
		}
		return 0;
	}

	private static boolean isWinning(char[] board, char ch) {
			return (board[1] == ch && board[2]==ch && board[3]==ch ||
					board[4] == ch && board[5]==ch && board[6]==ch ||
					board[7] == ch && board[8]==ch && board[9]==ch ||
					board[1] == ch && board[4]==ch && board[7]==ch ||
					board[2] == ch && board[5]==ch && board[8]==ch ||
					board[3] == ch && board[6]==ch && board[9]==ch ||
					board[1] == ch && board[5]==ch && board[9]==ch ||
					board[3] == ch && board[5]==ch && board[7]==ch);
	}
	// method to decide who will play first
	private static char whoStartFirst() {
		int toss =(int) Math.floor(Math.random()*10)%2;
		if(toss==0){
			System.out.println("player will start");
			return 'X';
		}
		else{
			System.out.println("computer will start");
			return 'O';
		}
		
	}
	// entering value and printing the board
	private static void enterValue(char[] board, Scanner sc, char option) {
		int userInput,check;
			System.out.println("Enter the index you wants to put the value");
			userInput = sc.nextInt();
			if (userInput >= 1 && userInput < 10) {
				if (board[userInput] != ' ') {
					System.out.println("the index is not free");
				} else {
					board[userInput] = option;
				}
			} else {
				System.out.println("Enter proper index");
			}
	}

	
	// printing the board
	private static void showBoard(char[] board) {
		// TODO Auto-generated method stub
		System.out.println(board[1]+ "|"+ board[2]+"|" +board[3]+"|\n"+ board[4]+"|"+board[5]+"|"
				+board[6]+"|\n" + board[7]+"|"  + board[8]+"|"
				 + board[9]+"|");
	}

	// creating the board
	private static char[] createBoard() {
		char[] board = new char[10];
		for (int position = 1; position < 10; position++) {
			board[position] = ' ';
		}
		return board;
	}

	// taking an input character from user and returning to the main
	private static char chooseOption(Scanner sc) {
		System.out.println("Enter the symbol");
		return sc.next().toUpperCase().charAt(0);
	}
}
