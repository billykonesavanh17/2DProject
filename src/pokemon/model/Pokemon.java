package pokemon.model;

import java.awt.Color;

public class Pokemon
{
	private int numberOfEvolutions;
	private Color pokemonColor;
	
	public Pokemon()
	{
		this.numberOfEvolutions = 1;
		this.pokemonColor = Color.GREEN;
	}
	
	
	public Pokemon (int numberOfEvolutions, Color pokemonColor)
	{
		
	}
	
	public int getNumberOfEvolutions()
	{
		return numberOfEvolutions;
	}

	public Color getPokemonColor()
	{
		return pokemonColor;
	}
	
	public void setNumberOfEvolutions(int numberOfEvolutions)
	{
		this.numberOfEvolutions = numberOfEvolutions;
	}

	public void setPokemonColor(Color pokemonColor)
	{
		this.pokemonColor = pokemonColor;
	}
	
	public String toString()
	{
		String pokemonDescription = "This pokemon has " + numberOfEvolutions + " evolutions and it's color is " + pokemonColor;
		
		return pokemonDescription;
	}
}
