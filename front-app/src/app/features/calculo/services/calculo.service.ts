import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {environment} from "../../../../environments/environment";
import {ResponseApi} from "../../../core/models/response-api.model";
import {CalculoRequest} from "../../../core/models/calculo-request.model";

@Injectable({
  providedIn: 'root'
})
export class CalculoService {

  constructor(private _http: HttpClient) {
  }

  public calcularMedia(calculo: CalculoRequest): Observable<ResponseApi> {
    return this._http.post<ResponseApi>(`${environment.URL_API_CALCULO}/calculos`, calculo);
  }
}
