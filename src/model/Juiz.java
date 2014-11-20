package model;

import jade.core.Agent;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.core.behaviours.OneShotBehaviour;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import jade.wrapper.StaleProxyException;

public class Juiz extends Agent{
private static final long serialVersionUID = 3206847208968227199L;
	
	private AgentContainer jogadores;
	
	protected void setup() {
		addBehaviour(new CriandoContainers());
		addBehaviour(new CriandoAgentes());
	}
	
	public class CriandoContainers extends OneShotBehaviour{

		private static final long serialVersionUID = -7764417346591307311L;

		@Override
		public void action() {
			Runtime rt = Runtime.instance();
			ProfileImpl p = new ProfileImpl(true);
			jogadores = rt.createAgentContainer(p);
		}
	}
	
	
	public class CriandoAgentes extends OneShotBehaviour{

		private static final long serialVersionUID = -7774814918503262919L;

		@Override
		public void action() {
			try {
				AgentController jogador1 = jogadores.createNewAgent("jogador1", "model.Player1", null);
				jogador1.start();
				
				AgentController jogador2 = jogadores.createNewAgent("jogador2", "model.Player2", null);
				jogador2.start();
				
				
			} catch (StaleProxyException e) {
				e.printStackTrace();
			}
		}		
	}
}
