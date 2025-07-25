# Kafka Installation:

## Download a Kafka binary (e.g., Scala 2.12 or 2.13) from the official site.
## Extract the downloaded file and navigate to the Kafka folder in an administrative PowerShell.
## Start Zookeeper and Kafka servers using specified commands.

# Setting Up Microservices:

## Utilize Spring Initializr to create two microservices with dependencies on Spring Web and Kafka.
## Configure properties for Kafka consumers, including spring.kafka.consumer.group-id to define the consumer group.

# Key Concepts:

## @KafkaListener Annotation: Marks methods for message consumption from Kafka topics.
## Topics Attribute: Specifies the Kafka topic to listen to, with values resolved at runtime.
## Consumer Group: A set of consumers sharing the same group ID to balance message processing load.

# Kafka Behavior:

## Load Balancing: Kafka assigns partitions to consumers within the same group, allowing parallel processing.
## Offset Management: Kafka tracks message offsets for fault tolerance and high availability. Each consumer group maintains its offsets, enabling recovery and scalability.

# Temporary Directory and Offsets:

## The __consumer_offsets internal topic stores offsets for consumer groups, aiding in message processing continuity.
## The recovery-point-offset-checkpoint file is used for tracking last successful offsets, ensuring integrity during recovery.
## Overall, the content illustrates the practical steps to install Kafka, create microservices with Spring Boot, and understand the critical concepts of message consumption and offset management in Kafka.
