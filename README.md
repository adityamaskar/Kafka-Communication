# Kafka-Communication

Project Highlight: Scalable Microservice Communication with Kafka 🚀

I recently completed a mini project that demonstrates the power of Apache Kafka in a microservices architecture. 
The setup includes two Spring Boot applications, 
where one service sends messages, and the other consumes them, using Kafka as the communication backbone.

Here’s how I’ve structured the solution:

🔹 3 Kafka Brokers for load balancing and fault tolerance
🔹 3 Partitions to parallelize message consumption 
🔹 3 Replicas for high availability

Partitioning:
Kafka divides each topic into partitions, allowing messages to be distributed across multiple brokers. This
means that the topic data is split into smaller, more manageable segments, which enables parallel processing. 
Each partition can be consumed by a different consumer, meaning multiple consumers can process messages from the same topic simultaneously.
We have one consumer application but if we create three instance of it, kafka will assign each partition a separate consumer automatically

Benefits:
Parallelism: More partitions mean more consumers can process data in parallel, leading to better performance.
Scalability: As demand grows, you can easily add more partitions and consumers, enabling Kafka to handle large volumes of data.
Replication:
Kafka ensures high availability and fault tolerance through replication. Each partition can have multiple replicas, which are distributed across different brokers. 
If one broker fails, Kafka can continue to serve messages from the replicas, ensuring no data loss or downtime.

Benefits:
Fault Tolerance: Even if a broker goes down, the replicas on other brokers ensure that the data is still available.
Durability: Messages remain durable because they are stored on multiple brokers through replication.
By leveraging Kafka’s partitioning and replication, we can easily scale this system to handle millions of messages per second while ensuring reliability, parallelism, and high availability.

Scalability:
By partitioning topics, Kafka ensures that each consumer can process data concurrently, making it easy to scale up by simply adding more consumers or partitions. 
The replication ensures high availability, protecting against data loss and broker failures.

With this setup, organizations can build resilient and scalable systems capable of handling real-time data streams effectively.

***********************
Steps for broker : -
Commands if we are working from direct kafka ->
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties  ---> to start zookeeper

.\bin\windows\kafka-server-start.bat .\config\server.properties  ---> to start broker, if we need multiple brokers please use separate port/id/logs path, create separate server.prop file and use accordingly

.\bin\windows\kafka-topics.bat --create --topic emp-notification --bootstrap-server localhost:9092,localhost:9094,localhost:9096 --partitions 3 --replication-factor 3 
--> used to create a topic with num of partition and replications -> Created topic emp-notification.
----------------------------------------------------------------------------------------------------------------------