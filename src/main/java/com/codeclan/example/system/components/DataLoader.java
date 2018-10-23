package com.codeclan.example.system.components;

import com.codeclan.example.system.models.File;
import com.codeclan.example.system.models.Folder;
import com.codeclan.example.system.models.User;
import com.codeclan.example.system.repositories.FileRepository;
import com.codeclan.example.system.repositories.FolderRepository;
import com.codeclan.example.system.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        User user1 = new User("John");
        User user2 = new User("Kate");
        userRepository.save(user1);
        userRepository.save(user2);

        Folder myApp = new Folder("my_app", user1);
        folderRepository.save(myApp);

        File mainJS = new File("main", "javascript", 512 , myApp);
        File mainCSS = new File("style", "css", 16 , myApp);
        fileRepository.save(mainJS);
        fileRepository.save(mainCSS);








    }
}
