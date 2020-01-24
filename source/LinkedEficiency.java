import java.util.LinkedList;

public class LinkedEficiency
{
    static int DATA_TO_INSERT = 50*1000*1000;
    static int DATA_TO_DELIT = 1000;

    public static void main(final String[] args)
    {
        long start;
        long finish;

        final LinkedList<Integer> data = new LinkedList<>(); 
        start = System.currentTimeMillis();
        for(int i = 0; i < DATA_TO_INSERT; i++)
        {
            data.add(i);
        }
        finish = System.currentTimeMillis();
        System.out.println("Tiempo para agregar " + DATA_TO_INSERT + " a un LinkedList: " + (finish - start) + "ms");

        start = System.currentTimeMillis();
        for(int i = 0; i < DATA_TO_DELIT; i++)
        {
            data.remove(data.size() - 1);
        }
        finish = System.currentTimeMillis();
        System.out.println("Tiempo para remover " + DATA_TO_DELIT + " del final de un LinkedList: " + (finish - start) + "ms");

        for(int i = 0; i < DATA_TO_DELIT; i++)
        {
            data.add(i);
        }

        start = System.currentTimeMillis();
        for(int i = 0; i < DATA_TO_DELIT; i++)
        {
            data.remove(0);
        }
        finish = System.currentTimeMillis();
        System.out.println("Tiempo para remover " + DATA_TO_DELIT + " del inicio de un LinkedList: " + (finish - start) + "ms");

        Integer primero;
        Integer medio;
        Integer ultimo;

        start = System.currentTimeMillis();
		primero = data.get(0);
		finish = System.currentTimeMillis();
		System.out.println("Tiempo para encontrar un dato al comienzo datos: " + (finish - start) + "ms");

		int size = data.size();
		start = System.currentTimeMillis();
		medio = data.get(size/2);
		finish = System.currentTimeMillis();
		System.out.println("Tiempo para encontrar un dato a la mitad datos: " + (finish - start) + "ms");

		start = System.currentTimeMillis();
		ultimo = data.get(size - 1);
		finish = System.currentTimeMillis();
        System.out.println("Tiempo para encontrar un dato al final datos: " + (finish - start) + "ms");
        
        start = System.currentTimeMillis();
		primero = data.get(primero);
		finish = System.currentTimeMillis();
		System.out.println("Tiempo para encontrar por Objeto un dato al comienzo datos: " + (finish - start) + "ms");

		start = System.currentTimeMillis();
		medio = data.get(medio);
		finish = System.currentTimeMillis();
		System.out.println("Tiempo para encontrar por Objeto un dato a la mitad datos: " + (finish - start) + "ms");

		start = System.currentTimeMillis();
		ultimo = data.get(ultimo);
		finish = System.currentTimeMillis();
		System.out.println("Tiempo para encontrar por Objeto un dato al final datos: " + (finish - start) + "ms");
    }
}