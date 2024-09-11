docker exec -u root -it jenkins bash
docker exec -it jenkins bash

apt-get update && apt-get install -y docker.io
ls -l /var/run/docker.sock
usermod -aG docker jenkins
usermod -aG systemd-network jenkins
newgrp docker