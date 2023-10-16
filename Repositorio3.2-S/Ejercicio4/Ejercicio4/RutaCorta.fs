module RutaCorta

let grafo = [
    ("i", ["a"; "b"], ["7"; "3"]);
    ("a", ["i"; "c"; "d"], ["1"; "4"; "2"]);
    ("b", ["i"; "c"; "d"], ["1"; "1"; "4"]);
    ("c", ["a"; "b"; "x"], ["2"; "8"; "4"]);
    ("d", ["a"; "b"; "f"], ["3"; "2"; "6"]);
    ("f", ["d"], ["9"]);
    ("x", ["c"], ["2"])
]


let miembro elem lista =
    List.exists (fun x -> x = elem) lista
    
let rec vecinos nodo grafo =
    match grafo with
    | [] -> []
    | (head, neighbors, _)::rest ->
        if head = nodo then neighbors
        else vecinos nodo rest

let extender (ruta) (grafo) = 
    List.filter
        (fun x -> x <> [])
        (List.map  (fun x -> if (miembro x ruta) then [] else x::ruta) (vecinos (List.head ruta) grafo)) 

let rec prof2 (ini) (fin) (grafo) =
    let rec prof_aux (fin) (ruta) (grafo) =
        if List.isEmpty ruta then []
        elif (List.head (List.head ruta)) = fin then
            List.rev (List.head ruta) :: prof_aux fin ((extender (List.head ruta) grafo) @ (List.tail ruta)) grafo       
        else
            prof_aux fin ((List.tail ruta) @ (extender (List.head ruta) grafo)) grafo
    prof_aux fin [[ini]] grafo

let rec obtener_peso (from) (_to) (grafo) : int =
    match grafo with
    | [] -> 0
    | (head, items, weights)::_ ->
        if head = from then
            let index = List.findIndex (fun x -> x = _to) items
            if (List.item index weights) = "" then 0
            else int (List.item index weights)
        else obtener_peso from _to (List.tail grafo)

let calcular_pesos (rutas) (grafo) : int list =
    let rec calcular_peso (ruta) (grafo) (peso) : int =
        match ruta with
        | [] -> 0
        | [_] -> peso 
        | x::y::rest -> 
            let peso = peso + obtener_peso x y grafo
            calcular_peso (y::rest) grafo peso
    List.map (fun x -> calcular_peso x grafo 0) rutas

let ruta_corta (ini) (fin) (grafo) =
    let rutas = prof2 ini fin grafo
    let pesos = calcular_pesos rutas grafo
    let index = List.findIndex (fun x -> x = List.min pesos) pesos 
    List.item index rutas

let peso_de_ruta (ruta) = 
    match ruta with
    | [] -> 0 
    | [_] -> 0 
    | _ ->
        let rec calcular_peso ruta peso =
            match ruta with
            | [] -> peso
            | [ _ ] -> peso
            | nodo1 :: nodo2 :: resto_ruta ->
                let peso_arista = obtener_peso nodo1 nodo2 grafo
                if peso_arista = 0 then 0 
                else calcular_peso (nodo2 :: resto_ruta) (peso + peso_arista)
        calcular_peso ruta 0

