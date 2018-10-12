package Lunch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Node {
	public String neighbor;
	public String name;
	
	List<Node> mapNodes = new ArrayList<Node>();
	List<Node> avoidNode = new ArrayList<Node>();
	List<Node> peggyStart = new ArrayList<Node>();
	List<Node> samStart = new ArrayList<Node>();
	
	
	public void build(){
		Scanner reader = new Scanner(System.in);  
		String inText = reader.nextLine();
		
		while(inText != "Avoid:"){
				if(inText == ""){
					break;
				}
				String[] split = inText.split("\\s+");
				mapNodes.add(createNode(split[0], split[1]));
				
				inText = reader.nextLine();
		}
		
		while(inText != "Peggy"){
			if(inText == ""){
				break;
			}
			String[] split = inText.split("\\s+");
			for(int i = 0; i < split.length; i ++){
				avoidNode.add(sNode(split[i]));
			}
			inText = reader.nextLine();
		}
		
		while(inText != "Sam"){
			if(inText == ""){
				break;
			}
			String[] split = inText.split("\\s+");
			for(int i = 0; i < split.length; i ++){
				peggyStart.add(sNode(split[i]));
			}
			inText = reader.nextLine();
		}
		
		if(inText == ""){
			lookforSpot();
		}
		else{
			String[] split = inText.split("\\s+");
			for(int i = 0; i < split.length; i ++){
			peggyStart.add(sNode(split[i]));
			}
			
			lookforSpot();
		}
		
		
	}
	
	public Node sNode(String name){
		Node newNode = null;
		newNode.name = name;
		
		return newNode;
	}
	
	public Node createNode(String name, String neighbor){
		Node newNode = null;
		newNode.name = name;
		newNode.neighbor = neighbor;
		
		return newNode;
	}
	
	public void lookforSpot(){
		//check for meeting points
	}
	
}	
