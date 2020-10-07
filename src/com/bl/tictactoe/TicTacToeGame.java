package com.bl.tictactoe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {
	public static void main(String[] args) {
		System.out.println("welcome to tictactoe problem");
		Scanner sc = new Scanner(System.in);
		char[] board = createBoard();
		char option = (chooseOption(sc) == 'X') ? 'X' : 'O';
		int toss =startPlay();
		enterValue(board, sc, option);
		showBoard(board);
	}
	// method to decide who will play first
	private static int startPlay() {
		int toss =(int) Math.floor(Math.random()*10)%2;
		if(toss==0){
			System.out.println("player will start");
			return 0;
		}
		else{
			System.out.println("computer will start");
			return 1;
		}
		
	}
	// entering value and printing the board
	private static void enterValue(char[] board, Scanner sc, char option) {
		int userInput;
		while (true) {
			System.out.println("Enter the index you wants to put the value");
			userInput = sc.nextInt();
			if (userInput >= 1 && userInput < 10) {
				if (board[userInput] != ' ') {
					System.out.println("the index is not free");
					break;
				} else {
					board[userInput] = option;
				}
			} else {
				System.out.println("Enter proper index");
			}
		}
	}

	
	// printing the board
	private static void showBoard(char[] board) {
		// TODO Auto-generated method stub
		System.out.println(board[1] + "  |" + board[2] + "  |" + board[3] + "\n" + "-----------" + "\n" + board[4]
				+ "  |" + board[5] + "  |" + board[6] + "\n" + "-----------" + "\n" + board[7] + "  |" + board[8]
				+ "  |" + board[9]);
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
