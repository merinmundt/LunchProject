package LetsDoLunch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


public class Lunch2 {

    public static void main(String[] args) {
        
    	//initializing variables
    	ArrayList<String> mapNodes = new ArrayList<String>();
        String Input = null;
        int AvoidIndex;
        int PeggyIndex = 0;
        int SamIndex = 0;
        ArrayList<String> PeggyNode = new ArrayList<String>();
        ArrayList<String> PeggyNeighbor = new ArrayList<String>();
        ArrayList<String> SamNode = new ArrayList<String>();
        ArrayList<String> SamNeighbor = new ArrayList<String>();
        ArrayList<String> SortSam = new ArrayList<String>();
        ArrayList<String> PeggyPossible = new ArrayList<String>();
        ArrayList<String> SamPossible = new ArrayList<String>();
        String[] AvoidNode;
        String[] PeggyStart;
        String[] SamStart;
       
        //reads in from stdin and add each line to an arraylist. will later parse through
        //to find the individual lists
        try {
        	
        	InputStreamReader in= new InputStreamReader(System.in);
            BufferedReader read = new BufferedReader(in);
            Input = read.readLine();
            while (Input != null) {
            	mapNodes.add(Input);
            }
            read.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
        //finding where to split arraylist to read the separate sections
        AvoidIndex = mapNodes.indexOf("Avoid:");
        PeggyIndex = mapNodes.indexOf("Peggy:");
        SamIndex = mapNodes.indexOf("Sam:");
        
        //making the lists of nodes that belong in each of the string arrays
        AvoidNode = mapNodes.get(AvoidIndex + 1).split(" ");
        PeggyStart = mapNodes.get(PeggyIndex + 1).split(" ");
        SamStart = mapNodes.get(SamIndex + 1).split(" ");
        
        //start at 1 to avoid "Map:"
        //Doing for Peggy First
        for(int i = 1; i < AvoidIndex; i++){
        	String[] split = mapNodes.get(i).split(" ");
        	PeggyNode.add(split[0]);
        	PeggyNeighbor.add(split[1]);
        	
        	//making list of nodes backwards for Sam
        	SortSam.add(split[1] + " "+ split[0]);
        }
        
        //sorting for sam
        for(int i = 1; i < SortSam.size(); i++){
        	String[] split = SortSam.get(i).split(" ");
        	SamNode.add(split[0]);
        	SamNeighbor.add(split[1]);
        }
        
        //getting the possible meeting points for both sam and Peggy
        PeggyPossible = getPossible(PeggyNode, PeggyNeighbor, AvoidNode, PeggyStart);
        SamPossible = getPossible(SamNode, SamNeighbor, AvoidNode, SamStart);
        
    }
    
    public static ArrayList<String> getPossible(ArrayList<String> Source, ArrayList<String> Neighbors, String[] AvoidList, String[] StartNodes){
    	ArrayList<String> possible = new ArrayList<String>();
    	Queue<String> listOfConnections = new LinkedList<String>();
    	String current;
    	for(int i = 0; i < StartNodes.length; i++){
    		listOfConnections.add(StartNodes[i]);
    	}
    	
    	
    
    
        	
    	return possible;
    }
}
