package main

import "fmt"

func figura(valor int) {
	if valor%2 == 1 {

		// Parte superior del rombo
		for i := 0; i < valor; i++ {
			for j := 0; j < valor-i-1; j++ {
				fmt.Print(" ")
			}
			for k := 0; k < 2*i+1; k++ {
				fmt.Print("*")
			}
			fmt.Println()
		}

		// Parte inferior del rombo
		for i := valor - 2; i >= 0; i-- {
			for j := 0; j < valor-i-1; j++ {
				fmt.Print(" ")
			}
			for k := 0; k < 2*i+1; k++ {
				fmt.Print("*")
			}
			fmt.Println()
		}

	} else {

		fmt.Println("El numero es par o negativo: ", valor)
	}
}

func main() {
	figura(3)
	fmt.Println("")
}
