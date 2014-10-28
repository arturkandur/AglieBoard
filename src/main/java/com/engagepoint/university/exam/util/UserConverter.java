package com.engagepoint.university.exam.util;


import com.engagepoint.university.exam.dao.impl.UserDaoImpl;
import com.engagepoint.university.exam.entity.User;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import java.util.List;

@FacesConverter(value="user")
public class UserConverter implements Converter {

    private List<User> userList;

    @Inject
    UserDaoImpl userDao;

    public Object getAsObject(FacesContext facesContext, UIComponent component, String submittedValue) {
        userList = userDao.getAll();

        if (submittedValue.trim().equals("")) {
            return null;
        } else {
            try {
                int number = Integer.parseInt(submittedValue);

                for (User user : userList) {
                    if (user.getId() == number) {
                        return user;
                    }
                }

            } catch(NumberFormatException exception) {
                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Conversion Error", "Not a valid player"));
            }
        }

        return null;
    }

    public String getAsString(FacesContext facesContext, UIComponent component, Object value) {
        userList = userDao.getAll();

        if (value == null || value.equals("")) {
            return "";
        } else {
            return String.valueOf(((User) value).getId());
        }
    }

}
