# Projekto patikra

Patikros data: 2026-09-27.

Atlikta vietoje:

- XML failai perskaityti XML analizatoriumi be sintaksės klaidų.
- MainActivity turi tris mygtukų paspaudimų apdorojimo veiksmus.
- Sukurti atskiri Git commit kiekvienam užduoties programavimo etapui.
- FT1Branch sujungta į main su atskiru merge commit.
- Įrašytas `//Comment for revert`, sukurtas commit ir atliktas tikras `git revert`.
- `git diff etapas-4 etapas-6` yra tuščias: galutinė kodo būsena po revert sutampa su būsena prieš komentaro pridėjimą.

Kompiliavimo ir paleidimo ribos:

Bandymas paleisti `assembleDebug lintDebug` sustojo dar atsisiunčiant Gradle 8.9, gavus `java.net.SocketException: Network is unreachable`. Todėl pilnas Android kompiliavimas, lint ir veikimas AVD šioje aplinkoje nepatvirtinti. APK nepridėtas. Tai nėra nustatyta programos kodo klaida, tačiau kol projektas nesukompiliuotas, jo veikimo garantuoti negalima.

Android Studio diegimas, virtualizacijos įjungimas, dviejų AVD sukūrimas ir GitHub push naudotojo kompiuteryje neatlikti. Jiems README pateikti konkretūs veiksmai ir laukiamas programos elgesys. Ekrano nuotraukos nebuvo kuriamos imituojant tikrą paleidimą.
