/**
 * 
 */
package Objetos;

/**
 * @author IGOR
 *
 */
public class ReservaTaquilla {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taquilla[] taquilla = new Taquilla[10];
		
		for (int i=0; i<taquilla.length; i++)
		{
			taquilla[i] = new Taquilla(i+1, "Sin asignar", false);
		}
	
		System.out.println(taquilla[0].getNumero());
		System.out.println(taquilla[3].getNumero());
		System.out.println(taquilla[9].getNumero());
		System.out.println(taquilla[2].getCodSocio());
		System.out.println("La taquilla 4 está: " + taquilla[4].getCerrada());
		
		if (!taquilla[4].getCerrada())
		{
			taquilla[4].setCerrada(true);
		}
		
		System.out.println("La taquila 4 está: " + taquilla[4].getCerrada());
		System.out.println(taquilla[4]);
		
	}

}
