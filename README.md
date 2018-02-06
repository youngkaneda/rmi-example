# Remote method invocation example

>Clone este projeto executando no terminal:
```
git clone https://github.com/juanpablolvl99/rmi-example
```
>Execute o arquivo `.sh` no mesmo diretório. 
```
sh script.sh
```
>Os seguintes comandos serão executados automaticamente:
```
#!/bin/sh
#building classes
mvn clean compile
#creating stub/skeleton
cd target/classes/
rmic juan.rmi.example.HelloImpl.
#executing the name service
rmiregistry -J-Djava.rmi.server.codebase=file://.
```
> Após isso o rmiregistry será iniciado, abra uma nova aba e execute o comando. 
```
cd target/classes
``` 
> Abra outra via terminal no mesmo diretório em uma delas execute o seguinte comando para iniciar o servidor
```
java juan.rmi.example.application.server
```
>Na aba seguinte execute execute o seguinte comando para iniciar o cliente 
```
java juan.rmi.example.application.Client
```
>O output será mostrado na aba do servidor 
