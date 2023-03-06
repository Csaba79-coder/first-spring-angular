import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {User} from "../user-service/user";
import { map } from 'rxjs/operators';


@Injectable({
  providedIn: 'root'
})
export class UserService {

    private baseUrl = "http://localhost:8080/users";

    constructor(private httpClient: HttpClient) {
    }


    getAllUsers(): Observable<User[]> {
        // Uses the HttpClient service to send an HTTP GET request to the server
        return this.httpClient.get<User[]>(this.baseUrl)
            .pipe(
                // Maps the response to an array of User objects
                map(response => response)
            );
    }
}

