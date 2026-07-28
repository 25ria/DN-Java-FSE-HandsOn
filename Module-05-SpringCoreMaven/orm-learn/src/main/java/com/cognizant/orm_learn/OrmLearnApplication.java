package com.cognizant.orm_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.orm_learn.entity.Country;
import com.cognizant.orm_learn.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(OrmLearnApplication.class);

    private static CountryService countryService;

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(OrmLearnApplication.class, args);

        countryService = context.getBean(CountryService.class);

        testSearchCountries();
        testSearchCountriesSorted();
        testSearchCountriesStartingWith();
    }

    private static void testAddCountry() {

        LOGGER.info("Start");

        Country country = new Country();
        country.setCode("ZZ");
        country.setName("Test Country");

        countryService.addCountry(country);

        LOGGER.info("End");
    }
    private static void testSearchCountries() {

    LOGGER.info("Search Countries");

    countryService.searchCountries("ou")
            .forEach(country ->
                    LOGGER.info("{} - {}", country.getCode(), country.getName()));
}

private static void testSearchCountriesSorted() {

    LOGGER.info("Search Countries Sorted");

    countryService.searchCountriesSorted("ou")
            .forEach(country ->
                    LOGGER.info("{} - {}", country.getCode(), country.getName()));
}

private static void testSearchCountriesStartingWith() {

    LOGGER.info("Search Countries Starting With Z");

    countryService.searchCountriesStartingWith("Z")
            .forEach(country ->
                    LOGGER.info("{} - {}", country.getCode(), country.getName()));
}
}