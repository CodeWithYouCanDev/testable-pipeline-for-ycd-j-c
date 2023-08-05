Dodaj rozwiązanie z poprzedniego zadania tutaj, aby zacząć wykonywać to zadanie.

W tej części musisz stworzyć okręt **"Neptune Hunter"**, na którym zniszczymy łódź podwodną **"Neptune Vortex"**.\
Okręt **"Neptune Hunter"** ma trzy typy broni: działo laserowe, rakiety naprowadzające się oraz działo
elektromagnetyczne.\
Podobnie jak wrogie **"Neptune Vortex"**, okręt "Neptune Hunter" posiada wskaźnik wytrzymałości,
system obrony i system ataku.\

Stwórz **klasę NeptuneHunter**. \
Dodaj **trzy statyczne zmienne typu int** dla typów broni z takimi wartościami obrażeń:

* działo laserowe — **laser** o wartości **100_000**;
* rakietka naprowadzająca się — **rocket** o wartości **10_000**;
* działo elektromagnetyczne — **trident**, wartości nie przypisuj.

Dla wskaźnika wytrzymałości okrętu stwórz **publiczną zmienną health typu int** o wartości **1_000_000**.\
System obrony zostanie zaimplementowany w **publicznej metodzie void defend(int)** z **jednym parametrem typu int**,
przez który zmniejszymy wskaźnik wytrzymałości (zmienna health).\
System ataku zostanie zaimplementowany w **publicznej metodzie attack()**,
która będzie zwracać moc ataku w zależności od wybranej broni (wartość jednej ze statycznych zmiennych).\
Na początek będziemy atakować rakietami.

**Uwaga**: Zwróc uwagę na **importy klas**. Używaj klas **tylko z pakiety, w którym rozwiązujesz zadanie**.

Wymagania:

- Stwórz klasę NeptuneHunter.
- W klasie NeptuneHunter musisz stworzyć trzy publiczne statyczne zmienne zgodnie z opisem.
- W klasie NeptuneHunter musisz stworzyć publiczną zmienną health typu int o wartości 1_000_000.
- W klasie NeptuneHunter musisz stworzyć publiczną metodę void defend(int), która zmniejsza wartość zmiennej health
  o wartość jej parametru.
- W klasie NeptuneHunter musisz stworzyć publiczną metodę attack(), która zwraca wartość statycznej zmiennej rakieta.
