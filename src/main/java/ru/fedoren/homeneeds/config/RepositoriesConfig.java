package ru.fedoren.homeneeds.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.fedoren.homeneeds.core.repositories.device.DatabaseDeviceRepository;
import ru.fedoren.homeneeds.core.repositories.device.DeviceRepository;
import ru.fedoren.homeneeds.core.repositories.homeDevice.DatabaseHomeDeviceRepository;
import ru.fedoren.homeneeds.core.repositories.homeDevice.HomeDeviceRepository;
import ru.fedoren.homeneeds.utils.database.DatabaseTasksExecutorFactory;

@Configuration
public class RepositoriesConfig {
  private DatabaseTasksExecutorFactory factory = new DatabaseTasksExecutorFactory();

  @Bean
  public HomeDeviceRepository homeDeviceRepository() {
    return new DatabaseHomeDeviceRepository(factory);
  }

  @Bean
  public DeviceRepository deviceRepository() {
    return new DatabaseDeviceRepository(factory);
  }
}
