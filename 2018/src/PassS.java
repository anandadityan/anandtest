
class PassS 
{
    public static void main(String [] args) 
    {
    	PassS p = new PassS();
    	p.start();
    			
    }
    
    void start(){
    	String s1= "Anand";
    	String s2= fix(s1);  
    	System.out.println(s1+" "+s2);
    }

	

String fix(String s1) 
{
  s1=s1+" "+"Nanjappa";
System.out.println(s1);
	return "Aditya";
	
}
  
}

