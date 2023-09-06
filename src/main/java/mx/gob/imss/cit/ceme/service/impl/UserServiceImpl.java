package mx.gob.imss.cit.ceme.service.impl;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import mx.gob.imss.cit.ceme.persistence.repository.UserRepository;
import mx.gob.imss.cit.ceme.service.UserService;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;

	@Override
	public UserDetailsService userDetailsService() {

		return new UserDetailsService() {

			@Override
			public UserDetails loadUserByUsername(String username) {
				// solo prueba
				// User user = new User("mezclas@test.com", "$2a$10$sNFJnqzfDfPcv/GmQkbx3Oht/W4iSWFRGJes7ot/jzGajAr7KvzTy",List.of(newSimpleGrantedAuthority("USER")));
				// return user;
				return userRepository.findByEmail(username)
						.orElseThrow(() -> new UsernameNotFoundException("User not found"));
			}
		};
	}
}
