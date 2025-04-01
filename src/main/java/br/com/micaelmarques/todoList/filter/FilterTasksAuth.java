package br.com.micaelmarques.todoList.filter;

import java.io.IOException;
import java.nio.file.DirectoryStream.Filter;
import java.rmi.ServerException;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class FilterTasksAuth implements Filter{
    
    @Override
    public boolean accept(Object entry) throws IOException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'accept'");
    }
    
    /*
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
        throws IOException, SecurityException{
            System.out.println("Chegou no filtro");
            chain.doFilter(request, response);
        }*/
}
