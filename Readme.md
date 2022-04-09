# SpringBoot device seller

### Endpoints

## Sign Up

POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 76

{
    "name": "abdula",
    "username": "abdl",
    "password": "1234"
}

## Sign In

POST /api/authentication/sign-in HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 53

{
    "username": "abdl",
    "password": "1234"
}


## Change User Role


PUT /api/user/change/ADMIN HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhYmRsIiwicm9sZXMiOiJST0xFX1VTRVIiLCJ1c2VySWQiOjEsImV4cCI6MTY0OTQyMjA1OH0.XM8dn4-Io3pSmmmtj7nEf3n_K5G4ddU6XG4ElDqsA2dkQXB57EB4XgJSw04V73BBsQBaFaegM6zsMFZ_WcnFWQ


## Save Devices


POST /api/device/save-device HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhYmRsIiwicm9sZXMiOiJST0xFX0FETUlOIiwidXNlcklkIjoxLCJleHAiOjE2NDk0MjUwMjh9.WdRTTpypoDb4OuOwXcDlIeC-1U6dmTC6DvOEjfEMrkxzrNfQqGYVbilvIcaAjQWB7folH_f7cjVqviFTVC4jEA
Content-Type: application/json
Content-Length: 138

{
    "name" : "Hp Elitebook",
    "description" : "8G Ram, 256 SSD, 13.6 inches",
    "price" : 22000,
    "deviceType" : "LAPTOP"
}


## find all Devices

GET /api/device/find-all-devices HTTP/1.1
Host: localhost:8080


## delete devices


DELETE /api/device/delete-device/2 HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhYmRsIiwicm9sZXMiOiJST0xFX0FETUlOIiwidXNlcklkIjozLCJleHAiOjE2NDk0MTkwMzB9.aXkr2X1iWvKkkLPllSxOveJpO773ycuS7PraLsjj4YwXMVlcoMQc8VkoEBLqT6yeErBWJFtewQmW6-Bs0JXFeA


## save purchases


POST /api/purchases/save HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhYmRsIiwicm9sZXMiOiJST0xFX0FETUlOIiwidXNlcklkIjozLCJleHAiOjE2NDk0MTk2MzJ9.tJdY7au_KlzD1GPYVlyeFPOe-mStaytFX4lHjlWPanqhNs59_9_Hsy4AefVLYZWCRe8WOaP0nkIlExzfZEVB3Q
Content-Type: application/json
Content-Length: 88

{
    "userId": 1,
    "deviceId" : 1,
    "price" : 19000,
    "color" : "white"
}



## find all purchases


GET /api/purchases/find-all-purchases-of-user HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhYmRsIiwicm9sZXMiOiJST0xFX0FETUlOIiwidXNlcklkIjoxLCJleHAiOjE2NDk0MjU0ODJ9.2RoTRkm3XjZ87KHDA7jHclyUQb8Y5kwSQU8PVHGJKbXwxsD4L2f4Ob1jn9YFtOpJakvMtFLJNSdQPBHgn0gXRA



