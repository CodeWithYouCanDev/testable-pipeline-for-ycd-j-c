W robomózgu Carlosa pojawia się bałagan. Analizując przyczyny, odkryliśmy kod wątpliwej jakości w module przerw.

Twoim zadaniem jest przepisanie ciała metody **pause()**:

* Jeśli przychodzący argument **timeUnits** jest mniejszy niż zero, należy uczynić go dodatnim, np. **mnożąc przez -1**.
* Jeśli po tym **timeUnits** są większe niż **999999**, powinno się je **dzielić przez 10**,
  aż staną się **mniejsze lub równe 999999**.
* Po tych sprawdzeniach i przekształceniach należy wywołać metodę **Thread.sleep()** z dwoma argumentami,
  przekazując **0 jako pierwszy argument**, **a wynikowy **timeUnits** jako drugi argument**.

Wymagania:

- Metoda pause() powinna wywołać metodę Thread.sleep() z dwoma parametrami tylko raz.
- Do metody Thread.sleep() nie powinien być przekazywany ujemny argument.
- Do metody Thread.sleep() nie powinien być przekazywany argument większy niż 999999.
- Metoda Thread.sleep() powinna być wywoływana z dwoma argumentami zgodnie z warunkiem.
