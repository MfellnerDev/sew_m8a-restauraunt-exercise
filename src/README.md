# Aufgabenstellung

In einem belebten Restaurant gibt es einen Chefkoch, der regelmäßig Gerichte zubereitet, und mehrere Kellner, die diese Gerichte an die Gäste ausliefern. Um sicherzustellen, dass kein Gericht verloren geht oder doppelt ausgegeben wird, wird ein spezielles System zur Verwaltung der Gerichte verwendet.
Situation:

- Der Chefkoch bereitet kontinuierlich neue Gerichte zu, die er auf eine spezielle Ablage legt.
- Die Kellner nehmen die Gerichte von der Ablage und bringen sie zu den Gästen.
- Die Ablage hat eine begrenzte Kapazität und kann nur eine bestimmte Anzahl von Gerichten gleichzeitig aufnehmen.
- Wenn die Ablage voll ist, muss der Chefkoch warten, bis ein Kellner ein Gericht abholt.
- Wenn die Ablage leer ist, müssen die Kellner warten, bis der Chefkoch ein neues Gericht zubereitet hat.

## Aufgabe:

Erstellen Sie ein Programm, das diese Situation simuliert. Ihr Programm soll folgende Anforderungen erfüllen:

- Der Chefkoch soll kontinuierlich neue Gerichte zubereiten und auf die Ablage legen, solange diese nicht voll ist.
- Die Kellner sollen kontinuierlich Gerichte von der Ablage nehmen und sie ausliefern, solange diese nicht leer ist.
- Das Programm soll sicherstellen, dass die Synchronisation zwischen Chefkoch und Kellnern korrekt funktioniert, sodass keine Gerichte verloren gehen oder doppelt ausgeliefert werden.

---

#### Hinweise:

- Nutzen Sie geeignete Mechanismen zur Synchronisation der Zugriffe auf die Ablage.
- Simulieren Sie die Zubereitung und Auslieferung der Gerichte durch entsprechende Pausen (z.B. mithilfe von Thread.sleep()).
- Denken Sie daran, dass es mehrere Kellner gibt, die gleichzeitig auf die Ablage zugreifen können.