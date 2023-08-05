Skopijuj kod rozwiązania z poprzedniego zadania i umieść w tej klasie.

Teraz zajmijmy się bombami. Idea "bombardowania" polega na tym, że każda bomba trafia do odpowiedniego pola.

Stworzymy **tablicę liczb (publiczna statyczna zmienna bombs typu int[][])**,
która ma taki sam rozmiar co pole **field**, a będzie zawierała liczby:\
**0 - w komórce nie ma bomby;**\
**1 - w komórce jest bomba.**\
Wypełnij tablicę bombami tak, aby w każdym wierszu było 10 bomb.

Wymagania:

- W klasie powinna być publiczna statyczna zmienna bombs typu int[][],
  zainicjalizowana przy deklaracji dwuwymiarową tablicą o wymiarach height*width.
- W metodzie main tablica bombs powinna być wypełniona elementami zgodnie z warunkiem.