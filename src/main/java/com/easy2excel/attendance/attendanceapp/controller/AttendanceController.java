package com.easy2excel.attendance.attendanceapp.controller;

import com.easy2excel.attendance.attendanceapp.model.AttendancePunchDTO;
import com.easy2excel.attendance.attendanceapp.model.view.AttendancePunchViewDTO;
import com.easy2excel.attendance.attendanceapp.service.AttendanceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/attendance")
@Slf4j
public class AttendanceController {

    @Autowired
    AttendanceService attendanceService;

    @PostMapping("/{psNo}")
    public ResponseEntity<AttendancePunchViewDTO> addAttendance(@PathVariable("psNo") String psNo, @RequestBody AttendancePunchDTO attendanceDTO) {
        log.info("add attendance");
        return ResponseEntity.ok(attendanceService.recordAttendance(attendanceDTO));
    }
}
