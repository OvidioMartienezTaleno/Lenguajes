conectado(i,a).
conectado(i,b).
conectado(a,b).
conectado(a,c).
conectado(b,f).
conectado(b,c).
conectado(c,f).

peso(i,a,1).
peso(i,b,4).
peso(a,b,5).
peso(a,c,3).
peso(b,f,8).
peso(b,c,3).
peso(c,f,9).

conectados(X,Y):- conectado(X,Y).
conectados(X,Y):- conectado(Y,X).

ruta(Ini, Fin, Ruta, Peso):- ruta2(Ini, Fin, [], Ruta, 0, Peso).

ruta2(Fin, Fin, _, [Fin], Peso, Peso).
ruta2(Ini, Fin, Visitados, [Ini | Resto], PesoActual, Peso):-
    conectados(Ini, Alguien),
    not(member(Alguien, Visitados)),
    peso(Ini, Alguien, PesoConexion),
    NuevoPeso is PesoActual + PesoConexion,
    ruta2(Alguien, Fin, [Ini | Visitados], Resto, NuevoPeso, Peso).

ruta_mas_corta(Ini, Fin, Ruta, Peso):-
    findall((R, P), ruta(Ini, Fin, R, P), Rutas),
    sort(2, @=<, Rutas, [(Ruta, Peso)|_]).

% caso de prueba todas las rutas: ruta(i,f,Ruta,Peso).
% caso de prueba la ruta mas corta ruta_mas_corta(i, f, Ruta, Peso).
