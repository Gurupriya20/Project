FROM openjdk:17

WORKDIR /app

COPY . /app

RUN javac src/main/java/com/example/employee/EmployeeApplet.java

CMD ["java","com.example.employee.EmployeeApplet"]