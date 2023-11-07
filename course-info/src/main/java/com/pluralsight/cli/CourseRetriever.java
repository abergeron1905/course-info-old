package com.pluralsight.cli;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
    }
}
