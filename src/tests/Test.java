package tests;


import java.util.Scanner;

import util.Creator;
import util.Console;
import item.Item;
import map.Map;

public class Test {
  private static Map mapa;
  private static Item itens;
  public static void main(String args[]){
	  
	  mapa = Creator.creatorMap(1);
	  
	  System.out.println("Fase: " + mapa.getFase());
	  System.out.println("Level: " + mapa.getLevel());
	  
	  itens = Creator.generateEquipment(mapa.getLevel(), "s");
	  
	  Console.printEquip(itens);
  }
}
