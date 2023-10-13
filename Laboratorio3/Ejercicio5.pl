sub_cadenas(_, [], []).
sub_cadenas(Subcadena, [Cadena|Resto], Filtradas) :-
    sub_atom(Cadena, _, _, _, Subcadena), % Verifica si Subcadena es una subcadena de Cadena
    sub_cadenas(Subcadena, Resto, FiltradasResto),
    Filtradas = [Cadena|FiltradasResto].
sub_cadenas(Subcadena, [_|Resto], Filtradas) :-
    sub_cadenas(Subcadena, Resto, Filtradas).


%caso de prueba: sub_cadenas("la", ["la casa", "el perro", "pintando la cerca"], Filtradas).
