package com.utilities;

import com.relevantcodes.extentreports.ExtentReports;
/**
 * @author Gaurav.suryawanshi
 *Objective: ExtentReports extent instance created here. That instance can be reachable by getReporter() method.
 */

public class ExtentManager {

    /*create an instance of ExtendRrports*/
    private static ExtentReports extent;

    public synchronized static ExtentReports getReporter(){
        if(extent == null){
            String workingDir = System.getProperty("user.dir");
            extent = new ExtentReports(workingDir + "\\ExtentReports\\ExtentReportResults.html", true);
        }
        return extent;
    }
}