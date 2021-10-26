import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {ResponseApi} from "../../../core/models/response-api.model";
import {environment} from "../../../../environments/environment";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class EnderecoService {

  constructor(private _http: HttpClient) {
  }

  public findEnderecoByCnpj(cnpj: string): Observable<ResponseApi> {
    return this._http.get<ResponseApi>(`${environment.URL_API_ENDERECO}/enderecos/${cnpj}`);
  }

}
