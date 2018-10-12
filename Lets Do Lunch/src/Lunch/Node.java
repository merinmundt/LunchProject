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
				createNode(split[0], split[1]);
				
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
				samStart.add(sNode(split[i]));
			}
			
			lookforSpot();
		}
		
		reader.close();
	}
	
	public Node sNode(String name){
		Node newNode = null;
		newNode.name = name;
		
		return newNode;
	}
	
	public void createNode(String name, String neighbor){
		Node newNode = null;
		Node neighborNode = null;
		
		neighborNode.name = neighbor;
		neightborNode.neighbor = name;
		
		newNode.name = name;
		newNode.neighbor = neighbor;
		
		mapNodes.add(newNode);
		mapNodes.add(neighborNode);
		
	}
	
	public void lookforSpot(){
		
	}
	
}	