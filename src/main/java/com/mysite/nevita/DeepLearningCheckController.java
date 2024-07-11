package com.mysite.nevita;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/deeplearning")
public class DeepLearningCheckController {

    @GetMapping("/check")
    public String showDeepLearningCheckPage() {
        return "deeplearningCheck";
    }

    @PostMapping("/check")
    public String checkDeepLearning(Model model, MultipartFile helmetImage) {
        // 여기서 데이터베이스에서 딥러닝 착용 확인 값을 받아오는 로직이 필요
        boolean deepLearningCheckPassed = false;

        // TODO: 데이터베이스 연결 및 헬멧 착용 확인 로직 추가

        if (deepLearningCheckPassed) {
            return "redirect:/work";
        } else {
            model.addAttribute("error", "헬멧 착용 확인 실패. 다시 시도해주세요.");
            return "deeplearningCheck";
        }
    }
}
