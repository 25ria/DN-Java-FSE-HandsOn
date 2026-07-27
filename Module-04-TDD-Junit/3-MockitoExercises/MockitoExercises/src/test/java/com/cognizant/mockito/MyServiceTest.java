package com.cognizant.mockito;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;

public class MyServiceTest {

    @Test
    public void testVoidMethod() {

        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        doNothing().when(mockApi).processData();

        MyService service = new MyService(mockApi);

        service.execute();

        verify(mockApi).processData();
    }
}