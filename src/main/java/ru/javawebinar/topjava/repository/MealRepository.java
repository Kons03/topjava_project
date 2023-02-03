package ru.javawebinar.topjava.repository;

import ru.javawebinar.topjava.model.MealTo;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MealRepository {

    private static long PEOPLE_COUNT;

    private List<MealTo> mealToList;

    {
        MealTo meals1 = new MealTo(++PEOPLE_COUNT, LocalDateTime.of(2020, Month.JANUARY, 30, 10, 0),
                "Breakfast", 500);
        MealTo meals2 = new MealTo(++PEOPLE_COUNT,LocalDateTime.of(2020, Month.JANUARY, 30, 13, 0),
                "Обед", 1000);
        MealTo meals3 = new MealTo(++PEOPLE_COUNT,LocalDateTime.of(2020, Month.JANUARY, 30, 20, 0),
                "Ужин", 500);
        MealTo meals4 = new MealTo(++PEOPLE_COUNT,LocalDateTime.of(2020, Month.JANUARY, 31, 0, 0),
                "Еда на граничное значение", 100);
        MealTo meals5 = new MealTo(++PEOPLE_COUNT,LocalDateTime.of(2020, Month.JANUARY, 31, 10, 0),
                "Завтрак", 1000);
        MealTo meals6 = new MealTo(++PEOPLE_COUNT,LocalDateTime.of(2020, Month.JANUARY, 31, 13, 0),
                "Обед", 500);
        MealTo meals7 = new MealTo(++PEOPLE_COUNT,LocalDateTime.of(2020, Month.JANUARY, 31, 20, 0),
                "Ужин", 410);

        mealToList = Arrays.asList(meals1,meals2,meals3,meals4,meals5,meals6,meals7);
    }

    public List<MealTo> getAll(){
        return mealToList;
    }

    public Optional<MealTo> getOne(long id){
        return Optional.ofNullable(mealToList.stream()
                .filter(mealTo -> mealTo.getId() == id)
                .findAny()
                .orElse(null));
    }

    public List<MealTo> save(long id){

    }

    public List<MealTo> update(MealTo mealTo){

    }

    public List<MealTo> delete(long id){

    }


}
