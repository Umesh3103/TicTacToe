package com.bl.tictactoe;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class TicTacToeGame {
	public enum User{PLAYER,COMPUTER};
	public enum Conditions{WIN,CONTINUE,TIE};
	public static void main(String[] args) {
		System.out.println("welcome to tictactoe problem");
		Scanner sc = new Scanner(System.in);
		twoPlayers(sc);
	}
	// Gameplay with computer vs player
	private static void twoPlayers(Scanner sc) {
		char toss = sc.next().charAt(0);
		char turn = chooseOption(toss);
		char computerMove = (chooseOption(toss)== 'X')? 'O':'X';
		char[] board=createBoard();
		Conditions gameCondition;
		User player = whoStartFirst();
		boolean flag=true;
		while(flag){
			if(player == User.PLAYER){
				showBoard(board);
				int move1 = playerMove(board,sc);
				gameCondition = gameStatus(board,move1,turn);
				player = User.COMPUTER;
			}
			else{
				int move2 = ComputerMove(board,turn,computerMove);
				gameCondition = gameStatus(board,move2,computerMove);
				player = User.PLAYER;
			}
			if(gameCondition == Conditions.CONTINUE){
				continue;
			}
			flag=false;	
		}
	}
	// computer move
	private static int ComputerMove(char[] board, char turn, char computerMove) {
		int winMove= winningMove(board,computerMove);
		if(winMove!=0){
			return winMove;
		}
		int userMove=winningMove(board,turn);
		if(userMove!=0){
			return userMove;
		}
		int[] cornors={1,3,7,9};
		int cornor = getMove(board,cornors);
		if(cornor!=0){
			return cornor;
		}
		int centre =5;
		if(isCellFree(board,centre)){
			return centre;
		}
		int[] sides= {2,4,6,8};
		int side=getMove(board,sides);
		if(side!=0){
			return side;
		}
		return 0;
	}
	private static int getMove(char[] board, int[] cornors) {
		for(int position=1;position<board.length;position++){
			if(isCellFree(board,cornors[position])){
				return cornors[position];
			}
		}
		return 0;
	}
	// checking game condition after some plays
	private static Conditions gameStatus(char[] board, int position, char turn) {
		play(board,position,turn);
		if(isWinning(board,turn)){
			showBoard(board);
			return Conditions.WIN;
		}
		if(isBoardFull(board)){
			showBoard(board);
			return Conditions.TIE;
		}
		return Conditions.CONTINUE;
	}
	//checking if the board is full or not
	private static boolean isBoardFull(char[] board) {
		for(int position=1;position<board.length;position++){
			if(isCellFree(board,position)){
				return false;
			}
		}
		return true;
	}
	//checking winner of the toss
	private static int checkWinner(char[] board, char toss) {
		if(isWinning(board,toss)){
			System.out.println("Winner is "+toss);
			return 1;
		}
		return 0;
	}
	//Cheking winning conditions
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
	private static User whoStartFirst() {
		int toss =(int) Math.floor(Math.random()*10)%2;
		if(toss==0){
			System.out.println("player will start");
			return User.PLAYER;
		}
		else{
			System.out.println("computer will start");
			return User.COMPUTER;
		}
		
	}
	// player's move
	private static int playerMove(char[] board, Scanner sc) {
		ArrayList<Integer> availableBox = new ArrayList<>();
		for(int index=1;index<10;index++){
			availableBox.add(index);
		}
		int userInput,check;
		while(true){
			System.out.println("Enter the index you wants to put the value");
			userInput = sc.nextInt();
			if(availableBox.contains(userInput) && isCellFree(board,userInput)){
				return userInput;
			}
		}	
	}
	//UC8 checking if it's a winning move or not
	private static int winningMove(char[] board, char toss){
		for(int position=1;position<board.length;position++){
			char[] board1= newBoard(board);
			if(isCellFree(board1,position)){
				play(board1,position,toss);
			}
			if(isWinning(board1,toss)){
				return position;
			}
		}
		return 0;
	}
	//creating a new clone board
	private static char[] newBoard(char[] board) {
		char[] newBoard = board.clone();
		return newBoard;
	}
	//In case of free space putting mark there
	private static void play(char[] board1, int position, char toss) {
		if(isCellFree(board1,position)){
			board1[position]=toss;
		}
	}
	// checking if the cell is free or not
	private static boolean isCellFree(char[] board, int userInput) {
		if(board[userInput]==' '){
			return true;
		}
		return false;
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
	private static char chooseOption(char toss) {
		return Character.toUpperCase(toss);
	}
}
