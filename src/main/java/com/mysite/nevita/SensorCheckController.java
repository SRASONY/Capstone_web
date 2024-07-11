package com.mysite.nevita;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sensor")
public class SensorCheckController {

    @GetMapping("/check")
    public String showSensorCheckPage() {
        return "sensorCheck";
    }

    @PostMapping("/check")
    public String checkSensor(Model model) {
        // 여기서 데이터베이스에서 아두이노 센서 확인 값을 받아오는 로직이 필요
        boolean sensorCheckPassed = false;

        // TODO: 데이터베이스 연결 및 센서 확인 로직 추가

        if (sensorCheckPassed) {
            return "redirect:/deeplearning/check";
        } else {
            model.addAttribute("error", "센서 확인 실패. 다시 시도해주세요.");
            return "sensorCheck";
        }
    }
}
