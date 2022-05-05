# Ambiente
## Update Server/Host

```
sudo apt upgrade -y
```
```
docker info
```
```
docker ps -a
```
### Parando Containers
```
docker image ls -a
```
```
docker rm -f (id do container)
```
```
docker image rm -f (id da image)
```

### Ambiente docker para Banco de Dados

```
docker run --name some-postgres -e POSTGRES_PASSWORD=mysecretpassword -d -p 5433:5432 postgres

```
### Acessar Bash do Container
```
docker exec -it some-postgres bash
```
### Logar no Postgres
```
psql -U postgres
```

### Criar BD (POO)
```
createdb poo
```
### Listar BD
```
poo \l
```
