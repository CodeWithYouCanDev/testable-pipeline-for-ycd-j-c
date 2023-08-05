W tym zadaniu Twoim celem jest zaimplementowanie metody **getFortune()** w klasie **FortuneBook**,
która działa jak księga wróżb. \
Wybiera ona losowo odpowiedź na postawione pytania.

W metodzie **getFortune()** użyj metody **nextInt(int)** klasy **Random**,
która powinna zwracać wartości od 0 do 7 włącznie. \
W zależności od wyniku metody **nextInt(int)** zwracany jest jeden z poniższych odpowiedzi:

* 0 -> Z pewnością
* 1 -> Tak, na pewno
* 2 -> Prawdopodobnie
* 3 -> Może tak
* 4 -> Nie teraz
* 5 -> Spróbuj ponownie
* 6 -> Nie sądzę
* 7 -> Wysoce nieprawdopodobne

W przeciwnym razie zwróć **null**.

Wymagania:

- Zaimplementuj metodę getFortune() zgodnie z opisem.