package class0225;

//import java.util.Arrays;


public class Pokemon implements Comparable<Pokemon>{

  private String name;
  private int pokeIndex;
  private int generation;

  public Pokemon(String nParam, int index, int generation) {
	  this.name = nParam;
	  this.pokeIndex = index;
	  this.generation = generation;
  }
  //Kyle's comment
  public Pokemon() {
	  this.name = "";
	  this.pokeIndex = 0; 
	  this.generation = 0; }
  
  public String getName() {
    return this.name; }
  
  public int getPokeIndex() {
	  return this.pokeIndex; }
  
  public int getGeneration() {
	  return this.generation; }
  
  public void setName(String nParam) {
    this.name = nParam; }

  public void setIndex(int index) {
	  this.pokeIndex = index; }
  
  public void setGeneration(int generation) {
	  this.generation = generation; }
 
//=======================================================================================
  
  public int compareTo(Pokemon otherPokemon) {
	  return this.pokeIndex - otherPokemon.getPokeIndex(); }
  
  public int compareTo2(Pokemon otherPokemon) {
	  return this.generation - otherPokemon.getGeneration(); }
  
}
