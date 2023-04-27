package me.kodysimpson.musicarchivebackend;

import me.kodysimpson.musicarchivebackend.repository.SongRepository;
import me.kodysimpson.musicarchivebackend.services.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MusicArchiveBackendApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MusicArchiveBackendApplication.class, args);

        StorageService storageService = context.getBean(StorageService.class);

        System.out.println(storageService.getSongFileNames());
    }

}
