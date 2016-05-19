package ru.javawebinar.topjava.service;

import ru.javawebinar.topjava.model.UserMeal;
import ru.javawebinar.topjava.util.exception.NotFoundException;

import java.util.Collection;

/**
 * GKislin
 * 15.06.2015.
 */
public interface UserMealService {

    UserMeal save(int userId, UserMeal userMeal);

    UserMeal get(int userId, int mealId) throws NotFoundException;

    Collection<UserMeal> getAll(int userId);

    void update(int userId, UserMeal userMeal) throws NotFoundException;

    void delete(int userId, int mealId) throws NotFoundException;

}