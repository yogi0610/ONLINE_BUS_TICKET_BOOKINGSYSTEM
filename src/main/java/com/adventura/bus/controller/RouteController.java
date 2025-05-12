package com.adventura.bus.controller;
import com.adventura.bus.model.Route;
import com.adventura.bus.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/routes")
public class RouteController 
{
    @Autowired
    private RouteRepository routeRepository;
    @PostMapping("/create")
    public ResponseEntity<Route> createRoute(@RequestBody Route route) 
    {
        Route createdRoute = routeRepository.save(route);  
        return ResponseEntity.ok(createdRoute);  
    }
    @GetMapping("/{id}")
    public ResponseEntity<Route> getRouteById(@PathVariable Long id) 
    {
        Route route = routeRepository.findById(id).orElse(null);
        if (route != null) 
        {
            return ResponseEntity.ok(route);
        } 
        else 
        {
            return ResponseEntity.notFound().build();
        }
    }
}
