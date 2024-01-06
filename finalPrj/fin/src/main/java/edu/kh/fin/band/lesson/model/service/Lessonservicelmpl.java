package edu.kh.fin.band.lesson.model.service;

import org.springframework.beans.factory.annotation.Autowired;

import edu.kh.fin.band.lesson.model.dao.LessonDAO;

public abstract class Lessonservicelmpl{

	@Autowired
	private LessonDAO dao;
	/*
	@Override
	public List<Lesson> selectlesson(){

		return dao.selectlesson();

	}*/

}
