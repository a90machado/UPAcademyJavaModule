package io.altar.stateMachine.states;

public class MenuInicial implements State{

	@Override
	public int execute() {
		System.out.println("1 Products: ");
		System.out.println("2 Shelfs: ");
		System.out.println("3 Sair: ");
		
		int [] validOptions = {1,2,3};
		
		return scannerUtils.getValidIntFromScanner("Select one of the options: ", validOptions);
	}
	
}
