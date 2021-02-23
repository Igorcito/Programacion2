/**
 * 
 */
package Tienda;

/**
 * @author IGOR
 *
 */
public class Articulo {

		//ATRIBUTOS:
		private String codigo;
		private String nombre;
		private float precio;
		private int stock;
		
		
		//CONTRUCTORES:
		
		//POR DEFECTO:
		public Articulo()
		{
			
		}			
		
		//CON PARÁMETROS:
		public Articulo(String codigo, String nombre, float precio, int stock)
		{
			setCodigo(codigo);
			setNombre(nombre);
			setPrecio(precio);
			setStock(stock);
		}
		
		
		//GETTERS:
		
		public String getCodigo()
		{
			return codigo;
		}
		
		public String getNombre()
		{
			return nombre;
		}
		
		public float getPrecio ()
		{
			return precio;
		}
		
		public int getStock ()
		{
			return stock;
		}
		
		
		//SETTERS:
		
		public void setCodigo(String codigo)
		{
			this.codigo = codigo;
		}
		
		public void setNombre(String nombre)
		{
			this.nombre = nombre;
		}
		
		public void setPrecio(float precio)
		{
			this.precio = precio;
		}
		
		public void setStock(int stock)
		{
			this.stock = stock;
		}
		
		
		//MÉTODOS:
		
		@Override
		public String toString()
		{
			return "Codigo: " + this.codigo + "\nNombre: " + this.nombre + "\nPrecio: " + this.precio + " €" + "\nStock: " + this.stock;
		}
		
		@Override
		public boolean equals(Object o)
		{	
			if (o == null)
				return false;
			if (this.getClass() != o.getClass())
				return false;
			else
			{
				Articulo a = (Articulo) o;
				if (this.codigo.equals(a.getCodigo()))
					return true;
				else
					return false;
			}
		}
			
		public boolean disponible(int cantidad)
		{
			return cantidad<stock;
		}
			
		
}
