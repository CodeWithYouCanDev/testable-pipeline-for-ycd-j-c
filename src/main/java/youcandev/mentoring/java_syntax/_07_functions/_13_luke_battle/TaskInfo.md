Luke został zaatakowany przez tajemniczego Ciemnego Rycerza, który używa złożonej magii atrybutów i metod.
Luke musi pokonać go w bitwie, wykorzystując atrybuty klasy. Próbował on pokonać Ciemnego Rycerza,
ale okazało się to trudniejsze niż się spodziewał.

Aby uzyskać dostęp do prywatnego atrybutu **isDefeated klasy DarkKnight**,
stwórz w tej klasie **publiczną statyczną metodę setIsDefeated(boolean)**,
która będzie przyjmować wartość **true** lub **false** i przypisywać ją do atrybutu **isDefeated klasy DarkKnight**.\
Wywołaj tę metodę z odpowiednią wartością w metodzie main **zamiast odwoływać się bezpośrednio do prywatnego atrybutu**.
Popraw również błąd wywołania metody **displayStatus**.\
Wskazówka: tutaj również konieczne jest użycie **odpowiedniego modyfikatora dostępu**.\
Odkomentuj linijki kodu w klasie **LukeBattle** i popraw ich zgodnie z warunkiem.

Wymagania:

- W klasie DarkKnight musi być zmienna private static boolean isDefeated , zainicjowana przy deklaracji wartością true.
- W klasie DarkKnight musi być stworzona publiczna statyczna metoda setIsDefeated(boolean).
- Wywołanie metody setIsDefeated(boolean) musi przypisywać przekazaną wartość do zmiennej isDefeated klasy DarkKnight.
- W metodzie main klasy Battle powinna być wywołana metoda setIsDefeated(boolean) z odpowiednią wartością.
- Modyfikator dostępu metody displayStatus klasy DarkKnight powinien zostać zmieniony na publiczny.
- W metodzie main klasy Battle powinna być wywołana metoda displayStatus().
- W wyniku działania programu w konsoli powinien zostać wyświetlony komunikat "Luke pokonał Ciemnego Rycerza".