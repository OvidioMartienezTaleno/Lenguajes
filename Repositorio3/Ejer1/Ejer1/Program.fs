open Microsoft.FSharp.Collections
open Microsoft.FSharp.Core
let rec agregar(lista : int list) n=
    let mutable resul = []
    if n <= 0 then
        lista
      
    else
        resul <- 0:: lista
        agregar (resul)(n-1)

let rec agregarIzq (lista : int list) n=
    let mutable resul = []
    if n <= 0 then
        lista
      
    else
        resul <- lista @ [0]
        agregarIzq (resul)(n-1)

        
let desplazar (direccion : string, despla : int, listas : int list)=
    let mutable newList = []
    let cantidad = listas.Length
    
       
    match direccion with
    | "izq" ->
        if despla >= cantidad then
            let lis = agregar newList cantidad
            printfn "Lista por la izquierda: %A, con despalzamiento de:  %d" lis despla
            printfn "Original: %A" listas
        
        else
            
            let mutable con = despla+1; 
            for e in listas do
                if con <= cantidad then
                    newList <- List.append newList [listas.Item(con-1)];
                con <- con+1
            
            let lis = agregarIzq newList despla
            printfn "Lista por la izquierda: %A,con despalazamiento de %d:" lis despla
            printfn "Original: %A" listas
            

            
   
    | "der" ->
        if despla < cantidad then 
            let mutable cont = 0;
            for e in listas do
                if cont < (cantidad-despla) then
                    newList <- List.append newList [e]
                cont <- cont + 1
                              
                
            let lis = agregar newList despla
            printfn "Lista por la derecha: %A,con despalazamiento de %d:" lis despla
            printfn "original: %A" listas
        
        else
            let lis = agregar newList cantidad
            printfn "Lista por la derecha: %A, con despalzamiento de:  %d" lis despla

        
    | _ ->
        failwith "La dirección debe ser 'izq' o 'der'."

let lista = [1;2;3;4;5]

desplazar("izq" ,3, lista)
printfn ""
desplazar("der", 2, lista)
printfn ""
desplazar("izq", 6, lista)
printfn ""
desplazar("der", 4, lista)