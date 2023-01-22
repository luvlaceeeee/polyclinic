package ru.rsreu.polyclinic.database.dao;

import ru.rsreu.polyclinic.data.Doctor;
import ru.rsreu.polyclinic.data.User;

public interface DoctorDetailsDAO {
    void editDoctorDetails(Doctor doctor);
    void addDoctorDetails(Doctor doctor);
    Doctor returnDoctor(User user);
}
