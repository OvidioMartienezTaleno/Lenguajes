open Microsoft.FSharp.Quotations
open RutaCorta
let RUTA = ruta_corta "i" "x" grafo

printfn "La ruta mas corta es: %A, con un peso de: %d" RUTA  (peso_de_ruta(RUTA))
calcular_pesos()