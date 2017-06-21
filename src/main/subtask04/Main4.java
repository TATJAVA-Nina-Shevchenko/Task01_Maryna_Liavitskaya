package main.subtask04;

public class Main4 {

	public static void main(String[] args) {

		if (args.length != 2) {
			System.out.println("please enter 2 arguments : x, y coordinates");
			return;
		}

		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);

		System.out.println(new Main4().isInGraphicArea(x, y));

	}

	public boolean isInGraphicArea(int x, int y) {
		if (y < -3 || y > 4) {
			return false;
		}

		else if ((y < 0 || y == 0) && y >= -3) {
			if (x > 4 || x < -4) {
				return false;
			} else {
				return true;
			}
		}

		else {
			if (x > 2 || x < -2) {
				return false;
			} else {
				return true;
			}
		}
	}

}
