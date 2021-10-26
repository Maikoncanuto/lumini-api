import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {EnderecoContainerComponent} from "./contaniners/endereco-container/endereco-container.component";

const routes: Routes = [
  {
    path: '',
    component: EnderecoContainerComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class EnderecoRoutingModule {
}
