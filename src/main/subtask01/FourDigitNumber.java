package main.subtask01;

public class FourDigitNumber {

	int firstDigit;
	int secondDigit;
	int thirdDigit;
	int fourthDigit;

	public FourDigitNumber(int firstDigit, int secondDigit, int thirdDigit, int fourthDigit) {
		this.firstDigit = firstDigit;
		this.secondDigit = secondDigit;
		this.thirdDigit = thirdDigit;
		this.fourthDigit = fourthDigit;
	}

	public boolean compareSum() {
		return (this.firstDigit + this.secondDigit) == (this.thirdDigit + this.fourthDigit);
	}

}
