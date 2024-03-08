package televisor;
public class Televisor 

{
	String marca;
	int tamaño;
	boolean encendido;
	String entradas;
	int volumen;
	int canal;
	
    public boolean encender()
    {
    	return encendido;
    }
    
    public int volmas()
    {
    	return volumen++;
    }
    
    public int volmenos()
    {
    	return volumen--;
    }
    
    public int canalmas()
    {
    	return canal++;
    }
    
    public int canalmenos()
    {
    	return canal--;
    }
}