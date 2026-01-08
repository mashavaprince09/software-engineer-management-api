package com.amigoscode;

import org.springframework.data.jpa.repository.JpaRepository;

//                                                                <Entity Class, Primary Key Type>
public interface SoftwareEngineerRepository extends JpaRepository <SoftwareEngineer, Integer> {

}
