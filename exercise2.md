# Exercise 2

## Git Befehle 

git config 

git init: Ein bestehendes Repository kann von einem Remote Repository vom Server lokal herunterkopiert werden. Das erfolgt auch nur initial beim Anlegen eines lokalen Repository. 

git commit: Fügt die dem Staging Bereich hinzugefügten Dateien dem Repository hinzu
Parameter: '-m"   "' fügt eine kurze selbst verfasste Nachricht des Entwicklers für Kollegen hinzu

git status 

git add: fügt Daten dem Staging Bereich hinzu 
Parameters: <filename> / .    funktioniert entweder direkt mit dem passenden Dateinamen oder mit dem '.' werden direkt alle Ordern inklusive unterordner hinzugefügt 

git log nach einem Commit kann man mit git log Informationen des letzten Commits, bzw, die Beziehung zu vorherigen Commits dartsellen
Parameters: +  --graph

git diff: Mit git diff kann man sich Unterschiede zwischen commits oder Commit und working directory anzeigen lassen 

git pull: mit dem Befehl pull wird die aktuelle Version des Repository in den gewollten Ordner kopiert 

git push: mit dem Befehl push wird das Repository vom Rechner auf den Server geladen  

vor git add gitignore: 
datei befindet sich unter untracked files 

nach git add gitignore: 
datei unter changes to be committed
