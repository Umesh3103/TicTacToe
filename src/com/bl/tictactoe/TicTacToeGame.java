package com.bl.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
	public static void main(String[] args) {
		System.out.println("welcome to tictactoe problem");
		char[] board = createBoard();
	}

	private static char[] createBoard() {
		char[] board = new char[10];
		for(int position=1;position<10;position++){
			board[position] =' ';
		}
		return board;
	}
}

