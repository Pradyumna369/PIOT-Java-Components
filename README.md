PIOT-Java-Components
PIOT-Java-Components is a Java-based IoT framework that models how real-world connected devices communicate securely with gateways and cloud platforms.
It was developed as part of the Programming the Internet of Things (PIoT) system architecture coursework, and demonstrates how to build modular, object-oriented software for device-to-cloud integration.

The project includes components for:

Device communication (sensors, actuators, telemetry handling)

Gateway-cloud messaging via MQTT and CoAP

Configuration management, data serialization, and test automation using JUnit

Secure connectivity through the AWS IoT SDK and TLS certificates

It showcases strong understanding of IoT architecture, Java design patterns, and scalable backend design, with a focus on clean modular interfaces and extensibility for real-world systems.

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

Tech Stack
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

Learning Outcomes:

Through this project, I developed hands-on experience in:

Designing modular Java applications using OOP and interface-driven architecture.

Implementing asynchronous communication and real-time data exchange using MQTT/CoAP.

Integrating cloud services (AWS IoT) securely into device pipelines.

Managing project dependencies, builds, and testing with Maven and JUnit.

Following clean code principles for scalable IoT component design.

