import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Task } from './task.model';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TaskService {

  private apiUrl = "http://localhost:8080/api/tasks";

  constructor(private httpClient:HttpClient) { } // httpClient:HttpClient this is a object this use for api integration 

  createTask(newTask : Task):Observable<Task>{
    return this.httpClient.post<Task>(this.apiUrl, newTask);
  }
}
