package main

import (
	"fmt"
	"sort"
)

type producto struct {
	nombre   string
	cantidad int
	precio   int
}
type listaProductos []producto

var lProductos listaProductos

var lProductos2 listaProductos

const existenciaMinima int = 10 //la existencia mínima es el número mínimo debajo de el cual se deben tomar eventuales desiciones

func (l *listaProductos) agregarProducto(nombre string, cantidad int, precio int) {
	var prod, p = l.buscarProducto(nombre)

	if prod == -1 && p == nil {
		*l = append(*l, producto{nombre: nombre, cantidad: cantidad, precio: precio})

	} else {
		(*l)[prod].cantidad = (*l)[prod].cantidad + cantidad
		(*l)[prod].precio = precio

	}

	// modificar el código para que cuando se agregue un producto, si este ya se encuentra, incrementar la cantidad
	// de elementos del producto y eventualmente el precio si es que es diferente
}

// Hacer una función adicional que reciba una cantidad potencialmente infinita de productos previamente creados y los agregue a la lista

//===============================================================================================================================================================

func (l *listaProductos) buscarProducto(nombre string) (int, *producto) { //el retorno es el índice del producto encontrado y -1 si no existe
	var err = -1
	var i int
	var p *producto = nil
	for i = 0; i < len(*l); i++ {
		if (*l)[i].nombre == nombre {
			p = &((*l)[i])
			err = 0
		}
	}
	return err, p

}

//modifique la función para que esta vez solo retorne el producto como tal y que retorne otro valor adicional "err" conteniendo un 0 si no hay error y números mayores si existe algún
//tipo de error como por ejemplo que el producto no exista. Una vez implementada la nueva función, cambie los usos de la anterior función en funciones posteriores, realizando los cambios
//que el uso de la nueva función ameriten

func (l *listaProductos) venderProducto(nombre string, cantidad int) {
	var prod, p = l.buscarProducto(nombre)
	if prod != -1 {

		if p.cantidad == 0 {

			for i := 0; i < len(lProductos); i++ {
				if (*l)[i].nombre == nombre {
					*l = append((*l)[:i], (*l)[i+1:]...)

				}
			}
		}
		if p.cantidad >= cantidad {
			p.cantidad = p.cantidad - cantidad

		} else {
			fmt.Println("No hay suficiente cantidad de producto para vender: ",
				p.cantidad, ", solicitado: ", cantidad)
		}

		//modificar para que cuando no haya existencia de cantidad de productos, el producto se elimine de "la lista" y notificar dicha acción
		//modifique posteriormente para que se ingrese de parámetro la cantidad de productos a vender
	}
}

// haga una función para a partir del nombre del producto, se pueda modificar el precio del mismo Pero utilizando la función buscarProducto MODIFICADA PREVIAMENTE
func (l *listaProductos) modificarPrecio(nombre string, valor int) {
	var prod, p = l.buscarProducto(nombre)
	if p != nil && prod != -1 {
		p.precio = valor
	}
}

func llenarDatos() {
	lProductos.agregarProducto("arroz", 18, 2500)
	lProductos.agregarProducto("frijoles", 11, 2000)
	lProductos.agregarProducto("leche", 8, 1200)
	lProductos.agregarProducto("café", 3, 4500)

}

// Lista de productos con existencia menor a la minima.
func (l *listaProductos) listarProductosMínimos() listaProductos {
	for _, prod := range *l {
		if prod.cantidad <= 10 {
			lProductos2 = append(lProductos2, prod)
		}
	}
	return lProductos2
}

// funcion para aagregar productos hasta la existencia minima
func (l *listaProductos) aumentarInventarioDeMinimos(lProductos2 listaProductos) {

	for e := 0; e < len(lProductos2); e++ {

		var prod, p = l.buscarProducto(lProductos2[e].nombre)
		if p != nil && prod != -1 {
			valor := existenciaMinima - p.cantidad
			p.cantidad = p.cantidad + valor

		}

	}

}

func (l *listaProductos) ordenarLista(tipo string) {

	switch tipo {

	//De mayor a manor
	case "cantidad":

		sort.SliceStable(*l, func(e, i int) bool {
			return (*l)[e].cantidad > (*l)[i].cantidad
		})
	//Mas caro a mas barato
	case "precio":

		sort.SliceStable(*l, func(e, i int) bool {
			return (*l)[e].precio > (*l)[i].precio
		})

	case "nombre":

		sort.SliceStable(*l, func(e, i int) bool {
			return (*l)[e].nombre < (*l)[i].nombre
		})
	default:
		fmt.Println("Tipo no valido")
	}
}

func main() {
	llenarDatos()
	fmt.Println("lista original:", lProductos, "\n")

	fmt.Println("Lista de productos menor a lo minimo: ", lProductos.listarProductosMínimos(), "\n")

	lProductos.aumentarInventarioDeMinimos(lProductos2)
	fmt.Println("Modificado:", lProductos, "\n")

	lProductos.ordenarLista("cantidad")
	fmt.Println("Cantidad:", lProductos, ", mayor a menor\n")

	lProductos.ordenarLista("precio")
	fmt.Println("Precio:", lProductos, ", mas caro a mas barato\n")

	lProductos.ordenarLista("nombre")
	fmt.Println("Nombre:", lProductos)

}
