package com.cognizant.mockito;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;

public class MyServiceTest {

    @Test
    public void testArgumentMatching() {

        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

        service.fetchData("Riya");

        verify(mockApi).getData(anyString());
    }
}