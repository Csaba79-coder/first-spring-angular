import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { UserServiceComponent } from './user-service/user-service.component';
import {HttpClientModule} from "@angular/common/http";
import {UserService} from "./services/user.service";

@NgModule({
  declarations: [
    AppComponent,
    UserServiceComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
