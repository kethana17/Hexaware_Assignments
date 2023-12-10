import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PlayerComponent } from './components/addplayer/addplayer.component';
import { HomeComponent } from './components/home/home.component';
import { GetallComponent } from './components/getall/getall.component';
import { FindbyroleComponent } from './components/findbyrole/findbyrole.component';


const routes: Routes = [
  
  {path:'',component:HomeComponent},
  {path:'add',component:PlayerComponent},
  {path:'display',component:GetallComponent},
  {path:'getallnames',component:FindbyroleComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
