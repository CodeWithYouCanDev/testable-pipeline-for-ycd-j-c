Skopijuj swój kod z poprzedniego zadania, aby zacząć wykonywać to zadanie.

Teraz, gdy przygotowaliśmy naszych bohaterów do walki, pora na rzeczywistą bitwę!
W klasie dodaj **publiczną statyczną metodę void battle()**. W tej metodzie Kapitan Hawkeye będzie atakował,
a Strażnik Kamienia będzie się bronił i kontrował, aż któryś z nich nie straci wszystkich "żyć".

Jeśli **Kapitan Hawkeye ataku**je, a **Strażnik Kamienia nie broni się skutecznie**
(strefa obrony Strażnika Kamienia nie pokrywa się ze strefą ataku Kapitana Hawkeye),
**Strażnik traci "życie"** - wywołujemy **odpowiednią metodę**.
Jeśli jednak **Strażnik Kamienia skutecznie się obroni**, od razu kontrował atak,
co skutkuje **utratą "życia" przez Kapitana**.

Do monitorowania postępów bitwy, w konsoli wyświetlamy odpowiednie komunikaty:

**Jeśli Strażnik Kamienia skutecznie się obroni, wyświetlamy komunikat z zmiennej guardianDefendPhrase.**
**Jeśli atak Kapitana Hawkeye trafił w cel, wyświetlamy komunikat z zmiennej hawkeyeAttackPhrase.**

W metodzie main nie zapomnij **wywołać metodę battle()** po wywołaniu metody **findGuardian()**.

Wymagania:

- W klasie musi być publiczna statyczna metoda void battle().
- Metoda battle() nie powinna coś robić, jeśli któryś z rywali nie ma już "żyć".
- Metoda battle() powinna wyświetlić komunikat z zmiennej guardianDefendPhrase i wywołać metodę hawkeyeLostLife(),
  jeśli Strażnik Kamienia się obronił (wynik hawkeyeAttacks() jest taki sam jak guardianDefends()).
- Metoda battle() powinna wyświetlić komunikat z zmiennej hawkeyeAttackPhrase i wywołać metodę guardianLostLife(),
  jeśli Strażnik Kamienia nie obronił się skutecznie.
- W metodzie main musisz wywołać metodę battle() po wywołaniu metody findGuardian().