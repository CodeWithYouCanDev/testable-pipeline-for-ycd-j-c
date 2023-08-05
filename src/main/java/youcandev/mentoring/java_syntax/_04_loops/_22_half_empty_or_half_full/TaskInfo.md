W metodzie **main()** mamy zmienną **double glass = 0.5**, która symbolizuje szklankę napełnioną do połowy.
Dla pesymisty jest ona do polowy pusta, a dla optymisty - do polowy pełna.

Należy wczytać dane typu **boolean** z klawiatury, używając metody **nextBoolean()** obiektu typu **Scanner**.
W zależności od otrzymanych danych, należy zaokrąglić zmienną glass: do liczby całkowitej **w dół (0)**,
jeśli jest pesymistą **(false)** i do liczby całkowitej **w górę** (1), jeśli jest optymistą **(true)**.
Wynik wyświetlij na ekranie.

Przykład wprowadzenia:
> true

Przykładowy wynik:
> 1

Podpowiedź:
Aby zaokrąglić liczbę rzeczywistą w dół, użyj metody Math.floor(), do góry - metody Math.ceil().

Wymagania:

- Program powinien wczytywać z klawiatury dane typu boolean.
- Program powinien wyświetlać liczbę całkowitą na ekranie zgodnie z warunkiem.
- W programie należy użyć metody Math.floor().
- W programie należy użyć metody Math.ceil().