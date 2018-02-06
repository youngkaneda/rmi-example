#!/bin/sh

#building classes
mvn clean compile

#creating stub/skeleton
cd target/classes/
rmic juan.rmi.example.HelloImpl.

#executing the name service
rmiregistry -J-Djava.rmi.server.codebase=file://.