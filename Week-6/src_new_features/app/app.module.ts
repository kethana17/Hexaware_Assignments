import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DemoComponent } from './demo/demo.component';
import { TestComponent } from './test/test.component';
import { HelloComponent } from "./hello/hello.component";

@NgModule({
    declarations: [
        AppComponent,
        DemoComponent,
        TestComponent
    ],
    providers: [],
    bootstrap: [AppComponent],
    imports: [
        BrowserModule,
        AppRoutingModule,
        HelloComponent
    ]
})
export class AppModule { }
