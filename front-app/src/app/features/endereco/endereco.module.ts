import {CUSTOM_ELEMENTS_SCHEMA, NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {MatCardModule} from "@angular/material/card";
import {ReactiveFormsModule} from "@angular/forms";
import {MatFormFieldModule} from "@angular/material/form-field";
import {MatInputModule} from "@angular/material/input";
import {MatTooltipModule} from "@angular/material/tooltip";
import {MatButtonModule} from "@angular/material/button";
import {MatIconModule} from "@angular/material/icon";
import {HttpClientModule} from "@angular/common/http";
import {EnderecoService} from "./services/endereco.service";
import {EnderecoContainerComponent} from "./contaniners/endereco-container/endereco-container.component";
import {EnderecoRequestComponent} from "./components/endereco-request/endereco-request.component";
import {EnderecoResponseComponent} from "./components/endereco-response/endereco-response.component";
import {EnderecoRoutingModule} from "./endereco-routing.module";

@NgModule({
  declarations: [
    EnderecoContainerComponent,
    EnderecoRequestComponent,
    EnderecoResponseComponent
  ],
  imports: [
    CommonModule,
    EnderecoRoutingModule,
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
    EnderecoService
  ],
  schemas: [
    CUSTOM_ELEMENTS_SCHEMA
  ]
})
export class EnderecosModule {
}
