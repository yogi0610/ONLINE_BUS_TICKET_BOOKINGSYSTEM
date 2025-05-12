package com.adventura.bus.service;
import com.adventura.bus.model.Route;
import java.util.List;
import java.util.Optional;
public interface RouteService 
{
    Route createRoute(Route route);
    List<Route> getAllRoutes();
    Optional<Route> getRouteById(Long id);
    Route updateRoute(Long id, Route route);
    void deleteRoute(Long id);
}
