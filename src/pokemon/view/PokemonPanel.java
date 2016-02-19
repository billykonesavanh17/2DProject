package pokemon.view;

import pokemon.controller.My2DController;
import javax.swing.*;
import java.awt.Color;

public class PokemonPanel extends JPanel
{
	private My2DController baseController;
	private SpringLayout baseLayout;
	private JTextField rowField;
	private JTextField columnField;
	private JLabel currentPokemon;
	private JTextField editField;
	private JButton changeButton;
	private JButton displayButton;
	private JTable pokemonTable;
	
	public PokemonPanel(My2DController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
				
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.RED);
		this.add(rowField);
		this.add(columnField);
		this.add(currentPokemon);
		this.add(displayButton);
	}

	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
