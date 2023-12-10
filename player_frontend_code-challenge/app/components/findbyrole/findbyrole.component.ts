import { Component } from '@angular/core';
import { PlayerService } from 'src/app/services/player.service';

@Component({
  selector: 'app-findbyrole',
  templateUrl: './findbyrole.component.html',
  styleUrls: ['./findbyrole.component.css']
})
export class FindbyroleComponent {
  
  filteredPlayerList: any[] = [];
  searchRole: string = ''; 

  constructor(private playerService: PlayerService) {}

  applyRoleFilter() {
    this.playerService.findAllPlayerByRole(this.searchRole).subscribe(
      (data: any[]) => {
        console.log(data);
        this.filteredPlayerList = data;
      },
      (error) => {
        console.error('Error fetching players:', error);
        // Handle the error, e.g., show a user-friendly message
      }
    );
  }

}