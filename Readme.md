JENKINS

Objectif : Génerer un .jar à partir du repository Git : https://github.com/Ozz007/sb3t
Utilisation :
- Lancer le docker compose
- Aller sur l'interface Jenkins
- Lancer la pipeline avec les paramètres et attendre que ce soit fini

TERRAFORM/IAC

Objectif : Générer une instance aws et y accéder en SSH
Comment l'utiliser :
- Lancer le docker compose
- Lancer la pipeline terraform pour créer une instance aws et utiliser la pipeline terrafom-destroy pour la détruire.
- Vous pouvez ainsi y accéder en ssh avec votre ip. (ssh -i ./ssh/id_rsa deploy@public_ip)

ANSIBLE/CAC

Objectif : Configuer l'instance aws et déployer l'application java
Comment l'utiliser :
- Lancer le docker-compose
- Lancer le playbook pour déployer l'application java avec les paramètres souhaités