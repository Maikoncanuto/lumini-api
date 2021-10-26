import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {CalculoContainerComponent} from "./containers/calculo-container/calculo-container.component";

const routes: Routes = [
  {
    path: '',
    component: CalculoContainerComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
  providers: []
})
export class CalculoRoutingModule {
}
