Blackjack
https://github.com/FroyoFrozen/BlackJack

Auteurs van deze repo zijn

Dinand Willaert will0145

Juliano Pieters piet0061



De samenwerking tussen ons verliep goed, in zowel communicatie als werken. We maakten vanaf het begin duidelijke afspraken over wat we gingen doen, welke design patterns we wilden implementeren en wanneer we ons werk af wilden hebben. En hielden gedurende de tijd dat we aan het project gewerkt hebben meetings om alles dat we aan het doen waren te bespreken en progressie te melden. Ook hebben we elkaar geholpen wanneer problemen verschenen.



Door de eerste commit lijkt het net alsof Dinand heel het spel gemaakt heeft maar dit is echter niet waar. Toen we dus een github repo aanprobeerde te maken kregen we de eerste niet gelinked waardoor Dinand niks kon pushen.

Daarom probeerde wij een tweede repo te maken en deze werkte volledig.

We hadden afgsproken (om code conflicts te voorkomen ) dat Juliano een eerste deel van de blackjack game codeerde, deze vervolgens pushte en dat Dinand hier mee verderging.

Echter werkte juliano tot zijn spijt nog in de oude repo waar Dinand niet in kon pushen. Om tijd te besparen besloten we dat juliano gewoon eventjes via discord zijn code doorstuurde ( aangezien het toen nog 1 bestand was ) en dat Dinand hiermee verder ging. Om deze reden lijkt het dus alsof Dinand 300 regels meer code heeft gemaakt maar dit is dus niet het geval.



Design paterns


Creational design patterns



Abstract Factory

In dit project wordt een abstract factory gebruikt voor het maken van verschillende soorten spelers. ( Zoals Gambler en Dealer). De PlayerFactory – interface geeft een algemene methode aan om spelers te maken. Terwijl concrete factories (GamblerFactory en DealerFactory) de methode een specifieke werking geven. Deze concrete factories worden vervolgens in de BlackJackGame-klasse opgeroepen voor het maken van een Dealer en een  Gambler.



Builder

In dit project wordt een builder gebruikt om de constructor van de BlackJackGame-klasse op te schonen en leesbaarder te maken. De builder zorgt ervoor dat het aanmaken van objecten in stappen loopt waarbij je niet per se alle stappen aan moet roepen, maar alleen de stappen die je voor het maken van dat object wil gebruiken.

Zo worden in de BlackJackGameBuilder-klasse de nodige componenten voor BlackJackGame-klasse aangemaakt.





Structural design patterns



Facade

In het project zorgt de BlackJackGameFacade – klasse ervoor dat de Main een stuk overzictelijker wordt. BlackJackGameFacade bied methodes aan die Main kan oproepen ( zoals startGame() en playerHit() ) Vervolgens worden alle complexe logica uitgevoert in de facade zelf. En op die manier blijft Main eenvoudig en overzichtelijk.



Proxy

In het project wordt een proxy design pattern gebruikt om toegang tot de waarde van  kaarten vanuit de Card-klasse te loggen via de CardProxy-klasse. De CardProxy-klasse geeft vervolgens ook de waarde van de kaarten door aan de Deck-klasse.





Behavioral design patterns



State

In dit project wordt het state design pattern gebruikt om de waarde van de aas kaart van 11 punten naar 1 punt te wisselen wanneer de waarde van de kaarten in de speler zijn "hand" boven de 21 komt. Hiervoor wordt een interface genaamd AllCardsValueState gebruikt die de som van de waarde van de kaarten in de speler zijn "hand" doorgeeft aan de AceState-klasse, FaceState-klasse en de NumericCardState-klasse, waarbij in de getValue() functie in de AceState-klasse de waarde van de aas kaart in de speler zijn hand bepaald wordt, dus 1 wanneer playersum (som van de waarde van de kaarten in de speler zijn "hand") groter is dan 21 en 11 wanneer playersum (inclusief de aas kaart) lager ligt dan 21.



Strategy

In het project wordt het Strategy patroon gebruikt om makkelijk het speelgedrag van de Dealer-klasse te bepalen.  De Dealer-klasse gebruikt de DealerStrategy-interface. Deze interface heeft vervolgens meerde implementaties zoals HitBelowSeventeenStrategy en HitBelowNineteenStrategy. Wanneer een dealer wordt aangemaakt krijgt hij bij default de HitBelowSeventeenStrategy. Dit wordt bepaald in de constructur van de Dealer-klasse. Maar je kan behulp van de setStrategy() methode de strategy aanpassen door een nieuwe meetegeven. Dit wordt bijvoorbeeld gedaan in de dealerPlay() methode in BlackJackGame.klasse. De gekozen strategie bepaald overgens of de dealer op 17 of op 19 blijft staan.  

 

 
