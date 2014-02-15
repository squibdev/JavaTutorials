package com.squib.javatuts.learningjava.classesandobjects;

public class LoanCalculator {

	static double loanAmt = 10000;
	static double rate = 0.08;
	static double futureValue = 12000;
	static int numPeriods = 24;

	public double computePayment(double loanAmt, double rate, double futureValue, int numPeriods) {

		double interest = rate / 100.0;
		double partial1 = Math.pow((1 + interest), -numPeriods);
		double denominator = (1 - partial1) / interest;
		double answer = (-loanAmt / denominator) - ((futureValue * partial1) / denominator);

		return answer;
	}

	public static void main(String[] args) {

		LoanCalculator loan = new LoanCalculator();
		double loanPayment = loan.computePayment(loanAmt, rate, futureValue, numPeriods);

		System.out.println("Loan Payment: " + loanPayment);

	}

}
