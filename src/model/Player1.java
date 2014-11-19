package model;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.SimpleBehaviour;
import jade.lang.acl.ACLMessage;

public class Player1 extends Agent {

	boolean game = true;
	public static final AID[] trucoPlayers = {
			new AID("player2",AID.ISLOCALNAME)
	};


	@Override
	public void setup()
	{
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
			ACLMessage call_to_game = new ACLMessage(ACLMessage.REQUEST);
			//call_to_game.addReceiver(trucoPlayers[0]);
			while(game)
			{
				call_to_game.addReceiver(trucoPlayers[0]);
				call_to_game.setContent("Quer ser minha dupla?");
				send(call_to_game);
				System.out.println("message send");
				game = false;


			}
			// TODO Auto-generated method stub

		}

		@Override
		public boolean done() {
			// TODO Auto-generated method stub
			return false;
		}
	}
}
