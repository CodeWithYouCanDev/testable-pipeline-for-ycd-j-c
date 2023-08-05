Ćwiczenie polega na manipulowaniu fragmentem kodu podczas wykonywania programu:

1. Ustaw **punkt przerwania** (break point) obok wywołania metody **println**, a następnie uruchom program w trybie
   debugowania.
2. Po zatrzymaniu programu naciśnij Alt+F8 (Option+F8 dla macOS) i wykonaj następujący kod:\

> loop.replaceAll("\\W", "").split("fahrenheit")[1]**

3. Wynik wykonania powyższego kodu przypisz do pola **result** (zmodyfikuj oryginalny kod).

Ostatecznie w klasie powinna pojawić się tylko jedna zmiana: pole **result** powinno być zainicjowane podczas
deklaracji.

Wymagania:

- Nie modyfikuj metody main.
- Pole result musi być przypisane poprawnej wartości.