# Dockerfile for microservices-spring-cloud-app
# Build with:
# docker build -t microservices-spring-cloud-app .
# Run with:
# docker run -p 19090:19090 --net docker-br0 --ip 172.172.1.117 --add-host nacos.acmedcare.com:172.172.1.3 --add-host mysql.acmedcare.com:172.172.1.101 --add-host trace.acmedcare.com:192.168.1.151 --add-host redis.acmedcare.com:172.172.1.101 -d -v /tmp/logs:/tmp/logs -v /tmp/logs/microservices-spring-cloud-app:/microservices-spring-cloud-app/logs --name microservices-spring-cloud-app docker.apiacmed.com/library/microservices-spring-cloud-app:2.2.0-RC1

FROM docker.apiacmed.com/env/openjdk-acmed:8-jre-alpine
MAINTAINER Elve.Xu <iskp.me@gmail.com>

ENV VERSION 2.1.0.BUILD-SNAPSHOT

RUN echo "http://mirrors.aliyun.com/alpine/v3.6/main" > /etc/apk/repositories \
    && echo "http://mirrors.aliyun.com/alpine/v3.6/community" >> /etc/apk/repositories \
    && apk update upgrade \
    && apk add --no-cache procps unzip curl bash tzdata \
    && ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \
    && echo "Asia/Shanghai" > /etc/timezone

ADD microservices-spring-cloud-app-${VERSION}.zip /microservices-spring-cloud-app/microservices-spring-cloud-app-${VERSION}.zip

RUN unzip /microservices-spring-cloud-app/microservices-spring-cloud-app-${VERSION}.zip -d /microservices-spring-cloud-app \
    && rm -rf /microservices-spring-cloud-app/microservices-spring-cloud-app-${VERSION}.zip \
    && sed -i '$d' /microservices-spring-cloud-app/bin/startup.sh \
    && echo "tail -f /dev/null" >> /microservices-spring-cloud-app/bin/startup.sh

EXPOSE 19090

CMD ["/microservices-spring-cloud-app/bin/startup.sh"]
