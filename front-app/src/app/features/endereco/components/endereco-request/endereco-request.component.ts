import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-endereco-request',
  templateUrl: './endereco-request.component.html',
  styleUrls: ['./endereco-request.component.scss']
})
export class EnderecoRequestComponent implements OnInit {


  @Output() onSearch: EventEmitter<any> = new EventEmitter<any>();
  @Output() onCancel: EventEmitter<any> = new EventEmitter<any>();

  formGroup!: FormGroup;

  constructor(private formBuilder: FormBuilder) {
  }

  ngOnInit() {
    this.createForm();
  }

  createForm(): void {
    this.formGroup = this.formBuilder.group({
      cnpj: new FormControl('', [Validators.required, Validators.minLength(1), Validators.maxLength(18)]),
    });
  }

  search(cnpj: string): void {
    this.onSearch.emit(cnpj);
  }

  cancel(): void {
    this.onCancel.emit();
  }

  hasErros(controlName: string, errorName: string): any {
    return this.formGroup?.controls[controlName].hasError(errorName);
  }

}
