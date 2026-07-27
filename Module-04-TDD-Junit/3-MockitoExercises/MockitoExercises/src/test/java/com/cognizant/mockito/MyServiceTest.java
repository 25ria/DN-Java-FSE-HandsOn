package com.cognizant.mockito;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class MyServiceTest {

    @Test
    public void testMultipleReturns() {

        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        when(mockApi.getData())
                .thenReturn("First Mock Data")
                .thenReturn("Second Mock Data");

        MyService service = new MyService(mockApi);

        assertEquals("First Mock Data", service.fetchData());
        assertEquals("Second Mock Data", service.fetchData());
    }
}