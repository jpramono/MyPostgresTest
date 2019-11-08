FROM openjdk:8u181-jre-alpine

MAINTAINER joko

ENV DOCKYARD_SRC=target/universal/
# Directory in container for all project files
ENV DOCKYARD_SRVHOME=/srv
# Directory in container for project source files
ENV DOCKYARD_SRVPROJ=$DOCKYARD_SRVHOME/
RUN apk add --no-cache bash

WORKDIR $DOCKYARD_SRVHOME
VOLUME ["$DOCKYARD_SRVHOME/logs/"]
