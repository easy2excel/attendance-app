package com.easy2excel.attendance.attendanceapp.repository;

import com.easy2excel.attendance.attendanceapp.entity.AttendancePunchRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendancePunchRecordRepository extends JpaRepository<AttendancePunchRecord, Long> {
}
