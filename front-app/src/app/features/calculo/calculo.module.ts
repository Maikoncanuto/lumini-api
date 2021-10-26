import {CUSTOM_ELEMENTS_SCHEMA, NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {CalculoRoutingModule} from "./calculo-routing.module";
import {CalculoContainerComponent} from './containers/calculo-container/calculo-container.component';
import {CalculoRequestComponent} from './components/calculo-request/calculo-request.component';
import {CalculoResponseComponent} from './components/calculo-response/calculo-response.component';
import {MatCardModule} from "@angular/material/card";
import {ReactiveFormsModule} from "@angular/forms";
import {MatFormFieldModule} from "@angular/material/form-field";
import {MatInputModule} from "@angular/material/input";
import {MatTooltipModule} from "@angular/material/tooltip";
import {MatButtonModule} from "@angular/material/button";
import {MatIconModule} from "@angular/material/icon";
import {HttpClientModule} from "@angular/common/http";
import {CalculoService} from "./services/calculo.service";

@NgModule({
  declarations: [
    CalculoContainerComponent,
    CalculoRequestComponent,
    CalculoResponseComponent
  ],
  imports: [
    CommonModule,
    CalculoRoutingModule,
    HttpClientModule,
    MatCardModule,
    ReactiveFormsModule,
    MatFormFieldModule,
    MatInputModule,
    MatTooltipModule,
    MatButtonModule,
    MatIconModule,
  ],
  providers: [
    CalculoService
  ],
  schemas: [
    CUSTOM_ELEMENTS_SCHEMA
  ]
})
export class CalculoModule {
}
