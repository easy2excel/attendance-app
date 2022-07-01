package com.easy2excel.attendance.attendanceapp.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "attendance_punch_record")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AttendancePunchRecord extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "ps_no")
    private String psNo;

    @Column(name = "in_time")
    private LocalDateTime inTime;

    @Column(name = "out_time")
    private LocalDateTime outTime;

}
