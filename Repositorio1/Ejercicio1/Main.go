package main

import (
	"fmt"
	"strings"
)

func leerTexto(texto string) {
	cadena := strings.Fields(texto)

	fmt.Println("Numero de caracteres en el texto: ", len(texto), "\n")
	fmt.Println("Numero de palabras en el texto: ", len(cadena), "\n")
	fmt.Println("Numero de lineas en el texto: ", len(strings.Split(texto, "\n")))
}

func main() {
	texto := `Haga un programa que cuente e indique el número
de caracteres, el número de palabras y el número de líneas
de un texto cualquiera (obtenido de cualquier forma que
considere). Considere hacer el cálculo de las tres variables
en el mismo proceso`

	leerTexto(texto)
}
