package com.example.c196_course_scheduler_austin_thomas.Entities;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "assessment_table")
public class Assessment {
    @PrimaryKey(autoGenerate = true)
    private int assessmentId;
    private int courseId;
    private String assessmentTitle;
    private Date dueDate;
    private String assessmentType;
    private Date goalDate;

    public Assessment(int courseId, String assessmentTitle, Date dueDate, String assessmentType, Date goalDate) {
        this.courseId = courseId;
        this.assessmentTitle = assessmentTitle;
        this.dueDate = dueDate;
        this.assessmentType = assessmentType;
        this.goalDate = goalDate;
    }

    public void setAssessmentId(int assessmentId) {
        this.assessmentId = assessmentId;
    }

    public int getAssessmentId() {
        return assessmentId;
    }

    public String getAssessmentTitle() { return assessmentTitle; }

    public int getCourseId() {
        return courseId;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public String getAssessmentType() {
        return assessmentType;
    }

    public Date getGoalDate() {
        return goalDate;
    }
}
