W tym zadaniu napiszemy program do niszczenia czołgów wroga.
Na początku stworzymy **pole z czołgami**, następnie naładujemy "wyrzutnię rakiet" rakietami i "uderzymy" w czołgi.
Jeśli za pierwszym razem nie uda nam się wszystkich zniszczyć, będziemy mogli powtórzyć "uderzenie".

W tej części musisz stworzyć publiczne statyczne zmienne typu int:

* **width**, będzie to szerokość pola (liczba kolumn);
* **height**, będzie to wysokość pola (liczba wierszy).

Przypisz wartość 30 do zmiennej **width**, a wartość 10 do zmiennej **height**.
Pole będzie reprezentowane przez dwuwymiarową tablicę elementów **typu String**.\
Utwórz publiczną statyczną zmienną **field** odpowiedniego typu
i zainicjuj ją wartością tablicy o wymiarach **height * width**.\
W metodzie **main** wypełnij tablicę **field** elementami o wartości równej wartości zmiennej **empty**. \
Wydrukuj tablicę na ekranie tak jak pokazano w przykładzie.\
Przykład wydruku tablicy o wymiarach 5*3, wartość każdego elementu wynosi "e":\
**eeeee**\
**eeeee**\
**eeeee**

Wymagania:

- Klasa powinna zawierać publiczną statyczną zmienną width typu int, zainicjowaną podczas deklaracji wartością 30.
- Klasa powinna zawierać publiczną statyczną zmienną height typu int, zainicjowaną podczas deklaracji wartością 10.
- Klasa powinna zawierać publiczną statyczną zmienną field typu String[][],
  zainicjowaną podczas deklaracji dwuwymiarową tablicą o wymiarach height*width.
- W metodzie main tablica field powinna być wypełniona elementami o wartości równej empty.
- W metodzie main tablica field powinna być wyświetlona na ekranie zgodnie z warunkiem.