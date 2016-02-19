package pokemon.controller;

import java.awt.Color;

import pokemon.model.Pokemon;
import pokemon.view.PokemonFrame;

public class My2DController
{
	private Pokemon [][] myPokemons;
	private PokemonFrame baseFrame;
	
	public My2DController()
	{
		myPokemons = new Pokemon[5][5];
		baseFrame = new PokemonFrame(this);
	}
	
	public void start()
	{
		
	}
	
	private void setupArray()
	{
		for(int row = 0; row < myPokemons.length; row++)
		{
			for(int col = 0; col < myPokemons[0].length; col++);
			{
				myPokemons[row][col] = new Pokemon();
				if(col % 2 == 0)
				{
					myPokemons[row][col].setNumberOfEvolutions(col + 3);
				}
				else
				{
					myPokemons[row][col].setPokemonColor(Color.CYAN);
				}
			}
		}
	}
	
	public Pokemon [][] getMyPokemons()
	{
		return myPokemons;
	}
}
