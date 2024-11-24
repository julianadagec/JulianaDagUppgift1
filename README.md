DEL 1 inlämningsuppgift 1 programmering
_______________________________________

Likhet/Skillnad - Java/Python

JAVA har funnits sedan 1995 och Python sedan 1991, båda programmeringsspråken är populära och används brett. Båda språken är oberoende av 
plattform och kan därför användas i olika operativsystem vare sig det är Windows, iOS, eller Linux etc. så länge JVM (Java Virtual Machine) 
och Python Interpreter (Python tolk) är installerade vilket gör att de är lättillgängliga för en bred grupp användare. Det som framförallt 
skiljer sig åt mellan språken är typning där JAVA är statiskt medan Python är dynamiskt. Detta innebär att i JAVA måste deklarera variabler 
med typ men inte i Python vilket i sin tur gör att det är lättare att lära sig Python än JAVA. 
Ett exempel på detta är med nummer:

JAVA
int number = 1 // här är numret statiskt deklarerat med typen int för heltal

Python 
number = 1 // här är numret redan dynamiskt bestämd som typen int och behöver därför inte deklareras 

_____________________________________________________________________________________________________________________________________________

Redogörelse termer

- Objekt: instans av en klass och består av attributen/egenskaper som klassen anger anger att objektet bör göra. Ett objekt kan till exempel 
vara en motorcykel med attributen färg och modell

- Konstruktor: en modell som används i JAVA för att skapa/initiera objekt från en klass och har samma namn som klassen. Den returnerar inga 
värden och instansieras med “new”. Konstruktorn behövs för att kunna skapa attribut för objektet. 

- Attribut: de egenskaper som beskriver och definierar ett objekt. Till exempel, ålder, färg, modell. 

_____________________________________________________________________________________________________________________________________________

Versionshantering

Versionshantering är en process som är till för att spåra förändringar som skett i koden. De grundläggande principerna är:

- Historik och spårbarhet: innebär att man kan med detta se vem som har gjort ändringar, var ändringarna har skett och när de har gjorts. 

-  Brancher: grenar för att utveckla/buggfixa vid sidan av huvudprojektet för att inte påverka det

- Lokal/fjärrlagring: lagra kod lokalt och på fjärrserver för offlinearbete samt delning

- Förberedelsesteg: granskning av ändringar innan de commitas/sparas

- Distribuerat system: möjliggör arbete utan internetuppkoppling tack vare att allt är sparat lokalt 

_____________________________________________________________________________________________________________________________________________

TDD (Test Driven Development)

TDD är en utvecklingsprocess som bygger på att testerna skrivs först och sedan byggs funktionerna. Det ger en tydlig bild av vad funktion bör 
kunna göra, och sedan när funktionen har kodats körs testet för att se om syftet har uppfyllts. Om testet är godkänt fungerar koden som den är 
tänkt, annars behöver vidareutveckling ske. Notera att alla tester misslyckas innan funktionaliteterna har kodats. Målet TDD är att öka på 
kvaliteten genom att ha koden vältestad.  

_____________________________________________________________________________________________________________________________________________

Källor

- Föreläsningsmaterial och lektionsmaterial
- Praktisk mjukvarutestning av Eva Holmquist (2018, ISBN: 9789144117775)
- Test-Driven Java Development - Invoke TDD principles for end-to-end applicationdevelopment with Java av Alex Garcia and Viktor Farcic (2015)
- https://www.coursera.org/articles/python-vs-java?utm_medium=sem&utm_source=gg&utm_campaign=B2C_EMEA__coursera_FTCOF_career-academy_pmax-multiple-audiences-country-multi&campaignid=20858198824&adgroupid=&device=c&keyword=&matchtype=&network=x&devicemodel=&adposition=&creativeid=&hide_mobile_promo&gad_source=1&gclid=CjwKCAjw1NK4BhAwEiwAVUHPUBy2aMXh2Bl7lVPABARtJ0eTV7vNwQqEqto3xUYbPcUN_1PIPjUapRoCBlcQAvD_BwE
- https://www.geeksforgeeks.org/difference-between-python-and-java/
- https://www.codebean.se/objekt-i-java-skapa-en-instans-av-en-klass/
- https://www.codebean.se/konstruktor-i-java/ 
- https://www.codebean.se/objekt-i-java-skapa-en-instans-av-en-klass/
- https://docs.github.com/en/get-started/using-git/about-git
- https://git-scm.com/book/sv/v2/Kom-ig%C3%A5ng-Om-versionshantering
