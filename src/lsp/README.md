# Principio de sustitución de Liskov
Supongase que una empresa desea transicionar su sistema de facturacion fisica a electronica.
Hay una fase de transicion, en donde la empresa puede emitir tanto facturas fisicas como electronicas.

Por lo que el departamento de sistemas ha creado una subclase de Factura, para extender la funcionalidad requerida por la implementacion de este sistema.
| - Factura
| | - Factura Electronica

Al implementarlo de manera rápida los ingenieros olvidan por completo el principio de sustiucion de Liskov. 
> Un programa tiene que tener la capacidad de reemplazar cualquier
> instancia de la clase padre, con una de sus hijas sin tener  efectos negativos.
-Crondose

Analicemos el metodo emitir()
- Factura Tradicional 
``` 
public boolean emitir() {
//Logica para emitir una factura
return true;};
```
- Factura Electronica 
``` 
public boolean emitir() {
		if (numAutorizacion<0) {
			throw new Exception("No se ha pedido autorizacion");
			return false;
		}
		//Logica para emitir
		return true;
	}
```

Al usuario final solo le interesa emitir uan factura por el momento, el no tiene que pedir autorizacion primero ni nada de eso segun las facturas tradicionales. Por tal motivo en este caso, la clase hija no trabaja como el padre.

Para arreglarlo podemos adaptar ese metodo al siguiente:
``` 
public boolean emitir() {
		obtenerAutorizacion();
		//Logica para emitir una factura
		// TODO Auto-generated method stub
		return estadoEmision;
	}
```
De tal forma que sin importar de que sea la Factura normal o electronica, esta se emitirá como siemre, solo quela lógica para emitirla es diferente.