package medium;

import java.util.*;

class Player {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int W = in.nextInt(); // number of columns.
		int H = in.nextInt(); // number of rows.
		in.nextLine();

		System.err.println("Columns: " + W + ", rows: " + H);

		int rooms[][] = new int[W][H];

		String temp[] = new String[W];

		for (int i = 0; i < H; i++) {
			String LINE = in.nextLine(); // represents a line in the grid and
											// contains W integers. Each integer
											// represents one room of a given
											// type.

			System.err.println("Line: " + LINE);

			temp = LINE.split(" ");

			for (int j = 0; j < W; j++) {
				rooms[j][i] = Integer.valueOf(temp[j]);
			}
		}
		int EX = in.nextInt(); // the coordinate along the X axis of the exit
								// (not useful for this first mission, but must
								// be read).

		// display array
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				System.err.print(rooms[j][i] + " ");
			}
			System.err.println();
		}

		// game loop
		while (true) {
			int XI = in.nextInt();
			int YI = in.nextInt();
			String POS = in.next();

			int type = rooms[XI][YI];

			switch (type) {
			case 0:
				collision(XI, YI);
				break;
			case 1:
				YI++;
				POS = "TOP";
				goDown(XI, YI);
				break;
			case 2:
				if (POS.equals("TOP")) {
					collision(XI, YI);
				} else if (POS.equals("LEFT")) {
					XI++;
					POS = "LEFT";
					goRight(XI, YI);
				} else if (POS.equals("RIGHT")) {
					XI--;
					POS = "RIGHT";
					goLeft(XI, YI);
				}
				break;
			case 3:
				if (POS.equals("TOP")) {
					YI++;
					POS = "TOP";
					goDown(XI, YI);
				} else {
					collision(XI, YI);
				}
				break;
			case 4:
				if (POS.equals("TOP")) {
					XI--;
					POS = "RIGHT";
					goLeft(XI, YI);
				} else if (POS.equals("RIGHT")) {
					YI++;
					POS = "TOP";
					goDown(XI, YI);
				} else {
					stuck(XI, YI);
				}
				break;
			case 5:
				if (POS.equals("TOP")) {
					XI++;
					POS = "LEFT";
					goRight(XI, YI);
				} else if (POS.equals("LEFT")) {
					YI++;
					POS = "TOP";
					goDown(XI, YI);
				} else {
					stuck(XI, YI);
				}
				break;
			case 6:
				if (POS.equals("TOP")) {
					stuck(XI, YI);
				} else if (POS.equals("LEFT")) {
					XI++;
					POS = "LEFT";
					goRight(XI, YI);
				} else if (POS.equals("RIGHT")) {
					XI--;
					POS = "RIGHT";
					goLeft(XI, YI);
				}
				break;
			case 7:
				if (POS.equals("TOP") || POS.equals("RIGHT")) {
					YI++;
					POS = "TOP";
					goDown(XI, YI);
				} else {
					collision(XI, YI);
				}
				break;
			case 8:
				if (POS.equals("RIGHT") || POS.equals("LEFT")) {
					YI++;
					POS = "TOP";
					goDown(XI, YI);
				} else {
					collision(XI, YI);
				}
				break;
			case 9:
				if (POS.equals("TOP") || POS.equals("LEFT")) {
					YI++;
					POS = "TOP";
					goDown(XI, YI);
				} else {
					collision(XI, YI);
				}
				break;
			case 10:
				if (POS.equals("TOP")) {
					XI--;
					POS = "RIGHT";
					goLeft(XI, YI);
				} else if (POS.equals("LEFT")) {
					stuck(XI, YI);
				} else {
					collision(XI, YI);
				}
				break;
			case 11:
				if (POS.equals("TOP")) {
					XI++;
					POS = "LEFT";
					goRight(XI, YI);
				} else if (POS.equals("RIGHT")) {
					stuck(XI, YI);
				} else {
					collision(XI, YI);
				}
				break;
			case 12:
				if (POS.equals("RIGHT")) {
					YI++;
					POS = "TOP";
					goDown(XI, YI);
				} else {
					collision(XI, YI);
				}
				break;
			case 13:
				if (POS.equals("LEFT")) {
					YI++;
					POS = "TOP";
					goDown(XI, YI);
				} else {
					collision(XI, YI);
				}
				break;
			}

		}
	}

	private static void goRight(int xI, int yI) {
		System.err.println("Going RIGHT");

		System.out.println(xI + " " + yI);
	}

	private static void goLeft(int xI, int yI) {
		System.err.println("Going LEFT");

		System.out.println(xI + " " + yI);
	}

	private static void goDown(int xI, int yI) {
		System.err.println("Going DOWN");

		System.out.println(xI + " " + yI);
	}

	private static void stuck(int xI, int yI) {
		System.err.println("STUCK");

	}

	private static void collision(int xI, int yI) {
		System.err.println("COLLISION");

	}
}