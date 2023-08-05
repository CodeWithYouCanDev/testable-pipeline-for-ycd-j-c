Utwórz tablicę trójkątną, gdzie wartością każdego elementu jest **suma jego indeksów**.
Na przykład:\
**array[7][3] = 7 + 3 = 10,**\
**array[3][0] = 3 + 0 = 3.**

Wyświetl tablicę na ekranie w następujący sposób:
> 0\
> 1 2\
> 2 3 4\
> 3 4 5 6\
> 4 5 6 7 8\
> 5 6 7 8 9 10\
> ...

Liczby w wierszu są oddzielone spacją.

Tablicę trójkątną możesz zdefiniować w następujący sposób:\
**int[][] array = new int[10][];**\
**array[0] = new int[1];**\
**array[1] = new int[2];**\
**array[2] = new int[3];**\
...

Wymagania:

- W metodzie main(String[]) dwuwymiarową tablicę array wypełnij liczbami zgodnie z warunkiem.
- Wyświetlony tekst powinien zawierać 10 wierszy.
- Wyświetlone liczby muszą spełniać warunek.