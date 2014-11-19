package model;

import java.beans.SimpleBeanInfo;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.SimpleBehaviour;
import jade.core.behaviours.TickerBehaviour;


public class Player1 extends Agent {

	boolean game = true;


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
			while(game)
			{
				System.out.println("behavior added");
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

	@Override
	public void addBehaviour(Behaviour b)
	{
		// TODO Auto-generated method stub
		super.addBehaviour(b);
	}

}
