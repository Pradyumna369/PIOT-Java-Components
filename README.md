PIOT-Java-Components

PIOT-Java-Components is a modular Java framework designed to support device-to-cloud IoT communication, configuration management, and data exchange.
It serves as a foundation for building scalable IoT systems and demonstrates strong object-oriented design, multi-protocol communication (MQTT, CoAP), and cloud integration concepts.

Overview

This project showcases the core building blocks of an IoT ecosystem — including device clients, gateway controllers, configuration modules, and testing scaffolds — implemented in Java.
Developed as part of the Programming the Internet of Things (PIoT) coursework, the repository focuses on modularity, reusability, and extensibility, following clean coding and software design principles.

Key Highlights

Device–Gateway–Cloud Architecture: Implements layered IoT communication between local devices and cloud endpoints.

Protocol Support:

MQTT for lightweight publish–subscribe messaging (via Eclipse Paho).

CoAP for constrained application protocol testing (via Eclipse Californium).

AWS IoT SDK Integration: Demonstrates secure, TLS-based connectivity between devices and cloud services.

Data Serialization: Uses Google Gson for structured data exchange between components.

Configuration Management: Dynamic loading of device and gateway configuration files using Apache Commons Configuration.

Test-Driven Development: Includes JUnit test skeletons organized by module (Part 1–4) to validate functionality.

Build Automation: Managed using Apache Maven for dependency resolution and modular builds.

🛠 Tech Stack
Category	Tools / Frameworks
Language	Java 11+
Build System	Apache Maven
Messaging	Eclipse Paho (MQTT)
Networking	Eclipse Californium (CoAP)
Cloud SDK	AWS IoT Device SDK for Java
Data Handling	Gson (JSON serialization)
Configuration	Apache Commons Configuration
Testing	JUnit 5
Version Control	Git / GitHub
📂 Project Structure
PIOT-Java-Components/
│
├── config/                 # Configuration templates
├── src/
│   ├── main/java/          # Shell classes & core logic
│   └── test/java/          # JUnit test scaffolds (Parts 1–4)
├── pom.xml                 # Maven dependencies & build config
└── README.md

⚙️ Getting Started

Clone and build

git clone https://github.com/Pradyumna369/PIOT-Java-Components.git
cd PIOT-Java-Components
mvn clean install


Explore and implement

Open src/main/java to view shell classes for each IoT component.

Follow the test cases under src/test/java to verify your implementations.

Run tests

mvn test

💡 Learning Outcomes

Through this project, I developed hands-on experience in:

Designing modular Java applications using OOP and interface-driven architecture.

Implementing asynchronous communication and real-time data exchange using MQTT/CoAP.

Integrating cloud services (AWS IoT) securely into device pipelines.

Managing project dependencies, builds, and testing with Maven and JUnit.

Following clean code principles for scalable IoT component design.

🔭 Future Enhancements

Add REST API layer for device telemetry data.

Integrate containerized deployment using Docker.

Extend to support additional protocols (HTTP, WebSocket).

Build analytics module for telemetry visualization.
