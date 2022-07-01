package com.easy2excel.attendance.attendanceapp.service;

import com.easy2excel.attendance.attendanceapp.entity.AttendancePunchRecord;
import com.easy2excel.attendance.attendanceapp.model.AttendancePunchDTO;
import com.easy2excel.attendance.attendanceapp.model.view.AttendancePunchViewDTO;
import com.easy2excel.attendance.attendanceapp.repository.AttendancePunchRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttendanceService {

    @Autowired
    AttendancePunchRecordRepository attendancePunchRecordRepository;

    public AttendancePunchViewDTO recordAttendance(AttendancePunchDTO attendanceDTO) {

        AttendancePunchRecord punchRecord;

        // if no record in same day
        punchRecord = AttendancePunchRecord.builder()
                .inTime(attendanceDTO.getInTime())
                .outTime(attendanceDTO.getOutTime())
                .psNo(attendanceDTO.getPsNo())
                .build();

        AttendancePunchRecord punchRecord1 = attendancePunchRecordRepository.save(punchRecord);
        return AttendancePunchViewDTO.from(punchRecord);
    }
}
