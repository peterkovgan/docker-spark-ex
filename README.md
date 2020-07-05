The scala example , base on the BDE's docker-spark:

https://github.com/big-data-europe/docker-spark

Do not forget to:

1) create master image (see their readme)

2) create worker image (see their readme)

3) create this app image (see their readme: https://github.com/big-data-europe/docker-spark/tree/master/template/scala)

4) define network

docker network create mynetwork

5) start master, worker and the app containers with the 

--network mynetwork




