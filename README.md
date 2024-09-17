# Java Installation Guide

### Prerequisites
Before running this project, ensure that Java is installed on your system. Follow the instructions below for your respective operating system.

---

## Windows

### Step 1: Download Java JDK
1. Go to the official Oracle JDK download page:  
   [https://www.oracle.com/java/technologies/javase-downloads.html](https://www.oracle.com/java/technologies/javase-downloads.html)
2. Download the **Java SE Development Kit** (JDK) for Windows.

### Step 2: Install Java
1. Run the downloaded `.exe` file.
2. Follow the on-screen instructions to complete the installation.

### Step 3: Set up Java Environment Variables
1. Open **Start** and search for `Environment Variables`.
2. Click on **Edit the system environment variables**.
3. Under the **System Properties** window, click on **Environment Variables**.
4. Under **System Variables**, find the `Path` variable and click **Edit**.
5. Click **New** and add the path to your Java `bin` directory (e.g., `C:\Program Files\Java\jdk-17\bin`).
6. Click **OK** to save the changes.

### Step 4: Verify the Installation
1. Open **Command Prompt** and type the following command:
   ```bash
   java -version
