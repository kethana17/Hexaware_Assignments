import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule}  from '@angular/common/http'
import {FormsModule}  from '@angular/forms'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PlayerComponent } from './components/addplayer/addplayer.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { HomeComponent } from './components/home/home.component';
import { FindbyroleComponent } from './components/findbyrole/findbyrole.component';
import { GetallComponent } from './components/getall/getall.component';

@NgModule({
  declarations: [
    AppComponent,
    PlayerComponent,
    DashboardComponent,
    HomeComponent,
    FindbyroleComponent,
    GetallComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
