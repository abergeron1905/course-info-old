package com.pluralsight.cli;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pluralsight.cli.service.CourseRetrieverService;

public class CourseRetriever {
    private static final Logger LOG = LoggerFactory.getLogger(CourseRetriever.class);
    public static void main(String[] args) {
        
        LOG.info("CourseRetriever started");
        if (args.length == 0) {
            LOG.warn("Please provide an author name as first argument");
        } 

        try {
            retrieveCourses(args[0]);
        } catch (Exception e) {
            LOG.error("Unexpected error", e);
            e.printStackTrace();
        }
        
    }
    
    private static void retrieveCourses(String authorName) {
        LOG.info("Retrieving courses for author {}" + authorName);
        CourseRetrieverService courseRetrieverservice = new CourseRetrieverService();

        String coursesToStore  = courseRetrieverservice.getCoursesFor(authorName);
        LOG.info("Retrieved the following courses {}", coursesToStore);
    }
}
