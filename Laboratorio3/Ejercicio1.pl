sumalist([], 0).

sumalist([X|Xs], S) :-
    sumlist(Xs, S1), S is S1 + X.
