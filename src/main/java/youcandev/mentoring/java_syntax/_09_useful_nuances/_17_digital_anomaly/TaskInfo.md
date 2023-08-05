Anomalia zdigitalizowała statek kosmiczny i teraz zalewa jego cyfrową strukturę masą zbędnych zer i jedynek,
co powoduje jego rozciąganie. \
Aby ustabilizować sytuację i przywrócić statek do pierwotnego stanu, potrzebujemy narzędzia,
które pozwoli nam ustawić **odpowiedni bit liczby na 0 lub 1**.

Dla naszej wygody będziemy przedstawiać liczby w formie binarnej.\
W tym celu na początku liczby umieszczamy **prefiks 0b**. Na przykład:

* zapis binarny liczby 3: **0b11**
* zapis binarny liczby 666: **0b1010011010**

Bit, który chcemy ustawić, będzie przedstawiony w ten sam sposób, ale będzie zawierać tylko jedną **liczbę 1**.\
Czyli to będzie numer bitu, który trzeba ustawić na 1 lub 0. Na przykład:

* drugi bit: 0b10
* piąty bit: 0b10000

Zaimplementuj metodę **changeBit(int number, int bit, boolean activated)**. \
Jeśli argument **activated** jest równy **true**, w liczbie **number** powinieneś ustawić **bit** na 1
i zwrócić otrzymaną liczbę. \
Jeśli jednak **activated** jest równy **false**, **bit** powinien zostać ustawiony na 0.

W twojej implementacji przydadzą się operatory: |, &, ~.

Wymagania:

- Metoda changeBit() powinna zwrócić liczbę z odpowiednim bitem ustawionym na 1, jeśli activated jest true.
- Metoda changeBit() powinna zwrócić liczbę z odpowiednim bitem ustawionym na 0, jeśli activated jest false.
