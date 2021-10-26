import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {HomeContainerComponent} from "./containers/home-container/home-container.component";

const routes: Routes = [
  {
    path: '',
    component: HomeContainerComponent
  },
  {
    path: 'calculos',
    loadChildren: () => import('../calculo/calculo.module').then(module => module.CalculoModule)
  },
  // {
  //   path: 'enderecos',
  //   loadChildren: () => import('../endereco/endereco.module').then(module => module.Endereco)
  // }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
  providers: []
})
export class HomeRoutingModule {
}
