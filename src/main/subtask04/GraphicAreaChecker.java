package main.subtask04;

public class GraphicAreaChecker {

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
