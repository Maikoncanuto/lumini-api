import {Component, OnInit} from '@angular/core';
import {EnderecoService} from "../../services/endereco.service";
import {Router} from "@angular/router";
import {Observable} from "rxjs";
import {ResponseApi} from "../../../../core/models/response-api.model";

@Component({
  selector: 'app-endereco-container',
  templateUrl: './endereco-container.component.html',
  styleUrls: ['./endereco-container.component.scss']
})
export class EnderecoContainerComponent implements OnInit {

  $responseApi!: Observable<ResponseApi>;

  constructor(private enderecoService: EnderecoService,
              private router: Router) {
  }

  ngOnInit(): void {
  }

  onSearch(objeto: any) {
    this.$responseApi = this.enderecoService.findEnderecoByCnpj(objeto.cnpj);
  }

  onCancel() {
    this.router.navigate(['/']);
  }

}
