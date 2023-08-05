Zaimplementuj metodę **main(String[])**, która wyświetla w konsoli **true**,
jeśli element w zmiennej **elementValue** występuje w przekazanej tablicy, w przeciwnym razie - **false**.\
**Tablica array nie powinna zmieniać rozmieszczenia swoich elementów.**\
Do wyszukiwania elementu w tablicy potrzebne jest wyszukiwanie binarne.
Aby to zrobić, użyj statycznej metody **Arrays.binarySearch(int[], int) klasy Arrays**. \
Jako pierwszy parametr należy przekazać **posortowaną tablicę**, w której ma zostać wykonane wyszukiwanie,
jako drugi parametr - **szukany element**.
Metoda Arrays.binarySearch(int[], int) **zwraca indeks szukanego elementu**, jeśli taki element znajduje się w tablicy.
Do metody **binarySearch** należy przekazać **posortowaną tablice**.
**Podczas testowania wartości zmiennych będą różne**.

Wymagania:

- Nie zmieniaj rozmieszczenia elementów tablicy array w metodzie main(String[]).
- Po wywołaniu metody main(String[]) wyświetl w konsoli true, jeśli wartość zmiennej elementValue jest zawarta w
  tablicy.
- Po wywołaniu metody main(String[]) wyświetl w konsoli false, jeśli przekazany elementValue nie występuje w tablicy.
- W metodzie main(String[]) użyj wywołania metody Arrays.binarySearch(int[], int).