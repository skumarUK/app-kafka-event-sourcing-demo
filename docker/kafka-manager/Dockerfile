FROM phusion/baseimage:latest

ENV ZK_HOSTS=localhost:2181 \
  KMANAGER_VERSION=1.3.3.14 \
  KMANAGER_REVISION=5de818f330365fc3cd835b8227875ad12f29ed15 \
  KMANAGER_CONFIG="conf/application.conf" \
  TERM=xterm

COPY kmanager-start.sh /tmp/

RUN \
echo oracle-java8-installer shared/accepted-oracle-license-v1-1 select true | debconf-set-selections && \
  add-apt-repository -y ppa:webupd8team/java && \
  apt-get update && \
  apt-get install -y git wget tar vim mc unzip lsof && \
  apt-get install -y oracle-java8-installer && \
  apt-get install -y wget supervisor dnsutils curl jq coreutils docker net-tools && \
  #mkdir -p /usr/share/info/dir && \
  #mkdir -p /usr/share/man/man1 && \
  cd /tmp && \
  git clone https://github.com/yahoo/kafka-manager && \
  cd /tmp/kafka-manager && \
  git checkout ${KMANAGER_REVISION} && \
  echo 'scalacOptions ++= Seq("-Xmax-classfile-name", "200")' >> build.sbt && \
  ./sbt clean dist && \
  unzip  -d /tmp ./target/universal/kafka-manager-${KMANAGER_VERSION}.zip && \
  cd /tmp/kafka-manager-${KMANAGER_VERSION} && \
  rm -rf README.md bin/*.bat share/ && \
  cd /tmp && \
  yes | mv /tmp/kafka-manager-${KMANAGER_VERSION} /opt && \
  mv /opt/kafka-manager-${KMANAGER_VERSION} /opt/kafka-manager && \
  sed -i -e 's|INFO|ERROR|g' /opt/kafka-manager/conf/logback.xml && \
  sed -i -e 's|WARN|ERROR|g' /opt/kafka-manager/conf/logback.xml && \
  sed -i -e 's|INFO|ERROR|g' /opt/kafka-manager/conf/logger.xml && \
  mv /tmp/kmanager-start.sh /opt/kafka-manager/ && \
  chmod +x /opt/kafka-manager/kmanager-start.sh && \
  rm -rf /var/lib/apt/lists/* && \
  rm -rf /var/cache/oracle-jdk8-installer && \
  rm -fr /tmp/* /root/.sbt /root/.ivy2   && \
  apt-get clean

WORKDIR /opt/kafka-manager

EXPOSE 9000

ENTRYPOINT ["./kmanager-start.sh"]