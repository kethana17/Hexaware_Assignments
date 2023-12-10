import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Player } from 'src/app/models/player';



@Injectable({
  providedIn: 'root'
})

export class PlayerService {

  
  constructor(private http: HttpClient) { }
  addPlayer(body:Player):Observable<Player>{

    console.log(body);

      return this.http.post<Player>("http://localhost:8181/api/v1/player/addPlayer",body);

  }
  getAll():Observable<Player[]>{

    return this.http.get<Player[]>("http://localhost:8181/api/v1/player/getAllPlayer");

  }


findAllPlayerByRole(role: string): Observable<any[]> {
  return this.http.get<any[]>(`http://localhost:8181/api/v1/player/getallnames?role=${role}`);
}

}