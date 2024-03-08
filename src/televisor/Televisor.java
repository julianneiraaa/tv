package televisor;
public class Televisor 

{
	String marca;
	int tamaño;
	boolean encendido;
	String entradas[];
	int volumen;
	int canal;
	
	public Televisor()
	{
		this.encendido = false;
		this.volumen = 0;
		this.canal = 0;
	}
	
	public void encender()
	{
		this.encendido = true;
		System.out.println("el televisor esta encendido");
	}
	
	public void apagar()
	{
		this.encendido = false;
		System.out.println("el televisor esta apagado");
	}
	
	public void volumenmas()
	{
		if (this.encendido)
			if (this.volumen < 50)
			{
				this.volumen++;
			System.out.println("Volumen: "+ this.volumen);
			}
			else 
			{
			System.out.println("Volumen maximo alcanzado ");	
			}}
		
	public void volumenmenos()
		{
			if (this.encendido)
				if (this.volumen > 0)
				{
					this.volumen--;
				System.out.println("Volumen: "+ this.volumen);
				}
				else 
				{
				System.out.println("Volumen minimo alcanzado ");	
				}}
			
	public void canalmas()
			{
				if (this.encendido)
					{
						this.canal++;
					System.out.println("Canal: "+ this.canal);
					}
					
		
	}
	public void canalmenos()
	{
		if (this.encendido)
			if (this.canal > 1)
			{
				this.canal--;
			System.out.println("Canal: "+ this.volumen);
			}
			else 
			{
			System.out.println("Canal minimo alcanzado ");	
			}
		
}}