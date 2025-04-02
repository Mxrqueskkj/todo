package br.com.micaelmarques.todoList.filter;

import java.io.IOException;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import org.springframework.stereotype.Component;

import br.com.micaelmarques.todoList.user.IUserRepository;

@Component
public class FilterTaskAuth implements Filter {

    private IUserRepository UserRepository; 

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
        throws IOException, ServletException {
        System.out.println("Chegou no filtro");
        chain.doFilter(request, response);
    }
    
}
