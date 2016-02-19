package pokemon.view;

import pokemon.controller.My2DController;
import javax.swing.JFrame;

public class PokemonFrame extends JFrame
{
	private My2DController baseController;
	private PokemonPanel basePanel;

	public PokemonFrame(My2DController baseController)
	{
		this.baseController = baseController;
		basePanel = new PokemonPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setTitle("");
		this.setSize(500, 500);
		this.setVisible(true);
		
	}
}
