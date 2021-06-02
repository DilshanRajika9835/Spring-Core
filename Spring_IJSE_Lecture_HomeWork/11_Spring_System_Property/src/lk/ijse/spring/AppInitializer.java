package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.Properties;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();
        /*-------------------------System Environment -------------------------------------------*/
     /*   final Map<String, String> env = System.getenv();
        for (String key :env.keySet()) {
            final String value= env.get(key);
            System.out.println(key+"--->"+value);

        }*/
        /*--------------------------------------------------------------------*/
        final Properties properties = System.getProperties();
        for (Object key :properties.keySet()) {
            final Object value = properties.get(key);
            System.out.println(key+"      "+value);

        }

    }
}
/*
Spring Bean One Instantiated......
USERDOMAIN_ROAMINGPROFILE--->DILSHAN
LOCALAPPDATA--->C:\Users\DELL\AppData\Local
PROCESSOR_LEVEL--->6
IntelliJ IDEA--->C:\Program Files\JetBrains\IntelliJ IDEA 2020.1.3\bin;
FP_NO_HOST_CHECK--->NO
USERDOMAIN--->DILSHAN
LOGONSERVER--->\\MicrosoftAccount
SESSIONNAME--->Console
ALLUSERSPROFILE--->C:\ProgramData
PROCESSOR_ARCHITECTURE--->AMD64
ANDROID_HOME--->C:\Users\DELL\AppData\Local\Android\Sdk
GRADLE_HOME--->C:\Program Files\gradle-6.8.3\gradle-6.8.3
PSModulePath--->C:\Windows\system32\WindowsPowerShell\v1.0\Modules\
SystemDrive--->C:
JRE_HOME--->C:\Program Files\Java\jre1.8.0_261
java--->C:\Program Files\Java\jdk1.8.0_261\bin
APPDATA--->C:\Users\DELL\AppData\Roaming
USERNAME--->DilshanRajika
ProgramFiles(x86)--->C:\Program Files (x86)
sinhala--->C:\Program Files (x86)\SinhalaTamil IME
CommonProgramFiles--->C:\Program Files\Common Files
Path--->C:\Program Files (x86)\Notepad++;C:\Program Files (x86)\Common Files\Oracle\Java\javapath;C:\Program Files (x86)\Common Files\Intel\Shared Files\cpp\bin\Intel64;C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0\;C:\Program Files\Java\jre1.8.0_241\bin;C:\Program Files\MySQL\MySQL Server 5.7\bin;C:\Users\DELL\AppData\Local\Programs\Microsoft VS Code\code;C:\Program Files\JetBrains\IntelliJ IDEA 2020.2.1\bin;C:\Windows\system32;C:\Program Files (x86)\SinhalaTamil IME;C:\Program Files\MySQL\MySQL Server 8.0\bin;C:\Program Files\nodejs\;C:\Program Files\Microsoft VS Code\bin;C:\Program Files\nodejs\node_modules\npm\bin;C:\Program Files\Java\jdk1.8.0_261\bin;C:\apache-maven-3.8.1\bin;C:\Program Files\Git\cmd;C:\Program Files\MySQL\MySQL Shell 8.0\bin\;C:\Users\DELL\AppData\Roaming\npm;C:\Program Files\Microsoft VS Code\bin;C:\Program Files\nodejs\node_modules\npm\bin;C:\Users\DELL\AppData\Local\Android\Sdk\platform-tools;C:\Program Files\gradle-6.8.3\gradle-6.8.3\bin
PATHEXT--->.COM;.EXE;.BAT;.CMD;.VBS;.VBE;.JS;.JSE;.WSF;.WSH;.MSC
Maven_Home--->C:\apache-maven-3.8.1
OS--->Windows_NT
COMPUTERNAME--->DILSHAN
PROCESSOR_REVISION--->4e03
CommonProgramW6432--->C:\Program Files\Common Files
ComSpec--->C:\Windows\system32\cmd.exe
ProgramData--->C:\ProgramData
ProgramW6432--->C:\Program Files
HOMEPATH--->\Users\DELL
SystemRoot--->C:\Windows
TEMP--->C:\Users\DELL\AppData\Local\Temp
HOMEDRIVE--->C:
PROCESSOR_IDENTIFIER--->Intel64 Family 6 Model 78 Stepping 3, GenuineIntel
USERPROFILE--->C:\Users\DELL
TMP--->C:\Users\DELL\AppData\Local\Temp
CommonProgramFiles(x86)--->C:\Program Files (x86)\Common Files
ProgramFiles--->C:\Program Files
PUBLIC--->C:\Users\Public
NUMBER_OF_PROCESSORS--->4
windir--->C:\Windows
=::--->::\
IDEA_INITIAL_DIRECTORY--->C:\Program Files\JetBrains\IntelliJ IDEA 2020.1.3\bin
C_EM64T_REDIST11--->C:\Program Files (x86)\Common Files\Intel\Shared Files\cpp\

Process finished with exit code 0
*/

/*-----------------------------Java Env Properties-------------------------------------*/
/*java.runtime.name      Java(TM) SE Runtime Environment
sun.boot.library.path      C:\Program Files\Java\jdk1.8.0_261\jre\bin
java.vm.version      25.261-b12
java.vm.vendor      Oracle Corporation
java.vendor.url      http://java.oracle.com/
path.separator      ;
java.vm.name      Java HotSpot(TM) 64-Bit Server VM
file.encoding.pkg      sun.io
user.country      US
user.script
sun.java.launcher      SUN_STANDARD
sun.os.patch.level
java.vm.specification.name      Java Virtual Machine Specification
user.dir      C:\Users\DELL\IdeaProjects\Spring_IJSE_Lecture_HomeWork
java.runtime.version      1.8.0_261-b12
java.awt.graphicsenv      sun.awt.Win32GraphicsEnvironment
java.endorsed.dirs      C:\Program Files\Java\jdk1.8.0_261\jre\lib\endorsed
os.arch      amd64
java.io.tmpdir      C:\Users\DELL\AppData\Local\Temp\
line.separator

java.vm.specification.vendor      Oracle Corporation
user.variant
os.name      Windows 8.1
sun.jnu.encoding      Cp1252
java.library.path      C:\Program Files\Java\jdk1.8.0_261\bin;C:\Windows\Sun\Java\bin;C:\Windows\system32;C:\Windows;C:\Program Files (x86)\Notepad++;C:\Program Files (x86)\Common Files\Oracle\Java\javapath;C:\Program Files (x86)\Common Files\Intel\Shared Files\cpp\bin\Intel64;C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0\;C:\Program Files\Java\jre1.8.0_241\bin;C:\Program Files\MySQL\MySQL Server 5.7\bin;C:\Users\DELL\AppData\Local\Programs\Microsoft VS Code\code;C:\Program Files\JetBrains\IntelliJ IDEA 2020.2.1\bin;C:\Windows\system32;C:\Program Files (x86)\SinhalaTamil IME;C:\Program Files\MySQL\MySQL Server 8.0\bin;C:\Program Files\nodejs\;C:\Program Files\Microsoft VS Code\bin;C:\Program Files\nodejs\node_modules\npm\bin;C:\Program Files\Java\jdk1.8.0_261\bin;C:\apache-maven-3.8.1\bin;C:\Program Files\Git\cmd;C:\Program Files\MySQL\MySQL Shell 8.0\bin\;C:\Users\DELL\AppData\Roaming\npm;C:\Program Files\Microsoft VS Code\bin;C:\Program Files\nodejs\node_modules\npm\bin;C:\Users\DELL\AppData\Local\Android\Sdk\platform-tools;C:\Program Files\gradle-6.8.3\gradle-6.8.3\bin;C:\Program Files\JetBrains\IntelliJ IDEA 2021.1.2\bin;;.
java.specification.name      Java Platform API Specification
java.class.version      52.0
sun.management.compiler      HotSpot 64-Bit Tiered Compilers
os.version      6.3
user.home      C:\Users\DELL
user.timezone      Asia/Colombo
java.awt.printerjob      sun.awt.windows.WPrinterJob
file.encoding      UTF-8
java.specification.version      1.8
java.class.path      C:\Program Files\Java\jdk1.8.0_261\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\rt.jar;C:\Users\DELL\IdeaProjects\Spring_IJSE_Lecture_HomeWork\out\production\11_Spring_System_Property;C:\Users\DELL\IdeaProjects\Spring_IJSE_Lecture_HomeWork\01_Sprinp\src\lk\ijse\spring\lib\spring-orm-5.2.9.RELEASE.jar;C:\Users\DELL\IdeaProjects\Spring_IJSE_Lecture_HomeWork\01_Sprinp\src\lk\ijse\spring\lib\spring-websocket-5.2.9.RELEASE.jar;C:\Users\DELL\IdeaProjects\Spring_IJSE_Lecture_HomeWork\01_Sprinp\src\lk\ijse\spring\lib\spring-messaging-5.2.9.RELEASE.jar;C:\Users\DELL\IdeaProjects\Spring_IJSE_Lecture_HomeWork\01_Sprinp\src\lk\ijse\spring\lib\spring-jdbc-5.2.9.RELEASE.jar;C:\Users\DELL\IdeaProjects\Spring_IJSE_Lecture_HomeWork\01_Sprinp\src\lk\ijse\spring\lib\spring-jms-5.2.9.RELEASE.jar;C:\Users\DELL\IdeaProjects\Spring_IJSE_Lecture_HomeWork\01_Sprinp\src\lk\ijse\spring\lib\spring-test-5.2.9.RELEASE.jar;C:\Users\DELL\IdeaProjects\Spring_IJSE_Lecture_HomeWork\01_Sprinp\src\lk\ijse\spring\lib\spring-oxm-5.2.9.RELEASE.jar;C:\Users\DELL\IdeaProjects\Spring_IJSE_Lecture_HomeWork\01_Sprinp\src\lk\ijse\spring\lib\spring-webflux-5.2.9.RELEASE.jar;C:\Users\DELL\IdeaProjects\Spring_IJSE_Lecture_HomeWork\01_Sprinp\src\lk\ijse\spring\lib\spring-beans-5.2.9.RELEASE.jar;C:\Users\DELL\IdeaProjects\Spring_IJSE_Lecture_HomeWork\01_Sprinp\src\lk\ijse\spring\lib\spring-context-indexer-5.2.9.RELEASE.jar;C:\Users\DELL\IdeaProjects\Spring_IJSE_Lecture_HomeWork\01_Sprinp\src\lk\ijse\spring\lib\spring-core-5.2.9.RELEASE.jar;C:\Users\DELL\IdeaProjects\Spring_IJSE_Lecture_HomeWork\01_Sprinp\src\lk\ijse\spring\lib\spring-expression-5.2.9.RELEASE.jar;C:\Users\DELL\IdeaProjects\Spring_IJSE_Lecture_HomeWork\01_Sprinp\src\lk\ijse\spring\lib\spring-aop-5.2.9.RELEASE.jar;C:\Users\DELL\IdeaProjects\Spring_IJSE_Lecture_HomeWork\01_Sprinp\src\lk\ijse\spring\lib\spring-jcl-5.2.9.RELEASE.jar;C:\Users\DELL\IdeaProjects\Spring_IJSE_Lecture_HomeWork\01_Sprinp\src\lk\ijse\spring\lib\spring-context-support-5.2.9.RELEASE.jar;C:\Users\DELL\IdeaProjects\Spring_IJSE_Lecture_HomeWork\01_Sprinp\src\lk\ijse\spring\lib\spring-tx-5.2.9.RELEASE.jar;C:\Users\DELL\IdeaProjects\Spring_IJSE_Lecture_HomeWork\01_Sprinp\src\lk\ijse\spring\lib\spring-web-5.2.9.RELEASE.jar;C:\Users\DELL\IdeaProjects\Spring_IJSE_Lecture_HomeWork\01_Sprinp\src\lk\ijse\spring\lib\spring-context-5.2.9.RELEASE.jar;C:\Users\DELL\IdeaProjects\Spring_IJSE_Lecture_HomeWork\01_Sprinp\src\lk\ijse\spring\lib\spring-aspects-5.2.9.RELEASE.jar;C:\Users\DELL\IdeaProjects\Spring_IJSE_Lecture_HomeWork\01_Sprinp\src\lk\ijse\spring\lib\spring-instrument-5.2.9.RELEASE.jar;C:\Users\DELL\IdeaProjects\Spring_IJSE_Lecture_HomeWork\01_Sprinp\src\lk\ijse\spring\lib\spring-webmvc-5.2.9.RELEASE.jar;C:\Program Files\JetBrains\IntelliJ IDEA 2021.1.2\lib\idea_rt.jar
user.name      DilshanRajika
java.vm.specification.version      1.8
sun.java.command      lk.ijse.spring.AppInitializer
java.home      C:\Program Files\Java\jdk1.8.0_261\jre
sun.arch.data.model      64
user.language      en
java.specification.vendor      Oracle Corporation
awt.toolkit      sun.awt.windows.WToolkit
java.vm.info      mixed mode
java.version      1.8.0_261
java.ext.dirs      C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext;C:\Windows\Sun\Java\lib\ext
sun.boot.class.path      C:\Program Files\Java\jdk1.8.0_261\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\rt.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\sunrsasign.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_261\jre\classes
java.vendor      Oracle Corporation
file.separator      \
java.vendor.url.bug      http://bugreport.sun.com/bugreport/
sun.io.unicode.encoding      UnicodeLittle
sun.cpu.endian      little
sun.desktop      windows
sun.cpu.isalist      amd64

Process finished with exit code 0
*/