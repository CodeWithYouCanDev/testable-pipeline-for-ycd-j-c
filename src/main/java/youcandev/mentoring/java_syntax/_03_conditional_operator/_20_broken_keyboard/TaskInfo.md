Admin stworzył tajne hasło do dostępu do poufnych informacji, ale jego klawiatura się zepsuła
i teraz nie może wprowadzać liter w formie wielkiej litery.
Napisz program, który będzie porównywał wprowadzony ciąg ze zmienną secret, **nie zwracając uwagi na wielkość liter**.
Jeśli wprowadzony ciąg jest równy ciągowi ze zmiennej secret, program wyświetla komunikat **"dostęp przyznany"**.
W przeciwnym razie - **"dostęp zabroniony"**.

Wymagania:

- Program powinien odczytywać ciąg znaków z klawiatury.
- W klasie powinna być publiczna statyczna zmienna secret typu String.
- Jeśli wprowadzony ciąg i ciąg ze zmiennej secret są takie same, nie zwracając uwagi na wielkość liter,
  program powinien wyświetlić komunikat "dostęp przyznany".
- Jeśli wprowadzony ciąg i ciąg ze zmiennej secret są różne, nie zwracając uwagi na wielkość liter,
  program powinien wyświetlić komunikat "dostęp zabroniony".