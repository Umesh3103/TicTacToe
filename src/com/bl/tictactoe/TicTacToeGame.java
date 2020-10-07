package com.bl.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
	public static void main(String[] args) {
		System.out.println("welcome to tictactoe problem");
		Scanner sc = new Scanner(System.in);
		char[] board = createBoard();
		char option = (chooseOption(sc) == 'X') ? 'O' : 'X';
		showBoard(board);
	}

	private static void showBoard(char[] board) {
		// TODO Auto-generated method stub
		System.out.println(board[1]+"  |"+board[2]+"  |"+board[3]+"\n"+"-----------"+"\n"+board[4]+"  |"+board[5]+"  |"+board[6]+"\n"
				+"-----------"+"\n"+board[7]+"  |"+board[8]+"  |"+board[9]);
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
		return sc.next().charAt(0);
	}
}
