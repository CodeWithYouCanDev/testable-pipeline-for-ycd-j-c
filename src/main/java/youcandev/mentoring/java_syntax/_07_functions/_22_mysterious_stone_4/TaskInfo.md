Skopijuj swój kod z poprzedniego zadania, aby zacząć wykonywać to zadanie.\
Po zakończeniu bitwy, musimy określić, czy Kapitan Hawkeye zwyciężył w starciu ze Strażnikiem Kamienia.
Do tego celu **dodajemy do klasy publiczną statyczną metodę isHawkeyeWin()**, która **zwróci true**,
jeśli **Kapitan Hawkeye wygrał**, oraz **false w przeciwnym razie**.

W metodzie main **wywołujemy metodę isHawkeyeWin()**. Jeśli metoda **zwróciła true**,
w konsoli **wyświetlamy komunikat zawarty w zmiennej winPhrase**. W przeciwnym przypadku **prezentujemy komunikat
ze zmiennej loosePhrase**.

Wymagania:

- W klasie musi być publiczna statyczna metoda isHawkeyeWin(), która zwraca wartość typu boolean.
- Metoda isHawkeyeWin() powinna zwracać true, jeśli Strażnik Kamienia nie ma już "życiów", lub false,
  jeśli Strażnik Kamienia nadal żyje.
- W metodzie main musisz wywołać metodę isHawkeyeWin() po wywołaniu metody battle().
- Jeśli metoda isHawkeyeWin() zwróciła true, powinien zostać wyświetlony komunikat z zmiennej winPhrase,
  w przeciwnym przypadku komunikat ze zmiennej loosePhrase.