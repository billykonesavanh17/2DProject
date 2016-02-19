package pokemon.view;

import pokemon.controller.My2DController;
import javax.swing.*;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

public class PokemonPanel extends JPanel
{
	private My2DController baseController;
	private SpringLayout baseLayout;
	private JTextField rowField;
	private JTextField columnField;
	private JLabel currentPokemonLabel;
	private JTextField editField;
	private JButton changeButton;
	private JButton displayButton;
	private JTable pokemonTable;
	
	public PokemonPanel(My2DController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		
		rowField = new JTextField(5);
		columnField = new JTextField(5);
		editField = new JTextField(15);
		currentPokemonLabel = new JLabel("The current Pokemon");
		changeButton = new JButton("Change the indicated pokemon");
		displayButton = new JButton("Display the indicated pokemon");
	
		setupTable();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	/**
	 * Helper method to load info from the model into the GUI as a 2D array. 
	 */
	private void setupTable()
	{
		String [] columnHeaders = {"Column 0", "Column 1", "Column 2", "Colum 3", "Column 4",};
		DefaultTableModel tableModel = new DefaultTableModel(baseController.getMyPokemons(), columnHeaders);
		pokemonTable = new JTable(tableModel);
		baseLayout.putConstraint(SpringLayout.NORTH, columnField, 59, SpringLayout.SOUTH, pokemonTable);
		baseLayout.putConstraint(SpringLayout.NORTH, pokemonTable, 50, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, pokemonTable, 50, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, pokemonTable, -50, SpringLayout.EAST, this);
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.RED);
		this.add(rowField);
		this.add(columnField);
		this.add(currentPokemonLabel);
		this.add(editField);
		this.add(changeButton);
		this.add(displayButton);
		this.add(pokemonTable);
	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, rowField, 0, SpringLayout.NORTH, columnField);
		baseLayout.putConstraint(SpringLayout.WEST, columnField, 99, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, editField, -256, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, rowField, 0, SpringLayout.WEST, editField);
		baseLayout.putConstraint(SpringLayout.SOUTH, editField, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, currentPokemonLabel, 6, SpringLayout.SOUTH, rowField);
		baseLayout.putConstraint(SpringLayout.WEST, currentPokemonLabel, 21, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, displayButton, -113, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, changeButton, 27, SpringLayout.SOUTH, displayButton);
		baseLayout.putConstraint(SpringLayout.EAST, changeButton, 0, SpringLayout.EAST, displayButton);
		baseLayout.putConstraint(SpringLayout.EAST, displayButton, 0, SpringLayout.EAST, this);
	}
	
	private void setupListeners()
	{
		
	}
}
