package model;

import jade.core.Agent;
import jade.core.behaviours.SimpleBehaviour;
import jade.lang.acl.ACLMessage;

public class Player2 extends Agent {

	boolean game = true;

	@Override
	public void setup()
	{
		System.out.println("OK OK");
		addBehaviour( new pedeTruco(this));
	}

	class pedeTruco  extends SimpleBehaviour
	{

		public pedeTruco(Agent a)
		{
			super(a);

		}

		@Override
		public void action() {
			while(game){
			ACLMessage call_to_game = receive();
			System.out.println("entrou no setup");
			if (call_to_game != null){
				System.out.println("partiu mano");
			}
			else{
				System.out.println("Mensagem nula");
				game = false;
			}

		}
	}

		@Override
		public boolean done() {
			// TODO Auto-generated method stub
		return false;
		}
	}
}
