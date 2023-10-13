% Caso base: cuando la lista es vacía, no hay elementos menores ni mayores.
partir([], _, [], []).

% Caso en el que el primer elemento es menor o igual al umbral.
partir([X|Resto], Umbral, [X|Menores], Mayores) :-
    X =< Umbral,
    partir(Resto, Umbral, Menores, Mayores).

% Caso en el que el primer elemento es mayor al umbral.
partir([X|Resto], Umbral, Menores, [X|Mayores]) :-
    X > Umbral,
    partir(Resto, Umbral, Menores, Mayores).



% caso de prueba: partir([2,5,3,6,7,1,6,4],4,Menores,Mayores).
