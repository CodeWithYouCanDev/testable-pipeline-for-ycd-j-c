Stwórz metodę **String defeatWolf(String)**, która przyjmie na wejście **"imię"** wilka i zwróci frazę
**"<imię> został pokonany"**, gdzie **imię** to wartość argumentu metody **defeatWolf**.

W metodzie main wywołaj metodę **defeatWolf(String)** dla każdego wilka z tablicy **wolves**,
a wynik wywołania wyświetlij na ekranie.

Wymagania:

- W klasie powinna być publiczna statyczna zmienna String[] wolves, zainicjowana przy deklaracji.
- W klasie powinna być stworzona publiczna statyczna metoda defeatWolf() z parametrem typu String i
  zwracanym typem String.
- Wywołanie metody defeatWolf(String) powinno zwracać ciąg znaków zgodnie z warunkami.
- W metodzie main powinna być wywołana metoda defeatWolf(String) dla każdego elementu tablicy wolves
  z wydrukiem wyniku na ekran.