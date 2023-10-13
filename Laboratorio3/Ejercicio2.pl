subconj([], _).   % Un conjunto vacío es subconjunto de cualquier conjunto.
subconj([X|S], S1) :-
    member(X, S1),  % Verifica si el primer elemento de S está en S1.
    subconj(S, S1). % Llama recursivamente con el resto de los elementos de S.

%% Casos de prueba : subconj([1, 2, 3], [1,2, 3]).true, subconj([1, 2,
%% 3], [2, 3]). false.
