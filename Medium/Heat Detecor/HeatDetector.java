package level2;

import java.util.*;

class HeatDetector {
    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt(); // width of the building.
        int H = in.nextInt(); // height of the building.
        int N = in.nextInt(); // maximum number of turns before game over.
        int X0 = in.nextInt();
        int Y0 = in.nextInt();
        
        //we are building rectangle by two points,the middle of rectangle is the new point to move
        int startX = 0;
        int startY = 0;
        int endX = W-1;
        int endY = H-1;
        int midX = 0;
        int midY = 0;
      
        // game loop
        while (true) {
            String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)
            
            switch (bombDir) {
			case "U":	
				startX = X0;
				endX = X0;
				endY = Y0-1;		
				break;

			case "UR":
				startX = X0+1;
				endY = Y0-1;
				break;
				
			case "R":				
				startY = Y0;
				startX = X0+1;
				endY = Y0;		
				break;
				
			case "DR":
				startX = X0+1;
				startY = Y0+1;
				break;
				
			case "D":
				startX = X0;
				startY = Y0+1;
				endX = X0;
				break;
				
			case "DL":
				startY = Y0+1;
				endX = X0-1;				
				break;
				
			case "L":
				startY = Y0;
				endX = X0-1;
				endY = Y0;		
				break;
				
			case "UL":
				endX = X0-1;
				endY = Y0-1;			
				break;
				
			default:
				break;
			}
            
            midX = (startX + endX)/2;
            midY = (startY + endY)/2;

			System.out.println(String.valueOf(midX) + " " + String.valueOf(midY)); 
			
			//reset:
			X0 = midX;
			Y0 = midY;				
        }
    }   
}