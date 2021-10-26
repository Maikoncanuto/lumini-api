import {ChangeDetectionStrategy, Component, OnInit} from '@angular/core';
import {Router} from "@angular/router";
import {CalculoService} from "../../services/calculo.service";
import {CalculoRequest} from "../../../../core/models/calculo-request.model";
import {Observable} from "rxjs";
import {ResponseApi} from "../../../../core/models/response-api.model";

@Component({
  selector: 'app-calculo-container',
  templateUrl: './calculo-container.component.html',
  styleUrls: ['./calculo-container.component.scss'],
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class CalculoContainerComponent implements OnInit {

  $resultadoCalculo!: Observable<ResponseApi>;

  constructor(private router: Router, private calculoService: CalculoService) {
  }

  ngOnInit(): void {
  }

  onCancel() {
    this.router.navigate(['/']);
  }

  onCreate(calculo: CalculoRequest) {
    this.$resultadoCalculo = this.calculoService.calcularMedia(calculo);

    if (this.$resultadoCalculo === null || this.$resultadoCalculo === undefined) {
      this.$resultadoCalculo = new Observable<ResponseApi>();
    }
  }

}
