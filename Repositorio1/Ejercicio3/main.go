package main

import (
	"fmt"
)

type datos struct {
	valor     int
	direccion int
}

var original = [...]string{"a", "b", "c", "d", "e", "f", "g", "h"}

var modificada []string

func newDato(valor int, direccion int) *datos {

	d := datos{valor: valor, direccion: direccion}
	return &d
}

func girar(datos2 *datos) {

	//0 = izq y 1 = der
	modificada = nil
	if datos2.direccion == 0 {

		for i := 0; i < len(original); i++ {

			if i > datos2.valor {
				modificada = append(modificada, original[i-1])
				if i == len(original)-1 {
					modificada = append(modificada, original[i])
				}

			}
			if i == len(original)-1 && i == datos2.valor {
				modificada = append(modificada, original[i])
			}
		}
		for j := 0; j < len(original); j++ {
			if j < datos2.valor {
				modificada = append(modificada, original[j])
			}
		}
		fmt.Println("Lista original: ", original)
		fmt.Println("Lista modificada: ", modificada)
		fmt.Println("Cantidad de rotaciones: ", datos2.valor)
		fmt.Println("Direccion: ", datos2.direccion, ", Izquierda")

	} else {
		modificada = nil
		for e := 0; e < len(original); e++ {
			modificada = original[len(original)-datos2.valor:]
			//[a, b, c, d, e, f, g, h]

			if datos2.valor == 0 {
				for i := 0; i < len(original); i++ {
					modificada = append(modificada, original[e])
				}
			}
		}

		for o := 0; o < len(original); o++ {
			// forma : [f, g, h, a, b, c, d, e]
			if o < len(original)-datos2.valor {
				modificada = append(modificada, original[o])
			} else {
				break
			}

		}

		/*
			for i := len(original) - datos2.valor - 1; i <= len(original); i-- {
				//forma : [f, g, h, e, d, c, b, a]
				if i >= 0 {
					modificada = append(modificada, original[i])
				} else {
					break
				}

			}
		*/
		fmt.Println("Lista original: ", original)
		fmt.Println("Lista modificada: ", modificada)
		fmt.Println("Cantidad de rotaciones: ", datos2.valor)
		fmt.Println("Direccion: ", datos2.direccion, ", Derecha")

	}

}

func main() {

	//NOTA: No sabía de qué manera quedaba la parte de la derecha por eso hay dos maneras de hacerlo
	girar(newDato(3, 1))
	fmt.Println()
	girar(newDato(3, 0))

}
