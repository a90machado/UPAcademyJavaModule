package io.altar.stateMachine.states;

public class MenuListarPrateleiras implements State {

	@Override
	public int execute() {
		System.out.println("1 Save S: ");
		System.out.println("2 Add S: ");
		System.out.println("3 Remove S: ");
		System.out.println("4 Update S: ");
		System.out.println("5 Back: ");
		
		int [] validOptions = {1,2,3,4,5};
		
		return scannerUtils.getValidIntFromScanner("Select one of the options: ", validOptions);
	}

}
