Dwuwymiarowa tablica to tablica tablic, co oznacza, że w każdej jej komórce znajduje się odwołanie do pewnej tablicy.
Ale o wiele łatwiej jest ją przedstawić jako tabelę, która ma określoną liczbę wierszy (pierwszy wymiar)
i kolumn (drugi wymiar). W tym zadaniu będziemy tworzyć taki tablicę.

Aby to zrobić, zaimplementuj metodę **main(String[])**, która:

1. Odczytuje z konsoli liczbę **K** - liczbę wierszy tablicy (załóż, że liczba ta będzie większa niż 0,
   nie trzeba jej sprawdzać).
2. Odczytuje **K** liczb z konsoli (dowolne liczby, które będą większe niż 0, nie trzeba sprawdzać).
3. Inicjalizuje dwuwymiarową tablicę multiArray:
    * liczbą wierszy **K**;
    * wiersze - tablicami, których rozmiar odpowiada liczbom wprowadzonym w punkcie 2 (w kolejności wprowadzania).

Przykład:\
**Wprowadzono liczbę 5.**\
**Wprowadzono liczby 1, 7, 5, 9, 3.**\
Otrzymujemy taki tablicę:

[]\
[][][][][][][]\
[][][][][]\
[][][][][][][][][]\
[][][]

Wymagania:

- W klasie powinna być niezainicjowana publiczna statyczna zmienna multiArray typu int[][].
- Metoda main(String[]) powinna odczytywać liczby z klawiatury zgodnie z warunkiem.
- W metodzie main(String[]) utwórz dwuwymiarową tablicę zgodnie z warunkiem.