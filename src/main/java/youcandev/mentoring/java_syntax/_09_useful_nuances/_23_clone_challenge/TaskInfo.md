Aby sprostać hordom Klonów Jacka, spróbujmy sklonować zamek za pomocą pobliskiego portalu magicznego
i rozlokować wszystkich Klonów Jacka w sklonowanych zamkach.\
Aby zapobiec buntowi podczas lokowania, zaszyfrujmy ich identyfikatory, używając **algorytmu hash**,
a klucze umieśćmy w sklonowanych zamkach.

W metodzie handleClones musisz:

* Nadpisać zmienną **identifier** każdemu Jacku z tablicy **jacks**, używając do tego **operacji XOR**
  i pewnego klucza.
* Stworzyć obiekt **Excalibur** i przypisać mu wartość zmiennej **key** z punktu 1.
* Wypełnić tablicę **Excalibur[]** obiektami z punktu 2 i zwrócić ją.

Wymagania:

- Nie można modyfikować klas Jack i Excalibur.
- Metodę handleClones trzeba zaimplementować zgodnie z instrukcją.
