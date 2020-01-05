package com.corejava;

import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SwitchCaseDemo {

	private static final Scanner inputStr = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public String textCmd = null;
		Scanner inputStr = new Scanner(System.in);
		System.out.println("Enter Command to Star Engine:-->");
		textCmd =inputStr.nextLine();
		public String newCmd = null;
		Object calobj;
		Date dojob = new Date();
		}
		
	private void switchFn(String newerCmd) {
		// TODO Auto-generated method stub
		switch(textCmd){
		case "start":
			System.out.println("Engine Started....");
			System.out.println("Enter cmd to Wait or Stop");
			newerCmd = inputStr.nextLine();
			switch(newerCmd) {
			case "stop":
				System.out.println("Engine Stoped:");
				break;
			case "wait":
				System.out.println("Engine waited:");
				break;
			}
			break;
		case "time":
			System.out.println(dojob.getTime());
		default:
			System.out.println("Enter a Cmds Like: 'start' 'stop' 'time' 'wait'-->");
		}
		System.out.println("Enter Cmds to Re-Start-->");
		newerCmd = inputStr.nextLine();
		SwitchCaseDemo newStr = new SwitchCaseDemo();
		newStr.switchFn(newerCmd);	

	}

}
