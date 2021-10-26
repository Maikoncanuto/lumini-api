import {Component, Input, OnInit} from '@angular/core';
import {ResponseApi} from "../../../../core/models/response-api.model";

@Component({
  selector: 'app-endereco-response',
  templateUrl: './endereco-response.component.html',
  styleUrls: ['./endereco-response.component.scss']
})
export class EnderecoResponseComponent implements OnInit {

  @Input()
  resultado: ResponseApi | null | undefined;

  constructor() { }

  ngOnInit(): void {
  }

}
