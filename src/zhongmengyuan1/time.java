package zhongmengyuan1;

import java.util.Scanner;

public class time {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String start = sc.next();
		String end=sc.next();
	    String[] startTime = start.split(":");
	    String[] endTime = end.split(":");
	    float startMinu=Float.parseFloat(startTime[0])*60+Float.parseFloat(startTime[1])+Float.parseFloat(startTime[1])/60;
	    float endMinu=Float.parseFloat(endTime[0])*60+Float.parseFloat(endTime[1])+Float.parseFloat(endTime[1])/60;
	    int count=0;
	    for(float i=0;i<23;i++){    	
	    	if(65.454544*i>=startMinu&&65.454544*i<=endMinu){
	    		count++;
	    	}
	    }
	    System.out.println(count);	    	    
	}

}
