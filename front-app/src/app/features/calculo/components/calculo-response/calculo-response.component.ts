import {Component, Input, OnInit} from '@angular/core';
import {ResponseApi} from "../../../../core/models/response-api.model";

@Component({
  selector: 'app-calculo-response',
  templateUrl: './calculo-response.component.html',
  styleUrls: ['./calculo-response.component.scss']
})
export class CalculoResponseComponent implements OnInit {

  @Input()
  resultado: ResponseApi | null | undefined;

  constructor() {
  }

  ngOnInit(): void {
  }

}
