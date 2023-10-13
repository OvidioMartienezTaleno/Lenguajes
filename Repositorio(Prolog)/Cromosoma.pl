persona("Juan", "Smith", [0,0,0,0,0,0,0,1,1,1]).
persona("bob", "Johnson",[1,0,0,0,1,0,0,1,0,1]).
persona("Charlie", "Williams", [0,1,0,0,0,0,0,1,1,0]).
persona("Alice", "Perez", [1,0,1,1,1,0,1,0,1,0]).
persona("David", "Martinez", [0,0,0,1,1,1,1,1,1,1]).
persona("Pedro", "Perez", [1,1,1,1,1,1,1,0,0,0]).
persona("Nathalia", "Alvarez", [1,0,0,1,1,1,1,1,0,0]).
persona("Arturo", "Lopez",[0,0,0,0,1,1,1,0,0,0]).
persona("Jose", "Gonzalez", [1,1,1,1,1,0,0,0,0,0]).
persona("Fabiola", "Zamora", [0,0,1,1,0,1,0,1,0,1]).


% Predicado para calcular la similitud entre dos listas
similitud([], [], 0).
similitud([H1|T1], [H2|T2], N) :-
    similitud(T1, T2, N1),
    N is N1 + (H1 * H2).

% Predicado para encontrar la persona más similar a una muestra
encontrar_persona_similar(Muestra, Nombre, Apellido) :-
    persona(Nombre, Apellido, Caracteristicas),
    similitud(Muestra, Caracteristicas, Similitud),
    not((persona(_, _, OtrasCaracteristicas), similitud(Muestra, OtrasCaracteristicas, OtraSimilitud), OtraSimilitud > Similitud)).

%
%Caso de prueba: encontrar_persona_similar([0,0,1,1,0,1,0,1,0,1], Nombre, Apellido).
