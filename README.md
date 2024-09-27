# Exemple d'Application Spring Boot avec Gradle

## Description

Ce projet est un exemple d'application Spring Boot utilisant Gradle comme outil de construction. L'application est conçue pour démontrer les concepts de base de Spring Boot avec une configuration minimale. Elle inclut des fonctionnalités de base telles que la gestion des entités et les requêtes de base de données.

## Prérequis

- [Java 21](https://www.oracle.com/java/technologies/javase-jdk21-downloads.html)
- [Gradle](https://gradle.org/install/) (pour la construction du projet)
- [Spring Boot](https://spring.io/projects/spring-boot) (version spécifique à votre projet)

## Configuration

1. **Clonez le dépôt**

```bash
git clone https://github.com/your-username/your-repository.git
cd your-repository
```

2. **Construisez le projet**

Assurez-vous que Gradle est installé sur votre machine. Utilisez la commande suivante pour construire le projet :

```bash
./gradlew build
```

3. **Exécutez l'application**

Après la construction, vous pouvez exécuter l'application avec la commande suivante :

```bash
./gradlew bootRun
```

L'application sera accessible à l'adresse http://localhost:8080.

```bash
./gradlew test
```

4. **Déploiement**
Pour déployer l'application, vous pouvez créer un fichier JAR exécutable avec la commande suivante :

```bash
./gradlew jar
```

Vous pouvez ensuite exécuter le JAR avec :

```bash
java -jar build/libs/*.jar
```