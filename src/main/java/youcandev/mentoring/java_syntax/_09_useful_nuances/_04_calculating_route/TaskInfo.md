Potrzebujemy obliczyć trasę poprzez labirynt podwodnych jaskiń.  
Posiadamy tablicę **caveCoordinates** z koordynatami (a, b, c) określającymi przejścia w jaskini. \
Z tej tablicy musimy wybrać tylko te koordynaty, które prowadzą przez bezpieczne przejścia,
nie zablokowane skalnymi przeszkodami.\
Koordynaty używamy w formule:
> cos(a)×e+sin(b)×max(a,b,c)−tan(b)×log(c)

gdzie **max(a,b,c)** to maksimum z trzech liczb.

Jeżeli wynik obliczeń mieści się w zakresie **od 50 do 150 włącznie**, oznacza to,
że te koordynaty prowadzą przez bezpieczne przejście, i ten wynik powinien zostać dodany do tablicy **safePath**
(która jest już stworzona w klasie). \
Jeżeli wynik jest większy niż 150 - pomijamy go.

Wymagania:

- W metodzie main() dodaj do tablicy safePath wyniki obliczeń, które mieszczą się w zakresie [50, 150].