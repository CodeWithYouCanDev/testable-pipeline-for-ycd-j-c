Pomóż Kapitanowi Hawkeye odnaleźć rzadki kamień tajemnicy, który zaginął gdzieś w lesie.
Kamień ukryty jest w jednym z czterech tajnych kryjówek w lesie.

Zacznijmy od tego, żeby wygenerować dla kamienia losową pozycję (liczba od 1 do 4), a następnie będziemy zgadywać,
w której kryjówce on się znajduje. Po odnalezieniu kamienia, Hawkeye będzie musiał stawić czoła strażnikowi kamienia.
Oboje będą mieli po **7 "żyć"**. Hawkeye będzie atakował, a strażnik bronił.\
Jeśli strażnik się obroni, kontratakuje, a Hawkeye traci **"życie"**. Jeśli obrona się nie powiedzie,
strażnik traci **2 "życia"**.\
Atak i obrona są losowe i odbywają się w jednym z trzech miejsc
**(góra/środek/dół, ale dla uproszczenia użyjemy liczb od 1 do 3).**
Przebieg walki i wynik będą wyświetlane w czasie rzeczywistym. \
Aby było łatwiej, podzielmy to zadanie na kilka etapów.

* Dodaj do klasy **publiczne statyczne pole stonePosition typu int**, które będzie przechowywać pozycję kamienia.
  W metodzie **main** przypisz temu polu **losową wartość od 1 do 4** za pomocą już zaimplementowanej metody
  **getRandomNumber(int)**.
* Następnie w klasie stwórz **publiczną metodę statyczną void findStone()**,
  która najpierw **wyświetli wartość pola getFirstPositionPhrase**, a następnie będzie wczytywać
  liczby z klawiatury **do momentu odnalezienia kamienia**.
* Jeśli pozycja **nie zostanie odgadnięta**,
  wyświetl wartość **getPositionPhrase**, a jeśli tak - **findStonePhrase**.
* Wywołaj metodę **findStone()** w **main** po przypisaniu **wartości do stonePosition**.

Wymagania:

- W klasie powinna być publiczna statyczna zmienna stonePosition typu int.
- W metodzie main zmiennej stonePosition powinna być przypisana wartość zwrócona przez metodę getRandomInt
  z argumentem 4.
- W klasie powinna być publiczna statyczna metoda void findStone().
- Metoda findStone() powinna wczytywać wartości z klawiatury do momentu, gdy wartość będzie równa wartości
  zmiennej stonePosition.
- Metoda findStone() powinna wyświetlać wartości zmiennych getFirstPositionPhrase, getPositionPhrase i findStonePhrase.
- W metodzie main powinna być wywołana metoda findStone().


