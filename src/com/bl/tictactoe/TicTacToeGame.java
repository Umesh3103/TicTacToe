package com.bl.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
	public static void main(String[] args) {
		System.out.println("welcome to tictactoe problem");
		Scanner sc= new Scanner(System.in);
		char[] board = createBoard();
		char option = chooseOption(sc);
		if(option == 'X' || option == 'x'){
			System.out.println("Player symbol");
		}
		else if(option == 'O' || option == 'o'){
			System.out.println("Computer symbol");
		}
		else{
			System.out.println("Enter proper symbol");
		}
		showBoard(board);
		
	}
	private static void showBoard(char[] board) {
		// TODO Auto-generated method stub
		for(int position = 1; position < 4; position++){
			for(int row = 1; row < 4; row++){
				System.out.print("  |"+board[position]);
			}
			System.out.println();
			System.out.print("-------------");
			System.out.println();
		}
		
	}
	// creating the board
	private static char[] createBoard() {
		char[] board = new char[10];
		for(int position=1;position<10;position++){
			board[position] =' ';
		}
		return board;
	}
	// taking an input character from user and returning to the main
	private static char  chooseOption(Scanner sc){
		System.out.println("Enter the symbol");
		return sc.next().charAt(0);
	}
}

