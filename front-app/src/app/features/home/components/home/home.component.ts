import {Component, EventEmitter, OnInit, Output} from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  @Output() onCalculoRedirect: EventEmitter<any> = new EventEmitter<any>();
  @Output() onEnderecoRedirect: EventEmitter<any> = new EventEmitter<any>();

  constructor() {}

  ngOnInit(): void {}

  navigateCalculo() {
    this.onCalculoRedirect.emit();
  }

  navigateEndereco() {
    this.onEnderecoRedirect.emit();
  }

}
