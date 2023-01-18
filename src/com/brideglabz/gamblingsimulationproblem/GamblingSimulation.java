package com.brideglabz.gamblingsimulationproblem;

public class GamblingSimulation {
	public int funds = 0;
	public int bet = 0;

	public static void main(String[] args) {
		System.out.println("Welcome Gambling Simulation Problems");
		GamblingSimulation gambler = new GamblingSimulation();
		gambler.gameInitialise();
	}

	public void gameInitialise() {
		System.out.println("\nInitialising game...");
		funds = 100;
		bet = 1;
		 System.out.println("Funds : $" + funds);
	}
}