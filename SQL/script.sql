#1
SELECT 
	book_ref,
	CASE WHEN total_amount IS NULL
		then "UNDEFINED"
		else "DEFINED"
		END AS amount_status
FROM bookings;

#2
SELECT
	boarding_no,
	ticket_no
FROM boarding_passes
WHERE 
	flight_id = 9891 OR 
	flight_id = 2450 OR 
    flight_id = 443 OR 
    flight_id = 5297
ORDER BY 
	boarding_no, 
	seat_no DESC, 
    flight_id DESC;

#3
SELECT
	ticket_no
FROM boarding_passes
WHERE
	flight_id = 9891 OR
    flight_id = 2450 OR
    flight_id = 443 OR
    flight_id =5297
ORDER BY
	boarding_no;
  
#4
SELECT
	passenger_name AS passenger,
	CASE WHEN phone IS NULL
		THEN "UNDEFINED"
		ELSE phone
		END AS phone
FROM tickets
WHERE passenger_name like "ANNA%";

#5
SELECT
	UPPER (flight_no) AS FLIGHT_NO,
	UPPER (status) AS STATUS,
    UPPER (departure_airport) AS DEPARTURE_AIRPORT
FROM flights
WHERE
	departure_airport = "DME" OR
    arrival_airport = "DME";
  
#6
SELECT
	flight_no AS flight
FROM flights
WHERE
	status = "Arrived" AND
    flight_id BETWEEN 130 AND 1045;
  
#7
SELECT
	ticket_no,
    flight_id,
    amount *
	CASE 
    	WHEN flight_id = 26014 OR flight_id = 7766 OR flight_id = 5336 AND fare_conditions = "Economy"
  			THEN 0.85
    	WHEN flight_id = 26014 OR flight_id = 7766 OR flight_id = 5336 AND fare_conditions = "Business"
        	THEN 0.9
        WHEN flight_id = 26014 OR flight_id = 7766 OR flight_id = 5336 AND fare_conditions = "Comfort"
        	THEN 0.8
        ELSE 1
    END AS new_amount
FROM ticket_flights; 
    
#8
SELECT
	*
FROM ticket_flights
WHERE COALESCE (fare_conditions, "NULL") NOT IN ("Economy", "NULL");

#9
SELECT
	*
FROM ticket_flights
WHERE flight_id IS NOT NULL;

#10
SELECT
	passenger_name
FROM tickets
WHERE
	ticket_no LIKE "%41" AND phone NOT LIKE "+705%" OR
    ticket_no LIKE "%29" AND phone NOT LIKE "+705%";