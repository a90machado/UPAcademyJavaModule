package io.altar.stateMachine.states;

public class MenuListarProdutos implements State {

	@Override
	public int execute() {
		System.out.println("1 Save P: ");
		System.out.println("2 Add P: ");
		System.out.println("3 Remove P: ");
		System.out.println("4 Update P: ");
		System.out.println("5 Back: ");
		
		int [] validOptions = {1,2,3,4,5};
		
		return scannerUtils.getValidIntFromScanner("Select one of the options: ", validOptions);
	}

}
