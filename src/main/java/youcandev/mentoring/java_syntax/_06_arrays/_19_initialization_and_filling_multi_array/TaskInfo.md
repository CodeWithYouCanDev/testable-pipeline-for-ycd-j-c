Mamy dwuwymiarową tablice array. Należy zainicjować go tablicami-rzędami,
której długość wynosi **2 * <numer tablicy-rzędu> + 1**.
Czyli **array[0]** będzie miała długość **2 * 0 + 1 = 1**,
**array[1]** - **2 * 1 + 1 = 3**, itd.\
Wypełnij wszystkie tablice-rzędów liczbami,
które są równe **numerowi elementu w tablicy-rzędów + numer samego rzędu**.
**Tablica-rząd o numerze 3** zostanie wypełniona tak:\
**{3, 4, 5, ...}**\
**(0+3, 1+3, 2+3, ...)**

Wymagania:

- W klasie powinna znajdować się publiczna statyczna zmienna int[][] array, zainicjowana wartością int[5][].
- Zainicjować tablice-rzędów, które przechowuje zmienna array, tablicami o odpowiedniej długości (patrz warunek).
- Wypełnij tablice-rzędów liczbami zgodnie z warunkiem.