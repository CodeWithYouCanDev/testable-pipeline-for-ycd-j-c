Dodaj rozwiązanie z poprzedniego zadania tutaj i odkomentuj metody w klasie SeaBattleField,
aby zacząć wykonywać to zadanie.

W tej części czeka nas wielka bitwa. W **klasie SeaBattleField** mamy statyczne zmienne typu String,
które zostaną użyte do przedstawienia przebiegu bitwy.

Metoda **isHunterAlive(NeptuneHunter)** sprawdza, czy okręt **"Neptune Hunter"**
przetrwał atak **"Neptune Vortex"**.

* Jeżeli tak, wyświetla komunikat **o odparciu ataku wroga (zmienna hunterDefence)**.
* Jeśli nie, wyświetla komunikat o **nieudanym odparciu ataku (zmienna hunterDestroy)**.

Metoda **isVortexAlive(NeptunianVortex)** sprawdza, czy okręt "Neptune Vortex" przetrwał atak "Neptune Hunter".

* Jeżeli tak, wyświetla komunikat **o odparciu naszego ataku (zmienna vortexDefence)**.
* Jeśli nie, wyświetla komunikat **o zniszczeniu wrogiego okrętu (zmienna vortexDestroy)**.

W metodzie **main() klasy SeaBattleField** musisz stworzyć **po jednym obiekcie klas
NeptunianVortex i NeptunianHunter**.\
Pierwszym atakuje wróg. Wyświetl komunikat **o ataku wroga (zmienna vortexAttack)**.
Dla okrętu "Neptune Hunter" **aktywuj system obrony, wywołując metodę defend(int) na obiekcie typu NeptuneHunter**
i **przekazując jako argument wynik metody attack() obiektu typu NeptuneVortex**.

Bitwa trwa do momentu, gdy okręt **"Neptune Hunter"** zostanie zniszczony.\
Ponieważ na początku bitwy okręt jest w pełnej gotowości bojowej i musi najpierw przetrwać atak wroga,
użyj pętli **do-while**.

**P.S.** Niestety w tej części zadania **NeptuneHunter** nie przeżyje ataku Neptuna, ale w następnej poprawimy to.

**Uwaga**: Zwróc uwagę na **importy klas**. Używaj klas **tylko z pakiety, w którym rozwiązujesz zadanie**.

Wymagania:

- W metodzie main() powinien być utworzony jeden obiekt klasy NeptuneVortex.
- W metodzie main() powinien być utworzony jeden obiekt klasy NeptuneHunter.
- W metodzie main() musisz użyć pętli do-while.
- Przed wywołaniem metody attack() musisz wyświetlić w konsoli wynik wartości zmiennej vortexAttack.
- Na obiekcie klasy NeptuneVortex musisz wywołać metodę attack().
- Wynik wywołania metody attack() obiektu typu NeptuneVortex musisz przekazać do metody defend(int)
  obiektu typu NeptuneHunter.
