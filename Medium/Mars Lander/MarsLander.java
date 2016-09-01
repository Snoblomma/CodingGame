import java.util.*;
import java.io.*;
import java.math.*;

class MarsLander {

    public static void main(String args[]) {
    	int landStart = 0;
    	int landEnd = 0;
        int ly = 0;
        int lx = 0;
        
        Scanner in = new Scanner(System.in);
        int surfaceN = in.nextInt(); // the number of points used to draw the surface of Mars.
        for (int i = 0; i < surfaceN; i++) {
            int landX = in.nextInt(); // X coordinate of a surface point. (0 to 6999)
            int landY = in.nextInt(); // Y coordinate of a surface point. By linking all the points together in a sequential fashion, you form the surface of Mars.
            
            if(landY != ly && landStart == 0){
                ly = landY;
                lx = landX;
            }
            else if(landY == ly){
                landStart = lx;
                landEnd = landX;
            }
            
            System.err.println(String.format("X:%d Y:%d", landX, landY));
        }



        System.err.println(String.format("%d, %d", landStart, landEnd));

        // game loop
        while (true) {
            int X = in.nextInt();
            int Y = in.nextInt();
            int hSpeed = in.nextInt(); // the horizontal speed (in m/s), can be negative.
            int vSpeed = in.nextInt(); // the vertical speed (in m/s), can be negative.
            int fuel = in.nextInt(); // the quantity of remaining fuel in liters.
            int rotate = in.nextInt(); // the rotation angle in degrees (-90 to 90).
            int power = in.nextInt(); // the thrust power (0 to 4).
      
            //1. going right:
            if(X < landStart){
            	//speed up to 20, if hSpeed < 20
            	if(hSpeed < 20){
            		rotate = -35;
                    power = 4;   
            	}
            	
            	//slow down, if hSpeed > 20
            	else if(hSpeed > 20){
            		//hovering :
            		if(rotate >= -90 && rotate <0){
            		    rotate = 0;   
            		}
                    else if(rotate>=0 && rotate <35){
                        rotate +=7;
                    }
                    
                    else if(rotate > 35 && rotate <= 90){
                        rotate -=7;
                        }
            		power =4;
            	}
            	
            	else if (hSpeed == 20){
            		//hovering :
                    
                        if(vSpeed < 0 && vSpeed > -500)
                        { 
                            rotate = 0;
                            if(power < 4)
                            {
                        		power++;
                        	}
                        	
                        }
                        else if(vSpeed > 0 && vSpeed < 500)
                        {
                            rotate = 0;
                        	if(power > 0)
                        	{
                        	    power--;
                        	}        	
                        }   
            	}
            }
            //2. going left:	
            else if (X > landEnd){
            	//speed up to -20, if hSpeed > -20
            	if(hSpeed > -20){
            		rotate = 35;
                    power = 4;   
            	}
            	
            	//slow down, if hSpeed < -20
            	else if(hSpeed < -20){
            		//hovering :
            		if(rotate <= 90 && rotate >0){
            		    rotate = 0;   
            		}
                    else if(rotate<=0 && rotate > -35){
                        rotate -=7;
                    }
                    
                    else if(rotate < -35 && rotate >= -90){
                        rotate +=7;
                        }
            		power =4;
            	}
            	
            	else if (hSpeed == -20){
            		//hovering :
                    
                    if(vSpeed < 0 && vSpeed > -500)
                    { 
                        rotate = 0;
                        if(power < 4)
                        {
                    		power++;
                    	}
                    	
                    }
                    else if(vSpeed > 0 && vSpeed < 500)
                    {
                        rotate = 0;
                    	if(power > 0)
                    	{
                    	    power--;
                    	}        	
                    }   
            	}
            }
            
            //3. if in place
            else if (X >= landStart && X <= landEnd){
            	rotate = 0;
                if(vSpeed <= -40 && vSpeed > -500)
                {
                	power = 4;
                }
                else if(vSpeed > -40 && vSpeed <= -30)
                {
                	power = 3;
                }       
                else if(vSpeed > -30 && vSpeed <= -20){
                	power = 2;
                }
                else if(vSpeed > -20 && vSpeed < 0){
                	power = 1;
                }
                else if(vSpeed >= 0 && vSpeed <= 500){
                	power = 0;
                }      
            }         

                 	
            System.out.println(String.format("%d %d", rotate, power));
        }
    }
}
