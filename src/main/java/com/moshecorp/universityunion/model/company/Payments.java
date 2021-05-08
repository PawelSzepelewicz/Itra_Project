package com.moshecorp.universityunion.model.company;

import com.moshecorp.universityunion.model.abstarct.AbstractEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "payments")
public class Payments extends AbstractEntity {

    private Long userId;
    private Long companyId;
    private Timestamp paymentDatetime;
    @Column(name = "sum")
    private Long paymentSum;

}
