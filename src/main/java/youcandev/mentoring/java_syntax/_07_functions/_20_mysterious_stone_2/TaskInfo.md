Skopijuj swój kod z poprzedniego zadania, aby zacząć wykonywać to zadanie.\
W klasie dodaj pola, które będą reprezentować **liczbę "żyć" Kapitana Hawkeye** i **Strażnika Kamienia**:
**hawkeyeLives oraz guardianLives**. Przypisz im wartość początkową **7** (bezpośrednio w linii inicjalizacji).

Następnie **dodaj metody, które będą modyfikować ilość "żyć" podczas walki**:

W klasie utwórz publiczne statyczne metody:

* **hawkeyeLostLife()**, w której zmniejsz wartość hawkeyeLives o 1.
* **guardianLostLife()**, w której zmniejsz wartość guardianLives o 2.

Teraz dodaj metody, które będą reprezentować atak Kapitana Hawkeye oraz obronę Strażnika Kamienia:

* Utwórz **publiczną statyczną metodę hawkeyeAttacks()**, która **zwróci losową wartość w zakresie od 1 do 3**
  (korzystając z pomocniczej metody getRandomNumber).
* Utwórz **publiczną statyczną metodę guardianDefends()**, która **również zwróci losową wartość w zakresie od 1 do 3**
  (zakresy ataku i obrony powinny być identyczne).

Wymagania:

- W klasie musi być publiczna statyczna zmienna hawkeyeLives typu int z wartością 7.
- W klasie musi być publiczna statyczna zmienna guardianLives typu int z wartością 7.
- W klasie musi być publiczna statyczna metoda void hawkeyeLostLife(), zaimplementowana zgodnie z warunkiem.
- W klasie musi być publiczna statyczna metoda void guardianLostLife(), zaimplementowana zgodnie z warunkiem.
- W klasie musi być publiczna statyczna metoda int hawkeyeAttacks(), zaimplementowana zgodnie z warunkiem.
- W klasie musi być publiczna statyczna metoda int guardianDefends(), zaimplementowana zgodnie z warunkiem.