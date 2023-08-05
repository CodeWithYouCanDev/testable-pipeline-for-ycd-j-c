Musisz pokonać główną łódź podwodną armii morskich potworów "Neptune Vortex" znajdującą się w głębinach
Oceanu Atlantyckiego. Główna łódź podwodna posiada mega-torpedę, system obrony i system ataku,
a także wskaźnik zapasu wytrzymałości.

Stwórz **klasę NeptuneVortex**. \
Dodaj **publiczną statyczną zmienną** mega-torpedy **megaTorpedo** typu int
o wartości **Integer.MAX_VALUE** oraz **publiczną zmienną** wskaźnika wytrzymałości łodzi **submarineDurability**
typu double o wartości **Double.MAX_VALUE**.\
System obrony zostanie zaimplementowany w **publicznej metodzie void defend(double)**
z jednym **parametrem typu double** w następujący sposób:

* wskaźnik wytrzymałości łodzi (submarineDurability) **zmniejsza się** o
  **wynik dzielenia wartości mega-torpedy (megaTorpedo) przez wartość przekazanego parametru**.
* Natomiast system ataku zostanie zaimplementowany w **publicznej metodzie attack()**,
  która będzie zwracała moc ataku, czyli **wartość mega-torpedy (megaTorpedo)**.

Wymagania:

- Stwórz klasę NeptuneVortex.
- W klasie NeptuneVortex musisz stworzyć publiczną statyczną zmienną megaTorpedo o wartości Integer.MAX_VALUE.
- W klasie NeptuneVortex musisz stworzyć publiczną zmienną submarineDurability typu double o wartości
  Double.MAX_VALUE.
- W klasie NeptuneVortex musisz stworzyć publiczną metodę void defend(double) zgodnie z opisem.
- W klasie NeptuneVortex musisz stworzyć publiczną metodę attack(), która zwraca wartość statycznej zmiennej
  megaTorpedo.
