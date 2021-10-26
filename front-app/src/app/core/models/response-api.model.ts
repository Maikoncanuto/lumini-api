import {ResponseApiErro} from "./response-api-erro.model";

export interface ResponseApi {
  data: any;
  erros: Array<ResponseApiErro>;
}
