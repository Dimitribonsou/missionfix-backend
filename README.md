# 🏗️ MissionFix – Plateforme de mise en relation pour missions ponctuelles

> **MissionFix** est une plateforme web innovante de **mise en relation entre particuliers et artisans** pour la réalisation de **missions ponctuelles** (bricolage, déménagement, réparation, aide à domicile, etc.).  
> Ce projet a été conçu par **Dimitri Bonsou** et **Ronaldo Dongmo**  dans le but de **pratiquer les concepts avancés du développement Fullstack ( Angular et Sprint Boot) et DevOps**.

---

## 📘 Table des matières

1. [🎯 Objectifs du projet](#-objectifs-du-projet)
2. [🏗️ Architecture générale](#️-architecture-générale)
3. [🧱 Stack technique](#-stack-technique)
4. [📁 Organisation des dépôts](#-organisation-des-dépôts)
5. [🧩 Fonctionnalités principales](#-fonctionnalités-principales)
6. [📅 Planification du MVP (6 semaines)](#-planification-du-mvp-6-semaines)
7. [⚙️ Installation locale](#️-installation-locale)
8. [🧠 Concepts clés pratiqués](#-concepts-clés-pratiqués)
9. [🧰 Outils de développement](#-outils-de-développement)
10. [🚀 Déploiement](#-déploiement)
11. [🧩 Bonnes pratiques Git & DevOps](#-bonnes-pratiques-git--devops)
12. [👥 Équipe du projet](#-équipe-du-projet)
13. [📄 Licence](#-licence)

---

## 🎯 Objectifs du projet

MissionFix a pour but de :

- Offrir une **solution numérique simple et ergonomique** permettant de trouver un prestataire pour une tâche ponctuelle.  
- Démontrer la **maîtrise des technologies Fullstack modernes** : Angular, Spring Boot, Docker, CI/CD.  
- Pratiquer les **principes DevOps** en équipe : conteneurisation, automatisation, intégration continue, déploiement cloud.  
- Créer un **MVP complet en 6 semaines**, de la conception à la mise en production.  
- Adopter un **mode de travail collaboratif** inspiré des méthodes agiles (Scrum, Gitflow, Jira).  

---

## 🏗️ Architecture générale

Le projet est organisé selon une architecture **3 couches modernes** :

Frontend (Angular + PrimeNG + Tailwind)
↓
Backend (Spring Boot + REST API + PostgreSQL)
↓
DevOps (Docker + GitHub Actions + Netlify / Render)

**Communication :** via API REST sécurisée (JWT).  
**Base de données :** PostgreSQL.  
**Conteneurisation :** Docker Compose pour l’orchestration.  
**Déploiement :** Netlify (frontend) + Render (backend).

---

## 🧱 Stack technique

| Couche | Technologie | Description |
|--------|--------------|-------------|
| **Frontend** | Angular 20, PrimeNG, Tailwind CSS | Interface utilisateur moderne et responsive |
| **Backend** | Java 21, Spring Boot 3.5.7, Spring Security, JPA, PostgreSQL | API RESTful sécurisée |
| **Base de données** | PostgreSQL | Gestion des utilisateurs, missions, évaluations |
| **DevOps** | Docker, Docker Compose, GitHub Actions | CI/CD et conteneurisation |
| **Hébergement** | Netlify (Front), Render (API), ElephantSQL (DB) | Déploiement cloud |
| **Gestion de projet** | Jira, GitHub Projects | Suivi des tâches et des sprints |

---

## 📁 Organisation des dépôts

Le projet est réparti en **trois dépôts GitHub** indépendants pour faciliter la collaboration et le CI/CD :

| Dépôt | Description | Stack |
|-------|--------------|--------|
| **missionfix-frontend** | Interface utilisateur Angular | Angular + PrimeNG + Tailwind |
| **missionfix-backend** | API RESTful et logique métier | Spring Boot + PostgreSQL |
| **missionfix-devops** | Conteneurisation et pipeline CI/CD | Docker + GitHub Actions |

Chaque dépôt contient un **README spécifique** avec :
- instructions d’installation,  
- endpoints,  
- scripts de déploiement,  
- conventions Git.

---

## 🧩 Fonctionnalités principales

- 🔐 **Authentification sécurisée** (JWT)
- 👤 **Gestion des utilisateurs** (particuliers et prestataires)
- 🛠️ **Création et suivi des missions**
- 🔍 **Recherche de missions par localisation et catégorie**
- 💬 **Système de messagerie ou de contact simplifié**
- ⭐ **Évaluation des prestataires**
- 📱 **Interface responsive** adaptée mobile et desktop
- ⚙️ **Tableau de bord utilisateur et artisan**
- 🚀 **Déploiement cloud automatisé**


## 📅 Planification du MVP (6 semaines)

### 🕐 Semaine 1 – Préparation
- Étude de l’existant & benchmarking  
- Maquettes Figma + charte graphique  
- Mise en place des dépôts GitHub  
- Planification du sprint sur Jira  

### 🕑 Semaine 2 – Setup technique
- Initialisation Angular + Tailwind + PrimeNG  
- Setup du backend Spring Boot + PostgreSQL  
- Configuration Docker & environnement Dev  
- Création des modules d’authentification  

### 🕒 Semaine 3 – Développement core
- Modules “User” et “Mission”  
- Formulaires (Reactive Forms)  
- Sécurisation JWT + Intercepteurs HTTP  

### 🕓 Semaine 4 – Intégration front-back
- Appels API depuis Angular  
- Pages Login, Register, Dashboard  
- Responsive design  

### 🕔 Semaine 5 – Tests & optimisation
- Tests unitaires et d’intégration  
- Linting, performance, accessibilité  
- Préparation build de production  

### 🕕 Semaine 6 – DevOps & déploiement
- Configuration CI/CD GitHub Actions  
- Déploiement Netlify + Render  
- Documentation finale + démonstration

---

## ⚙️ Installation locale

### 1️⃣ Cloner les dépôts

```bash

git clone https://github.com/<user>/missionfix-backend.git

2️⃣ Lancer le backend
cd missionfix-backend
./mvnw spring-boot:run

