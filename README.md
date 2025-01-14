# QR Code Generator

This project is a **Java-based QR Code Generator** designed with a clean, scalable, and object-oriented architecture. It provides a flexible way to generate QR codes for any textual content while following industry best practices for code organization and design.

---

## **Features**

- Generate QR codes in PNG format.
- Easy configuration for output paths and file names.
- Object-oriented design using **interfaces** and **abstract classes** for extensibility.
- Includes utilities for file handling and directory management.
- Compatible with popular IDEs like IntelliJ IDEA, Eclipse, and VS Code.

---

## **Technologies Used**

- **Java**: Core programming language.
- **QRGen Library**: For QR code generation.
- **Maven**: Build and dependency management.

---

## **Folder Structure**

```
src/
├── com/
    └── mohsin/
        └── qr/
            ├── generator/
            │   ├── QRCodeGenerator.java         // Interface
            │   ├── AbstractQRCodeGenerator.java // Abstract class
            │   ├── DefaultQRCodeGenerator.java  // Concrete implementation
            ├── utils/
            │   ├── FileHandler.java             // File utilities
            └── Main.java                         // Entry point
```

---

## **How to Use**

### **Pre-requisites**

1. **Java Development Kit (JDK)**: Ensure JDK 8 or higher is installed.
2. **Maven**: For managing dependencies and building the project.
3. **QRGen Library**: The project uses `net.glxn.qrgen` for QR code generation.
   - Add the following dependency in `pom.xml`:
     ```xml
     <dependency>
         <groupId>net.glxn</groupId>
         <artifactId>qrgen</artifactId>
         <version>2.6.0</version>
     </dependency>
     ```

### **Setup and Run**

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/MdMohsinHaider/QR-Code-Generator-in-Java.git
   cd qr-code-generator
   ```

2. **Build the Project**:
   ```bash
   mvn clean install
   ```

3. **Run the Application**:
   ```bash
   java -cp target/qr-code-generator-1.0.jar com.mohsin.qr.Main
   ```

4. **Generated QR Code**:
   - The QR code will be saved in the `output` directory within the project folder.

---

## **Code Explanation**

### **Key Components**

#### 1. **QRCodeGenerator Interface**
Defines the contract for all QR code generator implementations.
```java
public interface QRCodeGenerator {
    File generateQRCode(String content, String filePath);
}
```

#### 2. **AbstractQRCodeGenerator**
Provides shared functionality for generating QR codes.
```java
public abstract class AbstractQRCodeGenerator implements QRCodeGenerator {
    @Override
    public File generateQRCode(String content, String filePath) {
        // Implementation...
    }

    protected abstract ImageType getImageType();
}
```

#### 3. **DefaultQRCodeGenerator**
Concrete implementation that generates PNG QR codes.
```java
public class DefaultQRCodeGenerator extends AbstractQRCodeGenerator {
    @Override
    protected ImageType getImageType() {
        return ImageType.PNG;
    }
}
```

#### 4. **FileHandler Utility**
Handles directory creation and file path construction.
```java
public class FileHandler {
    public static boolean ensureDirectoryExists(String directoryPath) {
        // Implementation...
    }
}
```

#### 5. **Main Class**
Entry point to generate QR codes.
```java
public class Main {
    public static void main(String[] args) {
        // Implementation...
    }
}
```

---

## **Example Usage**

To generate a QR code:
1. Update the content in the `Main` class:
   ```java
   String content = "Hello, this is a QR Code!";
   String filePath = "output/qr_code.png";
   ```
2. Run the program.
3. Find the generated file in the `output` directory.

---

## **Contributing**

1. Fork the repository.
2. Create a new branch for your feature or bug fix:
   ```bash
   git checkout -b feature/new-feature
   ```
3. Commit your changes:
   ```bash
   git commit -m "Add new feature"
   ```
4. Push to the branch:
   ```bash
   git push origin feature/new-feature
   ```
5. Submit a pull request.

---

## **License**
This project is licensed under the MIT License.

---

## **Contact**
For any questions or support, please contact:
- **Md Mohsin Haider**  
- **Email**: [mdmohsinhaider6@gmail.com]
- **GitHub**: [https://github.com/MdMohsinHaider]

