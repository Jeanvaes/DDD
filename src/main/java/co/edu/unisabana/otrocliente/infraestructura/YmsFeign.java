package co.edu.unisabana.otrocliente.infraestructura;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("YMS")
public interface YmsFeign {

  @PostMapping("/checkpoint/checkin")
  void checkin();

}
