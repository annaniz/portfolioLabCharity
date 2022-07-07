package pl.coderslab.charity.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class LoginSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {

    private final Logger logger = LoggerFactory.getLogger(LoginSuccessHandler.class);
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws ServletException, IOException {

        CustomUserDetails userDetails = (CustomUserDetails) authentication.getPrincipal();
        logger.info("logged in username: " + userDetails.getUsername());

        String redirectURL = request.getContextPath();

        if (userDetails.hasRole("ADMIN")){
            redirectURL = "/admin";
        } else if (userDetails.hasRole("USER")) {
            redirectURL = "/";
        }
        response.sendRedirect(redirectURL);
    }
}
