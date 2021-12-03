package calculator;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class calculatorController {

    @FXML
    private Button bueEqu;

    @FXML
    private Button butBack;

    @FXML
    private Button butClear;

    @FXML
    private Button butDiv;

    @FXML
    private Button butDot;

    @FXML
    private Button butDoubleZero;

    @FXML
    private Button butEight;

    @FXML
    private Button butFive;

    @FXML
    private Button butFour;

    @FXML
    private Button butMin;

    @FXML
    private Button butMul;

    @FXML
    private Button butNegPos;

    @FXML
    private Button butNine;

    @FXML
    private Button butOne;

    @FXML
    private Button butPlus;

    @FXML
    private Button butSeven;

    @FXML
    private Button butSix;

    @FXML
    private Button butThree;

    @FXML
    private Button butTwo;

    @FXML
    private Button butZero;

    @FXML
    private Label calcScreen;
    
    private String screen = "";//the string we'll present
    
    private int NumOfDots =0; // number of dots so we wont allow to many dots in a number
    
    private int NumOfPlus =0;// number of pluses so we wont allow to many pluses in a number
    
    private int NumOfMinus =0;// number of minus so we wont allow to many minus in a number
    
    private int NumOfMult =0;// number of multiply so we wont allow to many multiply in a number
    
    private int NumOfDiv =0;// number of divides so we wont allow to many divides in a number
    
    private String currNum = ""; //current number the user enters
    private float result = 0; // the end result for now
    private int opp = -1; //0 -> plus 1->minus 2->multiply 3->divide

    @FXML
    void addDot(ActionEvent event) //add a dot 
    {
    	if(NumOfDots >= 1)
    	{
    		calcScreen.setText("illegal action! too many dots! claculator resets");
    		screen = "" ;
    	}
    	else
    	{
    		if(currNum.length() == 0)
    		{
    			char dot = '.';
	    		currNum = "0"+ dot;
	    		screen = currNum;
	    		calcScreen.setText(screen);
	    		NumOfDots+=1;
    		}
    		else
    		{
	    		char dot = '.';
	    		screen = screen + dot;
	    		currNum = currNum+ dot;
	    		calcScreen.setText(screen);
	    		NumOfDots+=1;
	    	}
    	}

    }

    @FXML
    void addDoubleZero(ActionEvent event) //add double zero
    {
    	String doubleZero = "00";
    	screen = screen + doubleZero;
    	currNum = currNum + doubleZero;
    	calcScreen.setText(screen);
    	NumOfDiv =0;
		NumOfMult =0;
		NumOfMinus =0;
		NumOfPlus =0;
		NumOfDots =0;

    }

    @FXML
    void addEight(ActionEvent event) 
    {
    	String eight = "8";
    	screen = screen + eight;
    	currNum = currNum + eight;
    	calcScreen.setText(screen);
    	NumOfDiv =0;
		NumOfMult =0;
		NumOfMinus =0;
		NumOfPlus =0;
		NumOfDots =0;

    }

    @FXML
    void addEquals(ActionEvent event)  
    {
    	
    	if (opp == -1)
    	{
    		if(currNum.length() == 0)
    		{
    			calcScreen.setText("");
    			
    		}
    		else
    		{
    			try
    			{
    				float tryNum = Float.parseFloat(currNum);
    				result = result + Float.parseFloat(currNum);
    				screen = Float.toString(result) ;
    	    		calcScreen.setText(screen);
    	    		
    			}
    			catch (NumberFormatException e)
    			{
    				calcScreen.setText("there was an error with the number you entered!"+"\n"
    			+ "calculator has resets");
    			}
	    		
    		}
    	}
    	else
    	{
    		if(currNum.length() == 0)
    		{
    			calcScreen.setText("Error! please enter a second number");
    		}	
    		else
    		{
    			try
    			{
    				float tryNum = Float.parseFloat(currNum); // a float to try and convert currNum into a string and catch for an error
    				switch (opp)
    				{
    				case 0:
    					result = result + Float.parseFloat(currNum);
        				screen = Float.toString(result);
        				calcScreen.setText(screen);
    					break;
    				case 1:
    					result = result - Float.parseFloat(currNum);
        				screen = Float.toString(result);
        				calcScreen.setText(screen);
    					break;
    				case 2:
    					result = result * Float.parseFloat(currNum);
        				screen = Float.toString(result);
        				calcScreen.setText(screen);
    					break;
    				case 3:
    					result = result / Float.parseFloat(currNum);
    					screen = Float.toString(result);
        				calcScreen.setText(screen);
    					break;
    				}
    				opp = -1;
    				NumOfDiv =0;
    				NumOfMult =0;
    				NumOfMinus =0;
    				NumOfPlus =0;
    				NumOfDots =0;
    				currNum = "";
    			}
    			catch (NumberFormatException e)
    			{
    				calcScreen.setText("there was an error with the number you entered!"+"\n"
    			+ "the calculator re-sets");
    				screen.substring(0, screen.length() - currNum.length());
    				
    			}
    			
    		}
    	}
    	opp = -1;
		NumOfDiv =0;
		NumOfMult =0;
		NumOfMinus =0;
		NumOfPlus =0;
		NumOfDots =0;
		screen ="";
		currNum="";
    	
    }
    

    @FXML
    void addFive(ActionEvent event) 
    {
    	calcScreen.setText(screen);
    	String Five = "5";
    	screen = screen + Five;
    	currNum = currNum + Five;
    	calcScreen.setText(screen);
    	NumOfDiv =0;
		NumOfMult =0;
		NumOfMinus =0;
		NumOfPlus =0;
		NumOfDots =0;

    }

    @FXML
    void addFour(ActionEvent event) 
    {
    	calcScreen.setText(screen);
    	String four = "4";
    	screen = screen + four;
    	currNum = currNum + four;
    	calcScreen.setText(screen);
    	NumOfDiv =0;
		NumOfMult =0;
		NumOfMinus =0;
		NumOfPlus =0;
		NumOfDots =0;

    }

    @FXML
    void addNine(ActionEvent event) 
    {
    	calcScreen.setText(screen);
    	String nine = "9";
    	screen = screen + nine;
    	currNum = currNum + nine;
    	calcScreen.setText(screen);
    	NumOfDiv =0;
		NumOfMult =0;
		NumOfMinus =0;
		NumOfPlus =0;
		NumOfDots =0;

    }

    @FXML
    void addOne(ActionEvent event) 
    {
    	calcScreen.setText(screen);
    	String one = "1";
    	screen = screen + one;
    	currNum = currNum + one;
    	calcScreen.setText(screen);
    	NumOfDiv =0;
		NumOfMult =0;
		NumOfMinus =0;
		NumOfPlus =0;
		NumOfDots =0;

    }

    @FXML
    void addSeven(ActionEvent event) 
    {
    	calcScreen.setText(screen);
    	String seven = "7";
    	screen = screen + seven;
    	currNum = currNum + seven;
    	calcScreen.setText(screen);
    	NumOfDiv =0;
		NumOfMult =0;
		NumOfMinus =0;
		NumOfPlus =0;
		NumOfDots =0;

    }

    @FXML
    void addSix(ActionEvent event) 
    {
    	calcScreen.setText(screen);
    	String six = "6";
    	screen = screen + six;
    	currNum = currNum + six;
    	calcScreen.setText(screen);
    	NumOfDiv =0;
		NumOfMult =0;
		NumOfMinus =0;
		NumOfPlus =0;
		NumOfDots =0;

    }

    @FXML
    void addThree(ActionEvent event) 
    {
    	calcScreen.setText(screen);
    	String three = "3";
    	screen = screen + three;
    	currNum = currNum + three;
    	calcScreen.setText(screen);
    	NumOfDiv =0;
		NumOfMult =0;
		NumOfMinus =0;
		NumOfPlus =0;
		NumOfDots =0;

    }

    @FXML
    void addTwo(ActionEvent event) 
    {
    	calcScreen.setText(screen);
    	String two = "2";
    	screen = screen + two;
    	currNum = currNum + two;
    	calcScreen.setText(screen);
    	NumOfDiv =0;
		NumOfMult =0;
		NumOfMinus =0;
		NumOfPlus =0;
		NumOfDots =0;

    }

    @FXML
    void addZero(ActionEvent event) 
    {
    	calcScreen.setText(screen);
    	String zero = "0";
    	screen = screen + zero;
    	currNum = currNum + zero;
    	calcScreen.setText(screen);
    	NumOfDiv =0;
		NumOfMult =0;
		NumOfMinus =0;
		NumOfPlus =0;
		NumOfDots =0;

    }

    @FXML
    void backSpace(ActionEvent event) 
    {
    	calcScreen.setText(screen);
    	if(screen.length() == 0)
    	{
    		calcScreen.setText("there are no numbers to erase :)");
    	}
    	else
    	{
    		screen = screen.substring(0, screen.length() - 1);
    		if(currNum.length() != 0) { currNum = currNum.substring(0, currNum.length() -1) ;}
    		calcScreen.setText(screen);
    	}

    }

    @FXML
    void clearScreen(ActionEvent event) 
    {
    	screen = "";
    	currNum = "";
    	calcScreen.setText(screen);

    }

    @FXML
    void divide(ActionEvent event) 
    {
    	calcScreen.setText(screen);
    	if(NumOfDiv >= 1)
    	{
    		calcScreen.setText("illegal action! too many divides tries! claculator resets");
    		screen = "" ;
    		opp = -1;
    		
    	}
    	else
    	{
    		if(currNum.length() == 0)
    		{
    			calcScreen.setText("Error! please enter a number");
    			opp = -1;
	    		NumOfDiv =0;
	    		NumOfMult =0;
	    		NumOfMinus =0;
	    		NumOfPlus =0;
	    		NumOfDots =0;
	    		screen = "";
    		}
    		else
    		{
    			if(screen.equals(currNum))
    			{
    				result = Float.parseFloat(currNum);
    				String divide = "/";
                	screen = screen + divide;
                	calcScreen.setText(screen);
                	currNum = "";
                	NumOfDiv +=1;
                	opp=3;
    			}
    			else
    			{
	    			String divide = "/";
	            	screen = screen + divide;
	            	result = result / Float.parseFloat(currNum);
	            	currNum = "";
	            	calcScreen.setText(screen);
	            	NumOfDiv +=1;
	            	opp=3;
	    		}
    		}
    		
    	}

    }

    @FXML
    void minus(ActionEvent event) 
    {
    	calcScreen.setText(screen);
    	
    	if(NumOfMinus >= 1)
    	{
    		calcScreen.setText("illegal action! too many minuses tries! claculator resets");
    		screen = "" ;
    		opp = -1;
    		
    	}
    	else
    	{
    		if(currNum.length() == 0)
    		{
    			calcScreen.setText("Error! please enter a number");
    			opp = -1;
	    		NumOfDiv =0;
	    		NumOfMult =0;
	    		NumOfMinus =0;
	    		NumOfPlus =0;
	    		NumOfDots =0;
	    		screen = "";
    		}
    		else
    		{
    			if(screen.equals(currNum))
    			{
    				result = Float.parseFloat(currNum);
    				String minus = "-";
	            	screen = screen + minus;
                	calcScreen.setText(screen);
                	currNum = "";
                	NumOfMinus +=1;
                	opp=1;
    			}
    			else
    			{
	    			String minus = "-";
	            	screen = screen + minus;
	            	result = result - Float.parseFloat(currNum);
	            	currNum = "";
	            	calcScreen.setText(screen);
	            	NumOfMinus +=1;
	            	opp=1;
    			}
    		}
    		
    	}
    	

    }

    @FXML
    void multiplay(ActionEvent event) 
    {
    	calcScreen.setText(screen);

    	if(NumOfMult >= 1)
    	{
    		calcScreen.setText("illegal action! too many multiplys tries! claculator resets");
    		screen = "" ;
    		opp = -1;
    		
    	}
    	else
    	{
    		if(currNum.length() == 0)
    		{
    			calcScreen.setText("Error! please enter a number");
    			opp = -1;
	    		NumOfDiv =0;
	    		NumOfMult =0;
	    		NumOfMinus =0;
	    		NumOfPlus =0;
	    		NumOfDots =0;
	    		screen = "";
    		}
    		else
    		{
    			if(screen.equals(currNum))
    			{
    				result = Float.parseFloat(currNum);
    				String multiply = "*";
		        	screen = screen + multiply;
                	calcScreen.setText(screen);
                	NumOfMult +=1;
                	opp=2;
                	currNum = "";
    			}
    			else
    			{
		    		String multiply = "*";
		        	screen = screen + multiply;
		        	result = result * Float.parseFloat(currNum);
		        	currNum = "";
		        	calcScreen.setText(screen);
		        	NumOfMult+=1;
		        	opp=2;
    			}
    		}
    	}
    	

    }
    

    @FXML
    void negativePositive(ActionEvent event) 
    {
    	calcScreen.setText(screen);
    	if(currNum.length() == 0)
		{
			calcScreen.setText("there are no numbers to +/- too");
		}
		else
		{
	    	float tempNum;
	    	tempNum = Float.parseFloat(currNum) *(-1);
	    	screen = screen.substring(0, screen.length() - currNum.length());
	    	currNum = Float.toString(tempNum);
	    	if(currNum.charAt(currNum.length()-1) == '0') 
	    	{
	    		while(currNum.charAt(currNum.length()-1) == '0')
	    		{
		    		currNum = currNum.substring(0, currNum.length() - 1);
	    		}
	    	}
	    	if(currNum.charAt(currNum.length()-1) == '.'){currNum = currNum.substring(0, currNum.length() - 1);}
	    	
	    	screen = screen + currNum;
	    	calcScreen.setText(screen);
		}

    }

    @FXML
    void plus(ActionEvent event) 
    {
    	calcScreen.setText(screen);
    	if(NumOfPlus >= 1)
    	{
    		calcScreen.setText("illegal action! too many pluses tries! claculator resets");
    		screen = "" ;
    		opp = -1;
    		
    	}
    	else
    	{
    		if(currNum.length() == 0)
    		{
    			calcScreen.setText("Error! please enter a number");
    			opp = -1;
	    		NumOfDiv =0;
	    		NumOfMult =0;
	    		NumOfMinus =0;
	    		NumOfPlus =0;
	    		NumOfDots =0;
	    		screen = "";
    		}
    		else
    		{
	    		String plus = "+";
	        	screen = screen + plus;
	        	result = result + Float.parseFloat(currNum);
	        	currNum = "";
	        	calcScreen.setText(screen);
	        	NumOfPlus+=1;
	        	opp=0;
    		}
    	}
    	

    }

}
