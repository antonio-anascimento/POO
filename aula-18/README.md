```mermaid
classDiagram
direction LR
Contatos *-- Telefones
Contatos *-- Emails
Agenda --> Contatos

class Agenda
class Contatos
class Telefones
class Emails
```