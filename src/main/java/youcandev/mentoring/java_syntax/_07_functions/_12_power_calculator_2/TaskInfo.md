Nie zaskoczysz nikogo kalkulatorem, który umożliwia podnoszenie liczby do trzeciej potęgi.
Kalkulator, który może podnieść liczbę do dziewiątej potęgi - to coś innego! Więc zrealizujmy go!\
W tym celu skopijuj kod rozwiązania z poprzedniego zadania i utwórz metodę **public static long ninthDegree(long)**.
Jako argument powinien on przyjmować **liczbę całkowitą typu long**.
**Metoda powinna podnosić podaną wartość do dziewiątej potęgi i zwracać ją jako wynik.**\
Podstawowy kurs arytmetyki mówi: aby uzyskać dziewiątą potęgę, liczbę należy podnieść do trzeciej potęgi,
a następnie uzyskany wynik ponownie podnieść do trzeciej potęgi.
Skorzystajmy z tej zasady w naszym programie.\
W metodzie **ninthDegree()** podnieś podany argument do trzeciej potęgi, korzystając z metody **cube()**,
a uzyskany wynik ponownie przekaż do metody **cube()**. Metoda **ninthDegree()** powinna zwracac argument
**podniesiony do dziewiątej potęgi**.

Wymagania:

- Musisz utworzyć metodę public static long ninthDegree(long).
- Metoda ninthDegree() powinna zwracać wynik podnoszenia podanej liczby do dziewiątej potęgi.
- Metoda ninthDegree() powinna używać metody cube() do kolejnych podnoszeń liczb do trzeciej potęgi.