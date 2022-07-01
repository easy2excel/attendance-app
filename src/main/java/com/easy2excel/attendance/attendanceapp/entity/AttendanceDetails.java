package com.easy2excel.attendance.attendanceapp.entity;

import com.easy2excel.attendance.attendanceapp.model.Shift;
import com.easy2excel.attendance.attendanceapp.model.Status;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "attendance_details")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AttendanceDetails extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "ps_no", nullable = false)
    private String psNo;

    @Column(name = "shift")
    @Enumerated(EnumType.STRING)
    private Shift shift;

    @Column(name = "in_time")
    private LocalDateTime inTime;

    @Column(name = "late_in")
    private double lateIn;

    @Column(name = "out_time")
    private LocalDateTime outTime;

    @Column(name = "erl_out")
    private double erlOut;

    @Column(name = "work_time")
    private double workTime;

    @Column(name = "over_time")
    private double overTime;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(name = "remark")
    private String remark;

}
