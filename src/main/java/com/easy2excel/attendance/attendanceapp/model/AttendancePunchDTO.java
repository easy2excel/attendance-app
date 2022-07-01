package com.easy2excel.attendance.attendanceapp.model;

import lombok.*;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AttendancePunchDTO {

    @NotBlank(message = "PsNo is mandatory")
    private String psNo;

    private LocalDateTime inTime;

    private LocalDateTime outTime;

}
