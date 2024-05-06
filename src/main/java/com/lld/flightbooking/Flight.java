package com.lld.flightbooking;

import java.util.Date;

public record Flight(int flightNo, Aircraft aircraft, Date depDate, Date arrivalDate, String fromLoc, String toLoc) {

}
