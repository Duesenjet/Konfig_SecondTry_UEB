# Exercise 5

## Fragen

Warum werden Logging Bibliotheken verwendet? 
A: Logging Bibliotheken werden verwendet um das Protokollieren von Informationen und Ereignissen in der Anwendung 
zu erleichtern. 

Welche Loglevel gibt es in Log4J und was hat es damit auf sich? 

Trace: wird verwendet um äußerst detaillierte Informationen zu protokollieren, 
welche für Fehlerbehandlung und das Debugging nützlich sind

Debug: wird für Debugging Informationen verwendet. Nützlich um Probleme und Fehler 
in der Anwendung zu identifizieren und zu beheben.

Info: wird für allgemeine Informationen über den Verlauf der Anwendung anzuzeigen und zu überwachen.

Warn: wird für Warnungen und potenziell problematische Situationen verwendet, 
welche nicht zwangsläufig zu Fehlern führen müssen. 

Error: wird für Fehler und Ausnahmen verwendet, die das ordnungsgemäße Funktionieren 
der Anwendung beeinträchtigen, aber die Anwendung möglicherweise noch weiterlaufen lässt. 


Fatal: wird für schwerwiegende Fehler verwendet, die dazu führen, dass die Anwendung 
nicht mehr ordnungsgemäß funktioniert und normalerweise abstürzt oder nicht mehr 
weiterläuft 

Was für Konfigurationsmöglichkeiten bietet Ihnen log4J? 

Logger-Konfiguration: Logger können für verschiedene Teile der Anwendung 
konfiguriert werden. Loglevel und Ausgabeziel können für jeden Logger separat 
festgelegt werden. 

Loglevel-Konfiguration: Für jeden Logger können verschiedene Loglevel festgelegt
werden.

Ausgabeziel (Appender): Konfiguration, wohin die Protokollnachricht geschrieben werden soll.  
