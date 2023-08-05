By zapobiec zatrzymaniu przepływu czasu w naszym wszechświecie, musisz odnaleźć klucz w Labiryncie Czasu.

Klasa **TimeLabyrinth** określa dolny i górny zakres, między którymi znajduje się klucz, który trzeba odnaleźć.\
Te zakresy można użyć do generowania losowego klucza, który następnie trzeba przekazać do metody
**tryKey() klasy TimeLabyrinth**.\
Jeśli próba była nieudana, trzeba użyć **aktualizowanych wartości zakresów (minRange i maxRange)**
do wygenerowania nowego klucza i ponowić próbę. Najprawdopodobniej będziesz musiał zrobić to w pętli.\
Jeśli klucz zostanie znaleziony, metoda **tryKey()** zwróci ten sam klucz, który do niej przekazałeś.
Wtedy możesz zakończyć program, a świat zostanie uratowany!

Wymagania:

- Klasy TimeLabyrinth nie wolno modyfikować.
- Metoda main() powinna wywoływać metodę tryKey(), dopóki nie zwróci ona tego samego klucza,
  który został do niej przekazany.
- Poprawny klucz musi zostać odnaleziony w mniej niż 30 próbach.
