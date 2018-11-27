package io.altar.stateMachine;

import io.altar.stateMachine.states.*;

public class FinishStateMachine {

	private State[] states = {new MenuInicial(), new MenuListarProdutos(), new MenuListarPrateleiras()};
	private int transitionsMatrix [][] = {{1,2}, 	//state 0
										  {0,0,0,0,0}, 	//state 1
										  {0,0,0,0,0}};	//state 2
	private int currentState = 0;
	
	public static void main(String[] args) {
		 FinishStateMachine fsm = new FinishStateMachine();
		 int opcao = 0;
		 
		 while(true){
			 opcao = fsm.states[fsm.currentState].execute();
			 if (fsm.currentState==0 && opcao==3){ break; }
			 fsm.currentState = fsm.transitionsMatrix[fsm.currentState][opcao-1];
		 }

	}

}
