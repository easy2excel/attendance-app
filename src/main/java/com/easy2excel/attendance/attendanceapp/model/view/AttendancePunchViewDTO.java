package com.easy2excel.attendance.attendanceapp.model.view;

import com.easy2excel.attendance.attendanceapp.entity.AttendancePunchRecord;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AttendancePunchViewDTO {

    private Long punchId;

    private String psNo;

    private LocalDateTime inTime;

    private LocalDateTime outTime;

    public static AttendancePunchViewDTO from(AttendancePunchRecord punchRecord) {
        AttendancePunchViewDTO attendancePunchViewDTO;
        if (punchRecord == null) {
            attendancePunchViewDTO = null;
        } else {
            attendancePunchViewDTO = AttendancePunchViewDTO.builder()
                    .punchId(punchRecord.getId())
                    .inTime(punchRecord.getInTime())
                    .outTime(punchRecord.getOutTime())
                    .psNo(punchRecord.getPsNo())
                    .build();
        }
        return attendancePunchViewDTO;
    }
}
