# Web Test Automation

Projeto de automação de testes web, maven, com os seguintes recursos:

- Java;
- Maven;
- Junit;
- Selenium;
- Cucumber (BDD);
- Padrão Page Objects

**Avisos Importantes**

Os teste foram validados no **Google Chrome** e **Mozilla Firefox**, e eu utilizei o WebDriver nas **Variáveis de Ambiente** do meu sistema. Caso você não possua o mesmo setup, eu disponibilizei as versões mais recentes do ChromeDriver e GeckoDriver para **Linux** dentro do projeto:


>/home/luis/Java-Code/SeleniumTest/chromedriver

>/home/luis/Java-Code/SeleniumTest/geckodriver

## Dependências e Plugins

        <properties>
        <maven.compiler.source>1.8</maven.compiler.source>
        <maven.compiler.target>1.8</maven.compiler.target>
        </properties>

        <dependencies>
        <!-- CUCUMBER: PARA O JUNIT EXECUTAR-->
        <dependency>
            <groupId>info.cukes</groupId>
            <artifactId>cucumber-junit</artifactId>
            <version>1.2.5</version>
            <scope>test</scope>
        </dependency>
        <!-- CUCUMBER: PARA INTERPRETAR O BDD-->
        <dependency>
            <groupId>info.cukes</groupId>
            <artifactId>cucumber-java</artifactId>
            <version>1.2.5</version>
        </dependency>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>3.141.59</version>
        </dependency>
        <dependency>
            <groupId>com.trivago.rta</groupId>
            <artifactId>cluecumber-report-plugin</artifactId>
            <version>1.2.0</version>
        </dependency>
        <dependency>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-surefire-plugin</artifactId>
            <version>3.0.0-M5</version>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.7.0</version>
                <configuration>
                    <source>1.8</source>
                    <target>1.8</target>
                    <includes>
                        <include>src/test/java</include>
                    </includes>
                </configuration>
            </plugin>
            <plugin>
                <groupId>com.trivago.rta</groupId>
                <artifactId>cluecumber-report-plugin</artifactId>
                <version>1.2.0</version>
                <executions>
                    <execution>
                        <id>report</id>
                        <phase>post-integration-test</phase>
                        <goals>
                            <goal>reporting</goal>
                        </goals>
                    </execution>
                </executions>
                <configuration>
                    <sourceJsonReportDirectory>${project.build.directory}/reports</sourceJsonReportDirectory>
                    <generatedHtmlReportDirectory>${project.build.directory}/formated-report</generatedHtmlReportDirectory>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.0.0-M5</version>
                <configuration>
                    <testFailureIgnore>true</testFailureIgnore>
                </configuration>
            </plugin>
        </plugins>
    </build>

## Planejamento dos Testes

Baseado nos Steps, criei um User Stories:

~~~gherkin
Funcionalidade: Receber o cupom desconto da qazando
    Eu como usuario da qazando
    quero receber um cupom de desconto
    para comprar um curso com valor reduzido
~~~

**Criando as Features de Teste**

Tendo em mãos os Cenários de cada fluxos de teste (fluxo base e alternativos), comecei a escrita das features em **gherkin** tendo como base o **BDD**:

> /home/luis/Java-Code/SeleniumTest/src/test/resources/features/descontos.feature

## Iniciar o Teste

Para rodar o teste, criei uma pasta **runner** onde contem uma classe **RunTest**

> /home/luis/Java-Code/SeleniumTest/src/test/java/runner/RunTest.java

Para rodar o teste via terminal 

> mvn test -Dtest=**/*RunTest cluecumber-report:reporting

Para Rodar o test selecionando tag via terminal

> mvn test -Dtest=**/*RunTest cluecumber-report:reporting -Dcucumber.options="--tags @gerar-cupom"