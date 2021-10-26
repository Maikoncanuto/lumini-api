import {ChangeDetectionStrategy, Component, OnInit} from '@angular/core';
import {Router} from "@angular/router";

@Component({
  selector: 'app-home-container',
  templateUrl: './home-container.component.html',
  styleUrls: ['./home-container.component.scss'],
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class HomeContainerComponent implements OnInit {

  constructor(private router: Router) {
  }

  ngOnInit(): void {}

  onCalculoRedirect() {
    this.router.navigate(['/calculos']);
  }

  onEnderecoRedirect() {
    this.router.navigate(['/enderecos']);
  }

}
