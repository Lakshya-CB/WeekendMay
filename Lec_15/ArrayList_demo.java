package Lec_15;

import java.util.ArrayList;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArrayList_demo {
	public static void main(String[] args) {
		ArrayList<Integer> AL = new ArrayList<Integer>();

		System.out.println(AL);
		AL.add(10);
		System.out.println(AL);
		AL.add(20);

		System.out.println(AL);
		AL.add(30);
		AL.add(40);
		AL.add(50);
		System.out.println(AL);
		System.out.println(AL.size());
		
//		AL[i]
		System.out.println(AL.get(3 ));
		System.out.println(AL.get(AL.size()-1));
		System.out.println(AL);
		System.out.println(AL.set(2, 99));
		System.out.println(AL);
		
		AL.add(AL.size()-1, 10000);
		System.out.println(AL);
	}
}
