package com.active.presentation.controller;

import com.active.presentation.domain.PresentationDashboard;
import com.active.presentation.domain.Speaker;
import com.active.presentation.repository.SpeakerRepository;
import com.active.presentation.security.SecurityContext;
import com.active.presentation.security.UserCookieGenerator;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by bungubbang
 * Email: sungyong.jung@sk.com
 * Date: 6/19/14
 */
@Controller
public class DefaultController {

    @Value("${application.url}")
    public String host;

    @Autowired
    private SpeakerRepository speakerRepository;

    private final UserCookieGenerator userCookieGenerator = new UserCookieGenerator();

    @RequestMapping("/")
    public String index(HttpServletRequest request) {
        if(isLoginUser(request)) {
            return "redirect:/admin";
        }
        return "landing";
    }

    @RequestMapping("/qr/{id}")
    public ResponseEntity qrcode(@PathVariable Long id, HttpServletRequest request) {
        String url = host + "/" + String.valueOf(id);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_PNG);
        return new ResponseEntity(QRCode.from(url).to(ImageType.PNG).withSize(500, 500).stream().toByteArray(), headers, HttpStatus.OK);
    }

    @RequestMapping("/signin")
    public String signin() {
        return "signup";
    }

    @RequestMapping("/signout")
    public String signout() {
        return "signout";
    }

    private boolean isLoginUser(HttpServletRequest request) {
        String userId = userCookieGenerator.readCookieValue(request);

        if (userId == null || userId.isEmpty()) {
            return false;
        }

        Speaker speaker = speakerRepository.findOne(Long.valueOf(userId));
        if(speaker == null) {
            return false;
        }

        return true;
    }
}
