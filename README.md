Требуемое ПО для сборки и запуска приложения:
1. jvm
2. kafka
3. maven

Инструкция по запуску приложения:

1. git clone https://github.com/mkonyukhov/receiver.git
2. cd receiver
3. mvn clean
4. mvn install
5. java -jar target/receiver-1.0.0.jar --server.port=RECEIVER_SERVER_PORT --spring.kafka.bootstrap-servers=KAFKA_BROKERS --spring.kafka.in-topic-name=IN_TOPIC_NAME