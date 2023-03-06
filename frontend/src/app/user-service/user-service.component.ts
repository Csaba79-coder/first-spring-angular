import { Component, OnInit } from '@angular/core';
import {UserService} from "../services/user.service";
import {User} from "./user";

@Component({
  selector: 'app-user-service',
  templateUrl: './user-service.component.html',
  styleUrls: ['./user-service.component.css']
})
export class UserServiceComponent implements OnInit{

  users: User[] = [];
  constructor(private userService: UserService) {

  }

  ngOnInit(): void {
    this.listUsers();
  }

  private listUsers() {
    this.userService.getAllUsers().subscribe(
        data => {
          this.users = data;
        }
    );
  }
}
