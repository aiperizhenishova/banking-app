package com.example.bankingapp;

import com.example.bankingapp.entities.Client;
import com.example.bankingapp.entities.Consultant;
import com.example.bankingapp.entities.Service;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@Component      //этот класс является компонентом
public class InitialDataLoader {

    @PersistenceContext    // мы хотим использовать entityManager для работы с базой данных.
    private EntityManager entityManager;

    @Transactional
    public void loadInitialData() {   // Метод loadInitialData(): Этот метод начинает загрузку начальных данных. Он обернут в транзакцию, чтобы все операции были атомарными.
        loadClients();
        loadConsultants();
        loadServices();
    }


    //loadClients(), loadConsultants(), loadServices():
    // Эти методы загружают данные из CSV файлов и сохраняют их в базу данных.
    private void loadClients() {    //объявляем приватный метод loadClients(), который загружает данные клиентов из файла.
        List<Client> clients = new ArrayList<>();    //создаем пустой список клиентов, чтобы поместить данные из CSV файла.
        try {
            InputStream inputStream = getClass().getResourceAsStream("/initial_data_clients.csv");
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;     // строковая переменная line, которая будет содержать каждую строку из файла.
            while ((line = reader.readLine()) != null) {    //начинаем цикл, который будет выполняться до тех пор, пока есть строки в файле для чтения.
                String[] data = line.split(",");      //разбиваем строку на части, используя запятую в качестве разделителя, и сохраняем части в массив строк data.
                Client client = new Client();      //Мы создаем новый объект Client и устанавливаем его имя и идентификатор паспорта на основе данных из CSV строки.
                client.setName(data[0]);
                client.setPassportId(data[1]);
                clients.add(client);      //добавляем созданный клиент в список клиентов.
            }
            reader.close();      // закрываем поток чтения файла.

        } catch (Exception e) {    //ловим любые исключения, которые могут возникнуть во время чтения файла, и выводим их на консоль для отладки.
            e.printStackTrace();
        }
        clients.forEach(entityManager::persist); //используем entityManager, чтобы сохранить каждого клиента в базу данных.
    }



    private void loadConsultants() {
        List<Consultant> consultants = new ArrayList<>();
        try {
            InputStream inputStream = getClass().getResourceAsStream("/initial_data_consultants.csv");
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                Consultant consultant = new Consultant();
                consultant.setName(line);
                consultants.add(consultant);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        consultants.forEach(entityManager::persist);
    }

    private void loadServices() {
        List<Service> services = new ArrayList<>();
        try {
            InputStream inputStream = getClass().getResourceAsStream("/initial_data_services.csv");
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                Service service = new Service();
                service.setCard(Long.parseLong(data[0]));
                service.setCredit(Long.parseLong(data[1]));
                service.setTransfer(Long.parseLong(data[2]));
                services.add(service);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        services.forEach(entityManager::persist);
    }
}
