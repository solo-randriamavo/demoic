# DemoIC

Petit projet Java/Maven pour le pipeline Jenkins du TP1. Il permet de montrer les étapes de compilation, tests unitaires, analyse SonarQube et publication de l'artefact dans Nexus.

Le projet ne contient aucun identifiant. Jenkins fournit le token SonarQube et les identifiants Nexus au moment du build.

## Lancer localement

```bash
mvn clean verify
java -cp target/classes com.devops.tp1.DemoIC
```

## Publication Maven

Le `pom.xml` cible les dépôts `maven-releases` et `maven-snapshots` de Nexus sur le réseau Docker. Les identifiants correspondants doivent être configurés dans Jenkins, jamais dans ce dépôt.

Modification pour tester le webhook Jenkins.
