# MIPT 1 praktikos darbas

Paprasta „Hello World“ programėlė su XML maketu ir Java Activity. Ekrane yra tekstas ir trys mygtukai. Projektas paruoštas pagal „Empty Views Activity“ struktūrą, be Compose. Android Studio projekto kūrimo vedlys šioje aplinkoje nebuvo naudotas.

## Kaip veikia programa

1. Paleidus rodoma „Paspausk mygtuką“.
2. „Rodyti tekstą“ pakeičia užrašą į „Labas, pasauli!“.
3. „Keisti teksto spalvą“ pakeičia užrašo spalvą į mėlyną.
4. „Keisti teksto foną“ pakeičia TextView foną į gelsvą.

Mygtukus galima spausti bet kokia tvarka. Spalvos keičiamos į nustatytas reikšmes, todėl pakartotinis paspaudimas jų nekaitalioja. Pasukus ekraną arba iš naujo paleidus Activity, atkuriama pradinė išvaizda. Būsenos išsaugojimas šioje užduotyje neįgyvendintas.

## Svarbiausi failai

- `app/src/main/java/lt/mipt/helloworld/MainActivity.java` – mygtukų paspaudimų veiksmai.
- `app/src/main/res/layout/activity_main.xml` – TextView ir trys Button komponentai.
- `app/src/main/res/values/strings.xml` – lietuviški užrašai.
- `app/src/main/AndroidManifest.xml` – programos paleidimo Activity.

`setContentView` užkrauna XML maketą, `findViewById` suranda elementą pagal jo ID, o `setOnClickListener` nurodo veiksmą paspaudus mygtuką. Užrašą keičia `setText`, teksto spalvą – `setTextColor`, jo foną – `setBackgroundColor`.

## Paleidimas savo kompiuteryje

1. Išskleisk visą ZIP. Failų neatidarinėk tiesiai archyve.
2. Įdiek Android Studio iš https://developer.android.com/studio ir užbaik diegimo vedlį. Pasirink Android SDK ir Android Emulator komponentus.
3. Android Studio pasirink **Open** ir atidaryk aplanką `MIPT1`, kuriame yra `settings.gradle`.
4. SDK Manager įdiek **Android SDK Platform 35** ir **Android SDK Build-Tools 34.0.0**, jei jų trūksta.
5. **Settings → Build, Execution, Deployment → Build Tools → Gradle → Gradle JDK** pasirink JDK 17. Jei jo nėra, naudok **Download JDK**, pasirink 17 versiją.
6. Palauk, kol baigsis Gradle Sync. Pirmą kartą reikės interneto. Projektas naudoja AGP 8.7.3, Gradle 8.9 ir AppCompat 1.7.0. Nereikia iš karto priimti siūlomų Gradle versijų atnaujinimų.
7. Sukurk emuliatorius, kaip nurodyta toliau. Viršuje pasirink `app`, vieną emuliatorių ir paspausk žalią **Run ▶**.

Kompiliavimas terminale iš projekto aplanko:

```powershell
.\gradlew.bat assembleDebug
```

Linux arba macOS:

```bash
chmod +x gradlew
./gradlew assembleDebug
```

APK bus `app/build/outputs/apk/debug/app-debug.apk`. `local.properties` turi būti sukurtas tavo kompiuteriui, todėl jo archyve nėra; SDK vietą paprastai nustato Android Studio.

## Virtualizacija Windows kompiuteryje

1. Atidaryk **Task Manager → Performance → CPU** ir patikrink **Virtualization**.
2. Jeigu rodoma **Disabled**, kompiuterio BIOS/UEFI įjunk **Intel Virtualization Technology / VT-x**; AMD kompiuteryje atitinkamas nustatymas paprastai vadinamas **SVM / AMD-V**. Tikslus meniu priklauso nuo kompiuterio gamintojo.
3. Windows paieškoje surask **Turn Windows features on or off**, įjunk **Windows Hypervisor Platform**, patvirtink ir perkrauk kompiuterį.
4. Android Studio SDK Manager skirtuke **SDK Tools** patikrink, ar įdiegtas **Android Emulator**.

## Du skirtingi emuliatoriai

Android Studio atidaryk **Tools → Device Manager** arba **View → Tool Windows → Device Manager**, tada **+ → Create Virtual Device**. Meniu pavadinimai gali šiek tiek skirtis pagal IDE versiją.

| AVD pavadinimas | Telefono profilis | Sistema | Ekrano raiška |
| --- | --- | --- | --- |
| MIPT_API_34 | Pixel 2 | Android 14, API 34 | 1080 × 1920 |
| MIPT_API_35 | Pixel 3 XL | Android 15, API 35 | 1440 × 2960 |

Pasirink nurodytą telefono profilį ir sistemos atvaizdą. Jei sistemos nėra, spausk atsisiuntimo mygtuką. Intel / AMD Windows kompiuteryje rinkis x86_64 atvaizdą. Patikrink profilio raišką vedlyje. Kiekvieną AVD užbaik su **Finish**. Naudojamos skirtingos API ir raiškos; programos `minSdk` yra 23, `targetSdk` – 34, o `compileSdk` – 35.

AVD yra vietiniai kompiuterio įrenginiai. Projekte pateikti jų nustatymai, tačiau patys emuliatoriai tavo kompiuteryje dar nesukurti.

## Patikrinimas emuliatoriuje

Atlik veiksmus ir tik tada pasižymėk, kad jie pavyko:

- [ ] Device Manager matomi abu AVD su skirtingomis API ir raiškomis.
- [ ] Programa pasileidžia pasirinktame AVD be klaidos.
- [ ] Pirmas mygtukas parodo „Labas, pasauli!“.
- [ ] Antras mygtukas pakeičia tekstą į mėlyną.
- [ ] Trečias mygtukas pakeičia teksto foną į gelsvą.
- [ ] Programa išlieka naudojama pakartotinai spaudžiant mygtukus.

Demonstravimui naudinga išsisaugoti Device Manager vaizdą su abiem AVD, pradinį programos ekraną ir ekraną po visų trijų paspaudimų. Šios nuotraukos turi būti padarytos tikro paleidimo metu.

## Paruošta Git istorija

Archyvo projekto aplanke išsaugotas `.git` katalogas. Git istorija sukurta vietoje; nuotolinė GitHub saugykla dar neprijungta. Commit autorius yra neutralus `MIPT praktikos projektas`, ne tavo GitHub paskyra.

| Žyma | Etapas |
| --- | --- |
| etapas-0 | Pradinis projektas |
| etapas-1 | Pirmas mygtukas ir teksto keitimas |
| etapas-2 | Antras mygtukas ir teksto spalva |
| etapas-3 | Trečias mygtukas šakoje FT1Branch |
| etapas-4 | FT1Branch sujungta į main su atskiru merge commit |
| etapas-5 | Įrašytas tikslus komentaras `//Comment for revert` |
| etapas-6 | Komentarą pridėjęs commit atšauktas su git revert |

Po šių etapų yra papildomas commit su instrukcija ir patikros rezultatais. Galutiniame kode komentaro nėra, nes jo pakeitimas atšauktas; visi trys mygtukai išliko.

Peržiūra Android Studio terminale:

```bash
git log --oneline --graph --all --decorate
git show etapas-5
git show etapas-6
git diff etapas-4 etapas-6
```

Paskutinė komanda neturi parodyti skirtumų: revert grąžino būseną prieš komentaro įrašymą. Šaka `FT1Branch` palikta, kad būtų galima parodyti jos istoriją.

Jei išskleidimo programa prarastų `.git`, šalia projekto pateiktas `MIPT1-history.bundle`. Istoriją atkurk į naują aplanką:

```bash
git clone -b main MIPT1-history.bundle MIPT1-atkurta
cd MIPT1-atkurta
git switch -c FT1Branch origin/FT1Branch
git switch main
git remote remove origin
```

## Įkėlimas į GitHub

Įdiek Git iš https://git-scm.com/downloads, jeigu terminalas jo neatpažįsta. Perkrauk Android Studio. GitHub sukurk tuščią saugyklą `MIPT1`, be README, licencijos ir .gitignore.

Projekto terminale pakeisk žemiau esančius pavyzdinius duomenis savais. `user.email` gali būti tavo GitHub nustatymuose pateiktas privatumo el. paštas. Tai nustato tik būsimų commit autorių, nekeičia jau paruoštos istorijos.

```bash
git config user.name "Tavo vardas ir pavarde"
git config user.email "TAVO_GITHUB_EL_PASTAS"
git remote add origin https://github.com/TAVO_VARTOTOJAS/MIPT1.git
git push -u origin main
git push -u origin FT1Branch
git push origin --tags
```

Šios komandos įkelia visus vietoje paruoštus etapus. Jos nereiškia, kad anksčiau kiekviename etape jau buvo atliktas push.

Jeigu dėstytojas prašo nuosekliai parodyti atskirus push, naujoje tuščioje saugykloje **vietoje trijų aukščiau pateiktų push komandų** naudok šią seką. Ji nekeičia vietinių failų ir nenaudoja force push:

```bash
git push origin etapas-0:refs/heads/main
git push origin etapas-1:refs/heads/main
git push origin etapas-2:refs/heads/main
git push -u origin FT1Branch
git push origin etapas-4:refs/heads/main
git push origin etapas-5:refs/heads/main
git push origin etapas-6:refs/heads/main
git push -u origin main
git push origin --tags
```

Po pirmo push GitHub saugyklos nustatymuose patikrink, kad numatytoji šaka yra `main`. Prisijungimui naudok Git siūlomą naršyklės prisijungimą; paskyros slaptažodžio į projekto failus nerašyk.

## Ką dar atlikti prieš atsiskaitymą

Kodą, vietinius commit, FT1Branch, merge ir revert galima peržiūrėti iškart. Savo kompiuteryje dar reikia įdiegti arba patikrinti IDE bei virtualizaciją, sukurti du AVD, paleisti programą ir atlikti push į savo GitHub. Kompiliavimo patikros rezultatai pateikti faile `PATIKRA.md`.

## Šaltiniai

- Android Studio: https://developer.android.com/studio
- AVD kūrimas: https://developer.android.com/studio/run/managing-avds
- Emuliatoriaus spartinimas ir virtualizacija: https://developer.android.com/studio/run/emulator-acceleration
- AGP 8.7 ir Gradle bei JDK suderinamumas: https://developer.android.com/build/releases/agp-8-7-0-release-notes
- Git revert: https://git-scm.com/docs/git-revert
