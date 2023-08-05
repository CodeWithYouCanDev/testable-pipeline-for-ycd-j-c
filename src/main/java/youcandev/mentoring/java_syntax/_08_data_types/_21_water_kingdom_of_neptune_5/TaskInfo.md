Dodaj rozwiązanie z poprzedniego zadania tutaj, aby zacząć wykonywać to zadanie.

Po aktywacji obronnej tarczy obrażenia od uderzeń wrogiego okrętu są minimalne, ale wciąż istnieją.\
To nie może trwać wiecznie. Nadszedł czas, by kontratakować!

W **metodzie main() klasy SeaBattleField**, po aktywacji systemu obrony okrętu **"Neptune Hunter"**  
(wywołanie metody defend(int) dla obiektu klasy NeptuneHunter), **musisz sprawdzić, czy okręt przetrwał**. \
Jeśli tak, w konsoli powinien pojawić się komunikat, że **"Neptune Hunter" kontratakuje (zmienna hunterAttack)**.

Następnie atakuj, wywołując **metodę attack()** dla obiektu klasy **NeptuneHunter**.\
Ponieważ wrogi okręt "Neptune Vortex" posiada własny system obronny,
wywołaj **metodę defend(int)** dla obiektu klasy **NeptuneVortex**, przekazując wynik działania
**metody attack()** obiektu klasy **NeptuneHunter**. Jeśli nie, zakończ pętle.

Bitwa trwa, dopóki wrogi okręt nie zostanie zniszczony (popraw pętle **do-while**).\
Jeśli wszystko zostało wykonane prawidłowo, w wyniku wywołania **metody main()** klasy **SeaBattleField**,
w konsoli zobaczysz, że toczy się wielka bitwa, ale oba okręty wciąż pozostają nietknięte.

**P.S.** W następnej części spróbujmy wykorzystać inne bronie.

**Uwaga**: Zwróc uwagę na **importy klas**. Używaj klas **tylko z pakiety, w którym rozwiązujesz zadanie**.

Wymagania:

- Jeśli okręt "Neptune Hunter" przetrwał wrogi atak, przed wywołaniem metody attack()
  dla obiektu klasy NeptuneHunter, w konsoli powinna się pojawić wartość zmiennej hunterAttack.
- Jeśli okręt "Neptune Hunter" przetrwał wrogi atak, powinieneś wywołać metodę attack()
  dla obiektu klasy NeptuneHunter.
- Jeśli okręt "Neptune Hunter" przetrwał wrogi atak, wywołaj metodę defend(int) dla obiektu klasy NeptuneVortex,
  przekazując wynik działania metody attack() obiektu klasy NeptuneHunter.
- Jeśli okręt "Neptune Hunter" nie przetrwał wrogiego ataku, bitwa powinna się zakończyć.
