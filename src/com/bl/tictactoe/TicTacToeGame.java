package com.bl.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
	public static void main(String[] args) {
		System.out.println("welcome to tictactoe problem");
		char[] board = createBoard();
		char option = chooseOption();
		if(option == 'X' || option == 'x'){
			System.out.println("Player symbol");
		}
		else if(option == 'O' || option == 'o'){
			System.out.println("Computer symbol");
		}
		else{
			System.out.println("Enter proper symbol");
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
	private static char chooseOption(){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the symbol");
		char symbol= sc.next().charAt(0);
		return symbol;
	}
}

