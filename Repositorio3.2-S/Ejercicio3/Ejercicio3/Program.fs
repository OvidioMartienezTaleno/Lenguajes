let rec n_esimo (n : int) (lista : int list) =
    match n, lista with
    | _, [] -> None  
    | 0, cabeza :: _ -> Some cabeza  
    | _, _ :: resto -> n_esimo (n - 1) resto  

let lista = [1; 2; 3; 4; 5]

printfn"Lista: %A" lista 
let resultado1 = n_esimo 2 lista  
let resultado2 = n_esimo 3 lista  
let resultado3 = n_esimo 6 lista
let resultado4 = n_esimo 5 lista


printfn"Resultado con el numero: %d, valor: %A" 2 resultado1
printfn"Resultado con el numero: %d, valor: %A" 3 resultado2
printfn"Resultado con el numero: %d, valor: %A" 6 resultado3
printfn"Resultado con el numero: %d, valor: %A" 5 resultado4
