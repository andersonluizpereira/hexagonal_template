package com.comunidade.app.application.core.usecase;

import com.comunidade.app.application.ports.in.DeleteCustomerByIdInputPort;
import com.comunidade.app.application.ports.in.FindCustomerByIdInputPort;
import com.comunidade.app.application.ports.out.DeleteCustomerByIdOutputPort;

public class DeleteCustomerByIdUseCase implements DeleteCustomerByIdInputPort {

    private final FindCustomerByIdInputPort findCustomerByIdInputPort;

    private final DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort;

    public DeleteCustomerByIdUseCase(
            FindCustomerByIdInputPort findCustomerByIdInputPort,
            DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort
    ) {
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.deleteCustomerByIdOutputPort = deleteCustomerByIdOutputPort;
    }

    @Override
    public void delete(final String id) {
        findCustomerByIdInputPort.find(id);
        deleteCustomerByIdOutputPort.delete(id);
    }

}
