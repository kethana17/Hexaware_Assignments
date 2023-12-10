import { Component } from '@angular/core';
import { Player } from 'src/app/models/player';
import { PlayerService } from 'src/app/services/player.service';

@Component({
  selector: 'app-getall',
  templateUrl: './getall.component.html',
  styleUrls: ['./getall.component.css']
})
export class GetallComponent {
[x: string]: any;
  player:Player[] = [];

  constructor(private playerService:PlayerService){}

getAll(){
  
    this.playerService.getAll().subscribe( 
                              (list)=>{ this.player = list;  console.log(list)}
                              
    );

}
}
