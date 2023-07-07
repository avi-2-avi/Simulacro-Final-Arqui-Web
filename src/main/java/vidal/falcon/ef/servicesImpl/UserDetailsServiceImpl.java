package vidal.falcon.ef.servicesImpl;

import vidal.falcon.ef.entities.User;
import vidal.falcon.ef.repositories.UserRepository;
import vidal.falcon.ef.security.SecurityUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepository userRespository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = userRespository.findByUserName(userName);
        if (user != null){
            return new SecurityUser(user);
        }
        throw  new UsernameNotFoundException("User not found: " + userName);
    }
}
