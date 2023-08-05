Dodaj rozwiązanie z poprzedniego zadania tutaj, aby zacząć wykonywać to zadanie.

Nadszedł czas, by aktywować naszą obronną tarczę. \
Aby to zrobić **w klasie NeptuneHunter** musisz dodać **publiczną metodę applyShield(int)**,
która zwraca **wartość typu byte**.\
Ta metoda **przekształca wartość wejściową typu int na wartość typu byte**.\
To efektywne wykorzystanie tarczy zmniejsza przychodzący atak.

Metodę **applyShield(int)** należy wywołać **wewnątrz metody defend(int)**,
przekazując do niej **otrzymaną wartość ataku**.\
Wynik metody **applyShield(int)** będzie określał, o jaką wartość zmniejszy się zasób
życia okrętu - **zmienna health**.\

Jeśli wszystko zostało wykonane prawidłowo, w wyniku wywołania **metody main() klasy SeaBattleField**,
zobaczymy w konsoli, że okręt "Neptune Hunter" wytrzymuje wiele ataków wrogiego okrętu.

**P.S.** W następnej części będziemy odpowiadać na atak.

**Uwaga**: Zwróc uwagę na **importy klas**. Używaj klas **tylko z pakiety, w którym rozwiązujesz zadanie**.

Wymagania:

- W klasie NeptuneHunter musisz stworzyć publiczną metodę applyShield(int). która zwraca wartość typu byte.
- Metoda applyShield(int) należy wywołać wewnątrz metody defend(int), przekazując do niej otrzymaną wartość ataku.
- Podczas wywołania metody defend(int) zmienną health należy zmniejszyć o otrzymaną wartość,
  która jest wynikiem metody applyShield(int).
