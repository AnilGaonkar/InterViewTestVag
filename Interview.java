package interview;


import java.util.HashSet;

class Planet
{
	String planetNameM="Mercury";
	int NoOfMoonsM=0;
	boolean PlanetHasRingsM=false;
	
	String planetNameV="Venus";
	int NoOfMoonsV=0;
	boolean PlanetHasRingsV=false;
	
	String planetNameE="Earth";
	int NoOfMoonsE=1;
	boolean PlanetHasRingsE=false;
	
	String planetNameJ="Jupitor";
	int NoOfMoonsJ=79;
	boolean PlanetHasRingsJ=true;
	
	String planetNameS="Saturn";
	int NoOfMoonsS=83;
	boolean PlanetHasRingsS=true;
	
	String planetNameU="Uranus";
	int NoOfMoonsU=27;
	boolean PlanetHasRingsU=true;
	
	
	public void Gasses()
	{
		HashSet<String> oSet=new HashSet<String>();
		oSet.add("Nitrogen");
		oSet.add("Oxygen");
		oSet.add("Hydrogen");
		oSet.add("Helium");
		oSet.add("Hydrogen");
		oSet.add("Helium");
		oSet.add("Hydrogen");
		oSet.add("Helium");
		oSet.add("Methane");
		oSet.add("Carbon Dioxide");
		oSet.add("Nitrogen");
		System.out.println(oSet);	
	}
}
public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Planet P = new Planet();
		int MoonCount=0;
		if(P.PlanetHasRingsM)
		{
			MoonCount+=P.NoOfMoonsM;
		}
		if(P.PlanetHasRingsV)
		{
			MoonCount+=P.NoOfMoonsV;
		}
		if(P.PlanetHasRingsE)
		{
			MoonCount+=P.NoOfMoonsE;
		}
		if(P.PlanetHasRingsJ)
		{
			MoonCount+=P.NoOfMoonsJ;
		}
		
		if(P.PlanetHasRingsS)
		{
			MoonCount+=P.NoOfMoonsS;
		}
		if(P.PlanetHasRingsU)
		{
			MoonCount+=P.NoOfMoonsU;
		}
	
		System.out.println(MoonCount);
		P.Gasses();
	}
}
