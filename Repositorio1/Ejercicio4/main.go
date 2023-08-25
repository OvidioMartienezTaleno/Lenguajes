package main

import "fmt"

type listaZapatos []calzado

var lProductos listaZapatos

type calzado struct {
	marca  string
	talla  int
	precio int
	stock  int
}

func llenar() {
	lProductos = append(lProductos, calzado{marca: "Nike", talla: 41, precio: 45000, stock: 10})
	lProductos = append(lProductos, calzado{marca: "DC", talla: 34, precio: 40000, stock: 0})
	lProductos = append(lProductos, calzado{marca: "Lacoste", talla: 36, precio: 40000, stock: 9})
	lProductos = append(lProductos, calzado{marca: "Puma", talla: 44, precio: 42000, stock: 11})
	lProductos = append(lProductos, calzado{marca: "Reebok", talla: 39, precio: 41000, stock: 12})
	lProductos = append(lProductos, calzado{marca: "Converse", talla: 34, precio: 45000, stock: 13})
	lProductos = append(lProductos, calzado{marca: "Umbro", talla: 36, precio: 46000, stock: 18})
	lProductos = append(lProductos, calzado{marca: "Vans", talla: 38, precio: 50000, stock: 20})
	lProductos = append(lProductos, calzado{marca: "Adidas", talla: 44, precio: 30000, stock: 5})
	lProductos = append(lProductos, calzado{marca: "Jordan", talla: 42, precio: 35000, stock: 4})
	lProductos = append(lProductos, calzado{marca: "Jaguar", talla: 36, precio: 37000, stock: 2})
	lProductos = append(lProductos, calzado{marca: "Footy", talla: 35, precio: 49000, stock: 14})

}
func imprimir() {
	fmt.Println("Elementos disponibles:")
	for e := 0; e < len(lProductos); e++ {
		fmt.Println("Elemento:", lProductos[e])
	}
	fmt.Println()

}
func (l *listaZapatos) buscarProducto(marca string) int {
	var result = -1
	var i int
	for i = 0; i < len(*l); i++ {
		if (*l)[i].marca == marca {
			result = i

		}
	}
	return result
}

func (l *listaZapatos) venderProducto(nombre string) {
	var prod = l.buscarProducto(nombre)
	if prod != -1 {

		if (*l)[prod].stock == 0 {
			fmt.Println("No hay pares disponobles para:", (*l)[prod])
		} else {
			(*l)[prod].stock = (*l)[prod].stock - 1
			fmt.Println("Elemento vendido:", (*l)[prod])
		}
	}
}

func main() {
	llenar()
	imprimir()
	lProductos.venderProducto("DC")
	lProductos.venderProducto("Nike")
	lProductos.venderProducto("Footy")
	lProductos.venderProducto("Nike")

}
