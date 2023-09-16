open System

let rec filter (subcadena : string) (listaCadenas : string list) =
    match listaCadenas with
    | [] -> []  
    | cabeza :: resto -> 
        if cabeza.Contains(subcadena) then
            cabeza :: filter subcadena resto  
        else
            filter subcadena resto  

let sub_cadenas (subcadena : string) (listaCadenas : string list) =
    let resultado = filter subcadena listaCadenas
    resultado

let listaOriginal = ["la casa"; "el perro"; "pintando la cerca"; "el mause"; "la funcion"]
let subcadenaBuscada = "la"

let resultadoFiltrado = sub_cadenas subcadenaBuscada listaOriginal

printfn "Cadenas que contienen '%s': %A" subcadenaBuscada resultadoFiltrado
