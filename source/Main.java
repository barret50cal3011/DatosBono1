import java.util.ArrayList;

public class Main 
{

	static int DATOS_A_INSERTAR = 50*1000*1000;
	static int DATOS_A_ELIMAR = 1000;

	public static void main(String[] args) 
	{

		long start;
		long finish;

		start = System.currentTimeMillis();
		ArrayList<Integer> datos = new ArrayList<>();
		for(int n = 0; n < DATOS_A_INSERTAR; n++) 
		{
			datos.add(n);
		}
		finish = System.currentTimeMillis();
		System.out.println("Tiempo para insertar " + DATOS_A_INSERTAR + " datos: " + (finish - start) + "ms");
    
		start = System.currentTimeMillis();
		for(int n = 0; n < DATOS_A_ELIMAR; n++) 
		{
			datos.remove(datos.size()-1);
		}
		finish = System.currentTimeMillis();
		System.out.println("Tiempo para elminar al final " + DATOS_A_ELIMAR + " datos: " + (finish - start) + "ms");

		for(int i = 0; i < DATOS_A_ELIMAR; i++)
		{
			datos.add(i);
		}

		start = System.currentTimeMillis();
		for(int n = 0; n < DATOS_A_ELIMAR; n++) 
		{
			datos.remove(0);
		}
		finish = System.currentTimeMillis();
		System.out.println("Tiempo para elminar al comienzo " + DATOS_A_ELIMAR + " datos: " + (finish - start) + "ms");

		for(int i = 0; i < DATOS_A_ELIMAR; i++)
		{
			datos.add(i);
		}

		Integer primero;
		Integer medio;
		Integer ultimo;

		start = System.currentTimeMillis();
		primero = datos.get(0);
		finish = System.currentTimeMillis();
		System.out.println("Tiempo para encontrar un dato al comienzo datos: " + (finish - start) + "ms");

		int size = datos.size();
		start = System.currentTimeMillis();
		medio = datos.get(size/2);
		finish = System.currentTimeMillis();
		System.out.println("Tiempo para encontrar un dato a la mitad datos: " + (finish - start) + "ms");

		start = System.currentTimeMillis();
		ultimo = datos.get(size - 1);
		finish = System.currentTimeMillis();
		System.out.println("Tiempo para encontrar un dato al final datos: " + (finish - start) + "ms");

		start = System.currentTimeMillis();
		primero = datos.get(primero);
		finish = System.currentTimeMillis();
		System.out.println("Tiempo para encontrar por Objeto un dato al comienzo datos: " + (finish - start) + "ms");

		start = System.currentTimeMillis();
		medio = datos.get(medio);
		finish = System.currentTimeMillis();
		System.out.println("Tiempo para encontrar por Objeto un dato a la mitad datos: " + (finish - start) + "ms");

		start = System.currentTimeMillis();
		ultimo = datos.get(ultimo);
		finish = System.currentTimeMillis();
		System.out.println("Tiempo para encontrar por Objeto un dato al final datos: " + (finish - start) + "ms");

	}
}