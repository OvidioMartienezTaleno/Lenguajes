aplanar([], []).
aplanar([X|Resto], L2) :-
    is_list(X), % Verifica si X es una lista
    aplanar(X, AplanadoX), % Aplana la lista X
    aplanar(Resto, RestoAplanado),
    append(AplanadoX, RestoAplanado, L2).
aplanar([X|Resto], [X|RestoAplanado]) :-
    \+ is_list(X), % Si X no es una lista, simplemente lo agregamos a la lista resultante
    aplanar(Resto, RestoAplanado).

%caso de prueba: aplanar([1, [2, [3, 4], 5], [6, [7, 8]], 9], L2).
