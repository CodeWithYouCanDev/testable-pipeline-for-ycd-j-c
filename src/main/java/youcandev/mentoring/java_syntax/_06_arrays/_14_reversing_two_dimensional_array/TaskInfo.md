Zainicjalizuj dwuwymiarową tablicę przy deklaracji dowolnymi wartościami.
Rozmiar tablicy powinien wynosić 3x4 (wysokość-szerokość). Odwróć tablicę **lustrzanie względem centralnego wiersza**.

Na przykład, wypełniłeś tablicę w taki sposób:
> {\
> {1,2,3,4},\
> {4,5,6,7},\
> {7,8,9,0}\
> }

Wtedy lustrzanie obicie tej tablciy będzie wyglądało tak:
> {\
> {7,8,9,0},\
> {4,5,6,7},\
> {1,2,3,4}\
> }

Wymagania:

- W klasie powinna być publiczna statyczna zmienna array typu int[][].
- Zainicjalizuj zmienną array przy deklaracji zgodnie z warunkami.
- Odwróć tablicę array lustrzanie względem centralnego wiersza (patrz przykład w warunkach).