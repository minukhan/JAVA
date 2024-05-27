package tacos.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


public interface UserDetailsService {
    UserDetails loaduSerByUsername(String username) throws UsernameNotFoundException;
}
